
	import java.util.Arrays;
	public class Lcs
	{
		public static void main(String[] args) {
			String A="ABCDGH";
			String B="EADFHR";
			int m=A.length();
		    int n= B.length();
		    int dp[][]= new int[m][n];
		     
		    for(int i=0;i<m;i++)
		    Arrays.fill(dp[i],-1);
			
			System.out.println(lcs(A,B,m-1,n-1,dp));
		}
		
		static int lcs(String A, String B, int i, int j, int[][] dp){
		    
		    int res=0;
		    if(i<0 || j<0) return 0;
		    
		    if(dp[i][j]!=-1) return dp[i][j];
		    
		    if(A.charAt(i)==B.charAt(j)){
		        dp[i][j]= 1+lcs(A,B,i-1,j-1,dp);
		        return dp[i][j];
		    }
		    
		    else{
		        dp[i][j]= Math.max(lcs(A,B,i-1,j,dp),lcs(A,B,i,j-1,dp));
		        return dp[i][j];
		    }
		    
		   
		}
	}


