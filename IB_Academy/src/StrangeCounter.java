import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int time= scan.nextInt();
		
		int nums=3;
		while(time>nums) {
			time=time-nums;
			nums*=2;
		}
		
		System.out.println(nums-time+1);

	}

}
