package javaprograms;
import java.util.Scanner;

/**
 * 
 */


//PROBLEM STATEMENT
/*
 Joseph and Jane are making a contest for apes. During the process, 
 they have to communicate frequently with each other. Since they are not completely human, they cannot speak properly. 
 They have to transfer messages using postcards of small sizes. To save space on the small postcards, they devise a string 
 compression algorithm:
 If a character, , occurs  times in a row, then it will be represented by , where  is the value of . 
 For example, if the substring is a sequence of  'a' ("aaaa"), it will be represented as "a4".

 If a character, , occurs exactly one time in a row, then it will be simply represented as . 
 For example, if the substring is "a", then it will be represented as "a".

  Help Joseph to compress a message, msg.

Input

The only line of input contains a string, msg.

Output

Print the string msg as a compressed message.

Constraints

msg consists of lowercase English characters () only.
Sample Input #00

abcaaabbb
Sample Output #00

abca3b3
Sample Input #01

abcd
Sample Output #01

abcd
Sample Input #02

aaabaaaaccaaaaba
Sample Output #02

a3ba4c2a4ba
Explanation
Sample Case #00: msg = "". Here, the first  characters occur exactly once, and the rest of them occur  times in a sequence.

Sample Case #01: msg = "". As there is no multiple consecutive occurrence of any character, the compressed message will be same as original one.

Sample Case #02: msg = "". In the first 3 occurrences, 'a' is repeated  times, while in the last occurrence, there is only one 'a'. Also,'c' occurs two times, and 'b' occurs one time in both occurrences.
 */


public class StringCompression1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "aaabaaaaccaaaaba";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		if(str.length() == 0)
			return;
		char ar[] = str.toCharArray();
		String retStr = "";
		
		int i = 1;
		int count = 1;
		char ch = ar[0];
		char prevCh = ar[0];
		while(i < ar.length) {
			ch = ar[i];
			
			if(prevCh != ch) {
				if(count != 1)
					retStr = retStr + Character.toString(prevCh) + Integer.toString(count);
				else
					retStr = retStr + Character.toString(prevCh);
				
				count = 1;
				prevCh = ch;
			}
			else {
				++count;
			}
			++i;
		}
		if(count != 1)
			retStr = retStr + Character.toString(prevCh) + Integer.toString(count);
		else
			retStr = retStr + Character.toString(prevCh);
		
		System.out.println(retStr);
		sc.close();
	}
}
