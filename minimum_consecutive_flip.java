
public class minimum_consecutive_flip {
	public static void min(int a[],int n) {
		for(int i=1;i<n;i++) {
			if(a[i]!=a[0]) {
				System.out.println(i+" "+"to");
			}
			else {
				System.out.println(i-1);
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,0,1,1,1,1};
		int n=a.length;
		min(a,n);
	}
}
