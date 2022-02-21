import java.util.Scanner;

public class lastdigit {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of number");
		int num=sc.nextInt();
		sc.close();
		int ans=num%10;
		System.out.println(ans);
	}
}
