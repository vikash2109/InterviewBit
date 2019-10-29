

	import java.util.Arrays;
	public class LongestIncreasingSubSequence
	{
		public static void main(String[] args) {
			int  A[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
			int n= A.length;
			int dp[]= new int [n];
			Arrays.fill(dp,1);
			
			for(int i=1;i<n;i++){
			    for(int j=0;j<i;j++){
			        if(A[j]<A[i])
			            if(dp[j]+1>dp[i])
			                dp[i]=dp[j]+1;
			    }
			}
			Arrays.sort(dp);
			System.out.println(dp[n-1]);
		}
	}

