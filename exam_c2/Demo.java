package exam_c2;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int sum=0;
		System.out.println("enter no. of Student object");
		Student[] s1=new Student[scn.nextInt()];
		for (int i = 0; i < s1.length; i++) {
			s1[i]=new Student();
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Enter the detailes of the student");
			System.out.println("Enter Roll: ");
			s1[i].setRoll(scn.nextInt());
			System.out.println("Enter Marks: ");
			s1[i].setMarks(scn.nextInt());
			scn.nextLine();
			System.out.println("Enter Name: ");
			s1[i].setName(scn.nextLine());
			scn.nextLine();
			System.out.println("Enter Address: ");
			s1[i].setAddress(scn.nextLine());
			
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Student Detiles"+(i+1));
			System.out.println("Name ="+s1[i].getName());
			sum=sum+s1[i].getMarks();
			System.out.println("Roll="+s1[i].getRoll());
			System.out.println("Marks="+s1[i].getMarks());
			System.out.println("Address= "+s1[i].getAddress());
		}
		System.out.println("Av. Marks= "+sum/s1.length);
		
				
	}
}
