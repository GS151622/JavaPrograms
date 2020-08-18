package reflection;

public class Sample {
	private String str;
	
	public Sample() {
		str = "Hello World!!!";
	}
	
	public Sample(String s) {
		str = s;
	}
	
	public Sample(String s1, String s2) {
		str = s1+s2;
	}
	
	private void fun() {
		System.out.println("This is private method (fun)");
	}
	
	public void fun1(String ss) {
		System.out.println(ss);
	}
	
	public void fun2(int num) {
		System.out.println(num);
	}
	
	public void display() {
		System.out.println(str);
	}
}
