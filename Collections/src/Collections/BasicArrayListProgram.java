package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicArrayListProgram obj = new BasicArrayListProgram();
		obj.ArrayListFunctionsTesting();
	}
	
	@SuppressWarnings("unchecked")
	void ArrayListFunctionsTesting() {
		ArrayList <String> ar = new ArrayList<String>();
		
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("White");
		ar.add("Yellow");
		
		System.out.println(ar);
		
		//Iterate through the list using iterator
		Iterator<String> itr = ar.iterator();
		
		while(itr.hasNext()) {
			System.out.println((String)itr.next());
		}
		
		//Add element at begining of list
		ar.add(0, "Black");
		System.out.println(ar);
		
		//Get the element from 0th index
		String s = (String)ar.get(0);
		System.out.println(s);
		
		//Update element at index 5
		ar.set(5, "Violet");
		System.out.println(ar);
		
		//Remove the element from 3rd index
		ar.remove(3);
		System.out.println(ar);
		
		//Search for element in an array list
		boolean b = ar.contains("White");
		System.out.println(b);		
		
		//Perform default natural sort
		Collections.sort(ar);
		System.out.println(ar);
		
		//Sort in descending order using comparator interface implementation
		ar.sort(new myClass());
		System.out.println(ar);
		
		//Copy array list into another
		List<String> ar1 = new ArrayList<String>(ar);
		System.out.println(ar1);
		//or
		Collections.copy(ar1, ar);
		System.out.println(ar1);
		
		//Shuffle the elements in the list
		Collections.shuffle(ar1);
		System.out.println(ar1);
		
		//Reverse elements
		Collections.reverse(ar1);
		System.out.println(ar1);
		
		//Compare two array lists
		List<Boolean> bl = new ArrayList<Boolean>();
		for(String str: ar) {
			bl.add(ar1.contains(str)? true:false);
		}
		System.out.println(bl);
		
		//Extract a portion of a list
		List<String> l1 = ar1.subList(2, 4);
		System.out.println(l1);
		
		//Swap two elements in a list
		System.out.println("Before swap: "+ar1);
		Collections.swap(ar1, 2, 4);
		System.out.println("After swap: "+ar1);
		
		//Join two array lists
		List<String> l2 = new ArrayList<String>();
		l2.addAll(ar);
		l2.addAll(ar1);
		System.out.println(l2);
		
		//Clone array list
		ArrayList <String> ar2 =  new ArrayList<String>();
		ar2 = (ArrayList <String>) ar.clone();
		System.out.println(ar2);
		
		//Clear array list
		ar2.clear();
		System.out.println(ar2);
		ar1.removeAll(ar1);
		System.out.println(ar1);
		
		if(ar2.isEmpty())
			System.out.println("ar2 is empty");
		
		System.out.println("Size: " + ar.size());
		ar.trimToSize();
		
		ar.ensureCapacity(100);
		
		//replace 2nd index element value
		System.out.println(ar);
		ar.set(2, "Purple");
		System.out.println(ar);
		
		for(int i = 0; i<ar.size(); i++)
			System.out.print(ar.get(i) +"-");

	}

	class myClass implements Comparator <String> {
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
		//return o2.compareTo(o1);
//		if(o1.compareTo(o2) < 0)
//			return 1;
//		else if(o1.compareTo(o2) > 0)
//			return -1;
//		else
//			return 0;
	}
}
	
}
