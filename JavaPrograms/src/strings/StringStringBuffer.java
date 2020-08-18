package strings;

public class StringStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String ("Hello");
		str = str.concat(" World!!!");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World!!!");
		System.out.println(sb);
	}

}
