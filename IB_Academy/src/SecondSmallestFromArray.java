
public class SecondSmallestFromArray {
	
		public static void main(String[] args) {
		int [] arr= {-12,23,34,-51,13,17,83,99};
		int res= find2ndSmall(arr, arr.length);
		System.out.println(res);
		}
		
		static int find2ndSmall(int []arr,int n){
		    int small=Integer.MAX_VALUE, small2=Integer.MAX_VALUE;
		    
		    for(int i=0;i<n;i++){
		        if(arr[i]<small) //for 2nd smallest just use lessthan sign
		        {
		            small2=small;
		            small=arr[i];
		        }
		        else if(arr[i]>small && arr[i]<small2)
		        small2=arr[i];
		    }
		    return small2;
		}
	}

