
public class StringReverse {

	public static void main(String[] args) {
		String s="Hello";
		byte[] strAsByte= s.getBytes();
		byte [] result= new byte[strAsByte.length];
		for(int i=0;i<strAsByte.length;i++){
		    result[i]= strAsByte[strAsByte.length-i-1];
		}
		System.out.println(new String(result));
		
		StringBuilder s1= new StringBuilder("World");
		s1.reverse();
		System.out.println(s1);
	}
}
