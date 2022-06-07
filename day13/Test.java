package day13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=0;
		int num2=0;
		try {
			num1 = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Please enter valid number");
		}
		System.out.println("Enter num2");
		try {
			num2 = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("“num2 should not be 0”");
		}
		String message = null;
		int num3 = num1 / num2;
		try {
			if(num3 > 10){
				message = "Welcome to Exception Handling ";
				System.out.println(message);
				}
		}
		catch(Exception e) {
			System.out.println(" String value is null");
		}
		
		System.out.println("Message is :"+message.toUpperCase());
		System.out.println("end of main");
	}
}
