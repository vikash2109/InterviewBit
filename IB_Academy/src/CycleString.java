
public class CycleString {

	public static void main(String[] args) {
		
String s1="ABCD" ,s2="CDAB";
		
		if(ans(s1,s2))
		System.out.println("yes");
		else
		System.out.println("No");
	}
	
	static boolean ans(String s1,String s2){
	    if (s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1)
	    return true;
	    else
	    return false;
	}

}
