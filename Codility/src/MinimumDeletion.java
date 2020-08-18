import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

//Samsung
public class MinimumDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbccc";
		int num = solution(str);
		System.out.println(num);
	}
	
	@SuppressWarnings("unchecked")
	public static int solution(String S) {
        // write your code in Java SE 8
        
        int lenString = S.length();
        
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for(int i = 0; i<lenString; i++)
        {
        	char c = S.charAt(i);
        	charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }
        
        int count = 0;
        
        PriorityQueue prQue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(Map.Entry<Character, Integer> m: charMap.entrySet())
        {
        	prQue.add(m.getValue());
        }
        
        while (prQue.size() != 0)
        {
        	int ii = (int) prQue.poll();
        	if(prQue.size() == 0)
        	{
        		return count;
        	}
        	else
        	{
	        	if(ii == (int)prQue.peek())
	        	{
	        		if(ii > 1)
	        		{
	        			prQue.add(ii-1);
	        		}
	        		count++;
	        	}
        	}
        }
        return count;
    }
}
