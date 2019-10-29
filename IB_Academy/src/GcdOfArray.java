
public class GcdOfArray {

	public static void main(String[] args) {
		int [] Arr= {10,15,25,50};
		int result= findGCD(Arr, Arr.length);
		System.out.println(result);
	}
	
	static int findGCD(int [] Arr, int n){
	    int res=Arr[0]; 
	    for(int i=1;i<n;i++)
	    res= gcd(Arr[i],res);
	    return res;
	}
	
	static int gcd(int a,int b){
	    if(a==0) return b;
	    if (b==0) return a;
	    if(a==b) return a;
	    
	    if(a<b) 
	    return gcd(a, b%a);
	    return gcd(a%b,b);
	    
	}
}
