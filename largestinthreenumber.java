
public class largestinthreenumber {
	public static void largest(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
	}
	public static void main(String args[]) {
		int a=7;
		int b=4;
		int c=10;
		largest(a,b,c);
	}
}
