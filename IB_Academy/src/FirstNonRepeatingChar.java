import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.next();
		LinkedHashMap <Character, Integer> hm= new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i)))
				hm.computeIfPresent(str.charAt(i), (k,v)-> v+1);
			
			else
				hm.put(str.charAt(i), 1);
		}
		for(Entry<Character, Integer> e: hm.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				break;
			}			
		}
		
	}
}


