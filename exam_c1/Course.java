package exam_c1;
 import java.util.Scanner;
public class Course {
	int courseId ;
	String courseName;
	int courseFee;
	public void displayCourseDetails() {
		System.out.println("Course Id: "+courseId);
		System.out.println("Course Name: "+courseName);
		System.out.println("Course Fee: "+courseFee);
	}
	public static void authenticate(String username, String password) {
		if(username=="Admin" && password=="1234") {
			Course s1=new Course();
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter Course Id");
			s1.courseId=scn.nextInt();
			System.out.println("Enter Course Name");
			s1.courseName=scn.nextLine(); scn.nextLine();
			System.out.println("Enter Course Fee");
			s1.courseFee=scn.nextInt();
			s1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		authenticate("Admin","12345");
		
	}

}
