import java.util.*;
public class sumOfNaturalNo {
	public static int naturalsum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of n");
		int n=sc.nextInt();
		sc.close();
		System.out.println(naturalsum(n));
	}
}
