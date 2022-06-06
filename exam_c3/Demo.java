package exam_c3;
import java.util.Scanner;
public class Demo {
	void showDetails(Month m) {
		if(Month.JAN==m) {
			System.out.println("This is the 1st Month of the Year January");
		}
		else if(Month.FEB==m) {
			System.out.println("This is the 2nd Month of the Year Feburary");
		}
		else if(Month.MAR==m) {
			System.out.println("This is the 3rd Month of the Year MARCH");
		}
		else if(Month.APR==m) {
			System.out.println("This is the 4th Month of the Year APRIL");
		}
		else if(Month.MAY==m) {
			System.out.println("This is the 5th Month of the Year MAY");
		}
		else if(Month.JUN==m) {
			System.out.println("This is the 6th Month of the Year JUNE");
		}
		else if(Month.JUL==m) {
			System.out.println("This is the 7th Month of the Year JULY");
		}
		else if(Month.AUG==m) {
			System.out.println("This is the 8th Month of the Year AUGUST");
		}
		else if(Month.SEP==m) {
			System.out.println("This is the 9th Month of the Year SEPTMBER");
		}
		else if(Month.OCT==m) {
			System.out.println("This is the 10th Month of the Year OCTOBER");
		}
		else if(Month.NOV==m) {
			System.out.println("This is the 11th Month of the Year NOVEMBER");
		}
		else {
			System.out.println("This is the 12th Month of the Year DECEMBER");
		}

	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Month");
		String mon=scn.next();
		Month m=Month.valueOf(mon);
		d1.showDetails(m);
		
	}
}
