package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/*
Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.

-->The required classes for reflection are provided under java.lang.reflect package.
-->Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object.
-->Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.
*/
public class ReflectionDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		
		//Getting class information
		Class cls = sample.getClass();
		System.out.println("Name of class: "+cls.getName());
		
		//Constructor constructor = cls.getConstructor();
		//System.out.println("Name of constructor: "+constructor.getName());
		
		//Getting all constructors
		Constructor[] constructor = cls.getConstructors();
		for(Constructor c: constructor)
			System.out.println("Name of constructor: "+c.getName());
		
		//Gettign all methods
		Method[] methods = cls.getMethods();
		for(Method m:methods) {
			System.out.println("Method name: "+m.getName());
		}
		
		//Passing string to method
		Method m1 = cls.getDeclaredMethod("fun1", String.class);
		m1.invoke(sample, "Hi World!!!");
		
		//Accessing private attribute/member variables
		Field f1 = cls.getDeclaredField("str");
		f1.setAccessible(true);
		f1.set(sample, "Well done!!!");
		sample.display();
		
		//Accessing private method
		Method mm = cls.getDeclaredMethod("fun");
		mm.setAccessible(true);
		mm.invoke(sample);
	}

}
