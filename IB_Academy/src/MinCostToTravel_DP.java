	import java.util.Arrays;
	public class MinCostToTravel_DP
	{
		public static void main(String[] args) {
			int cost[][]={ {1,2,3},
			               {4,8,2},
			               {1,5,3}	};
			 System.out.println(findMin(cost));
		}
		
		static int findMin(int cost[][]){
		    
		    int m=cost.length;
		    int n=cost[0].length;
		    
		    if(n<0 ||m<0) return -1;
		    if(n==0 || m==0) return cost[m][n];
		    
		    int dp[][]= new int[m][n];
		    
		    for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		            
		            if(i==0 && j==0)
		            dp[i][j]=cost[i][j];
		            
		            else if(j==0)
		            dp[i][j]= cost[i][j] + dp[i-1][j];
		            
		            else if(i==0)
		            dp[i][j]= cost[i][j] + dp[i][j-1];
		            
		            else
		            dp[i][j]= Math.min(dp[i-1][j],dp[i][j-1])+ cost[i][j];
		        }
		    }
		    
		    return dp[m-1][n-1];
		}
	}


