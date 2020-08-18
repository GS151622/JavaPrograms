/**
 * 
 */
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author SHARMSX14
 *
 */
public class ArrayListCol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		//Add some elements to arraylist
		int i = 0;
		while(i<20) {
			al.add(++i);
		}
		
		System.out.println(al);
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.print((Integer)it.next());
			
			if(it.hasNext()) {
				System.out.print(", ");
			}
		}
	}

}
