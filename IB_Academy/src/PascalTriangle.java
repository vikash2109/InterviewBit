
	import java.util.Scanner;
	public class PascalTriangle
	{
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			int n=s.nextInt();
			
			pascalTriangle(n);
			//s.nextLine();
		}
		
		static void pascalTriangle(int n){
		   
		    for(int line=0;line<n;line++){
		        for(int j=0;j<=line;j++){
		            
		            System.out.print(binomialCoeff(line,j )+ " ");
		        }
		        System.out.println();
		    }
		}
		
		static int binomialCoeff(int n, int k){
		    int res=1;
		    if( k > n-k )
		    k = n-k;
		    
		    for(int i=0;i<k;i++){
		        res *= (n-i);
		        res /=(i+1);
		    }
		    return res;
		}
	}

