import java.util.Scanner;

public class calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select an operation:\n"+
		"1.addition\n"+
		"2.substraction\n"+
		"3.multiplication\n");
		int operation=sc.nextInt();
		if(operation!=1&&operation!=2&&operation!=3) {
			System.out.println("Invalid input");
		}
		else {
			System.out.println("Please enter the first value a:");
			int a=sc.nextInt();
			System.out.println("Please enter the value of b:");
			int b=sc.nextInt();
			sc.close();
			if(operation==1) {
				System.out.println(a+b);
			}
			else if(operation==2) {
				System.out.println(a-b);
			}
			else {
				System.out.println(a*b);
			}
		}
		
	}
}
