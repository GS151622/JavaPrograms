package javaprograms;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class RemDupCharsFromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "w3School";
		System.out.println(removeDupsUsingList(str));
		System.out.println(removeDupsUsingBoolArray(str));
		System.out.println(removDups(str));
	}
	
	public static String removeDupsUsingList(String str) {
		String retstring = "";
		char arr[] = str.toCharArray();

		List<Character> arrlist = new ArrayList<>();
		
		for(char c: arr) {
			if(!arrlist.contains(c))
				arrlist.add(c);
		}
		
		Iterator<Character> itr = arrlist.iterator();
		
		while(itr.hasNext()) {
			retstring += itr.next();
		}
		
		return retstring;		
	}
	
	public static String removeDupsUsingBoolArray(String str) {
		String retstring = "";
		
		char arr[] = str.toCharArray();
		boolean barr[] = new boolean[arr.length];
		
		for(int i = 0; i<arr.length; i++)
			barr[i] = true; //Assuming all chars are unique
		
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j])
					barr[j] = false; //the char at this index is duplicate, mark the flag as false
			}
		}
		
		for(int i=0; i<barr.length; i++)
			if(barr[i] == true)
				retstring += arr[i];
		
		return retstring;
	}
	
	public static String removDups(String str) {
		String retstring = "";
		char arr[] = str.toCharArray();
		
		for(char ch : arr)
			if(retstring.indexOf(ch) == -1)
				retstring += ch;
		
		return retstring;
	}
}