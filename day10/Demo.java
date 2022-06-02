package day10;
import java.util.Scanner;
public class Demo {
	public Hotel provideFood(int amount) {
		if(amount > 1000) {
//			System.out.println("hello");
			return new TajHotel();
			
		}
		else if (amount <= 1000 && amount > 200) {
			return new RoadSideHotel();
		}
		else {
			System.out.println("Please Provide amount greater than 200$");
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Demo p1=new Demo();
		System.out.println("Enter Amount");
//		scn.nextInt();
		int A=scn.nextInt();
//		System.out.println(A);
		Hotel h1=p1.provideFood(A);
		h1.chickenBiryani();
	}
}
