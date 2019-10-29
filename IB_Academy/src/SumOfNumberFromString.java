
public class SumOfNumberFromString {

	public static void main(String[] args) {
		String s="12abc20yz68";
		System.out.println(findSum(s));
	}
	
	static int findSum(String s){
	    String temp="";
	    int sum=0;
	    
	    for(int i=0;i<s.length();i++){
	        char c= s.charAt(i);
	        if(Character.isDigit(c)){
	            temp+= c;
	        }
	        else{
	            sum += Integer.parseInt(temp);
	            temp="0";
	        }
	    }
	    return sum + Integer.parseInt(temp);
	}
}
