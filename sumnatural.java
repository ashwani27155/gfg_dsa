import java.util.Scanner;

public class sumnatural {
	public static int sum(int n)
	{
		return n*(n+1)/2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the valuse n:");
		int n=sc.nextInt();
		sc.close();
		System.out.println(sum(n));
	}
}
