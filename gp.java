import java.util.Scanner;

public class gp {
	public static int nth(int a,int r,int n) {
		int ans=a*(int)(Math.pow(r, n-1));
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the vlaue of a");
		int a=sc.nextInt();
		System.out.println("Please enter the value of r");
		int r=sc.nextInt();
		System.out.println("Please enter the valuse of n");
		int n=sc.nextInt();
		sc.close();
		System.out.println(nth(a,r,n));
		
	}
}
