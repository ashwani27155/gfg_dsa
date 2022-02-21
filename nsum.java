import java.util.Scanner;
public class nsum {
	public static void sum(int num) {
		
		if(num<0) {
			System.out.println("!Error number is less than zero");
		}else {
			System.out.println(num*(num+1)/2);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of number:");
		int num=sc.nextInt();
		sc.close();
		sum(num);
	}
}
