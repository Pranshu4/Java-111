package day9;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public void displayDetails(Student s1) {
	System.out.println("Roll: "+s1.getRoll());
	System.out.println("Name: "+ s1.getName());
	System.out.println("Marks: "+s1.getMarks());
	System.out.println("Grade: "+s1.calculateGrade());
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
//	public void setMarks(int marks) {
//		if(marks >= 500) {
//			System.out.println("Grade is A");
//		}
//		else if(marks < 500 && marks > 400) {
//			System.out.println("Grade is B");
//		}
//		else if (marks <400){
//			System.out.println("Grade is C");
//		}
//	}
	private char calculateGrade() {
		if(marks >= 500) {
//			System.out.println("Grade is A");
			return 'A';
		}
		else if(marks < 500 && marks > 400) {
//			System.out.println("Grade is B");
			return 'B';
		}
		else if (marks <400){
//			System.out.println("Grade is C");
			return 'C';
		}
		else {
			return 'F';
		}
	}
	public Student(int roll, String name, int marks, char grade) {
//		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	

}
