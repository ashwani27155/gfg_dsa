import java.util.Scanner;

public class fivepair {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the valuse of x and y:");
		
		
		for(int i=0;i<5;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(y==0) {
				continue;
			
			}
			System.out.println(x/y);
		}
	}
}
