
public class SecondLargestFromArray
{
	public static void main(String[] args) {
	int [] arr= {12,23,34,51,13,17,83,99};
	int res= find2ndLarge(arr, arr.length);
	System.out.println(res);
	}
	
	static int find2ndLarge(int []arr,int n){
	    int large=Integer.MIN_VALUE, large2=Integer.MIN_VALUE;
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]>large) //for 2nd smallest just use less than sign
	        {
	            large2=large;
	            large=arr[i];
	        }
	        else if(arr[i]<large && arr[i]>large2)
	        large2=arr[i];
	    }
	    return large2;
	}
}

