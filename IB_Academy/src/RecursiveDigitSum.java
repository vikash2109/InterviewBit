import java.util.Scanner;

public class RecursiveDigitSum {

	public static void main(String args[]) {
		
		Scanner scan= new Scanner(System.in);
		String s=scan.next();
		int n= scan.nextInt();
		
		int digSum= Integer.parseInt(sepSum(s));
		digSum *=n;
		
		String res= Integer.toString(sepSum(digSum));
		System.out.println(res);
		
	}
	
	static String sepSum (String s) {
		if(s.length()==1) return s;
		else {
			int np=0;
			for(int i=0;i<s.length();i++) {
				np+= Character.getNumericValue(s.charAt(i));
			}
			return sepSum(Integer.toString(np));
		}
		
	}
	
	static int sepSum( int n) {
		if(n/10==0) return n;
		else {
			int r=0;
			while(n>0) {
				r+=n%10;
				n/=10;
			}
			return sepSum(r);
		}
	}
	
	
}
