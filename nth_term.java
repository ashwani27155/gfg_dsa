import java.util.*;

public class nth_term {
 public static int nth(int a,int d,int n) {
	 int ans=a+(n-1)*d;
	 return ans;
 }
 	public static void main(String args[]) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Please enter the vlaue of a:");
		 int a=sc.nextInt();
		 System.out.println("Please enter the value of n:");
		 int n=sc.nextInt();
		 System.out.println("Please enter the value of d:");
		 int d=sc.nextInt();
		 sc.close();
		 System.out.println(nth(a,d,n));
 }
}
