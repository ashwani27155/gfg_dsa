import java.util.*;
public class countdigit {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of number:");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num>0) {
			num=num/10;
			count=count+1;
		}
		System.out.println(count);
	}
}
