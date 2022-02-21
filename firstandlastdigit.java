import java.util.Scanner;
public class firstandlastdigit {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the valuse of number");
		int num=sc.nextInt();
		sc.close();
		int last=num%10;
		while(num>=10) {
			num=num/10;
		}
		System.out.println(num);
		System.out.println(last);
	}
}
