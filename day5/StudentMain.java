package day5;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s1=new Student[3];
		s1[0]=new Student();
		s1[1]=new Student();
		s1[2]=new Student();
//		s1[3]=new Student();
//		System.out.println(s1);
//		System.out.println(s1[0]);
//		System.out.println(s1[1]);
//		System.out.println(s1[2]);
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s1.length;i++) {
			System.out.println("Details for Student "+(i+1));
			System.out.println("Enter roll no");
			
			int a=sc.nextInt();
			s1[i].setRoll(a);
			System.out.println("Enter Marks");
			int b=sc.nextInt();sc.nextLine();
			
			System.out.println("Enter Name");
			String c=sc.nextLine(); sc.nextLine();
			s1[i].setName(c);
			System.out.println("Enter Address");
			String d=sc.nextLine(); sc.nextLine();
			
			s1[i].setAddress(d);
			
			s1[i].setMarks(b);
			
		}
		for(int j=0;j<s1.length;j++) {
			System.out.println("Student Details"+(j+1));
			System.out.println("My Marks:"+s1[j].getMarks());
			System.out.println("My Roll:"+s1[j].getRoll());
			System.out.println("My Name:"+s1[j].getName());
			System.out.println("My Address:"+s1[j].getAddress());
			System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
		}
	}

}
