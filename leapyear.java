import java.util.*;
public class leapyear {
	public static void leap(int year) {
		if(year%4==0&&year%100!=0) {
			System.out.println("year is leap year");
		}
		else if(year%400==0) {
			System.out.println("year is leap year");
		}else {
			System.out.println("oh! year is not leap year");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of year");
		int year=sc.nextInt();
		sc.close();
		leap(year);
	}
}
