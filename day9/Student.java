package day9;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public void displayDetails(int roll, String name, int marks) {
		
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
	public void setMarks(int marks) {
		if(marks >= 500) {
			System.out.println("Grade is A");
		}
		else if(marks < 500 && >= 400) {
			System.out.println("Grade is B");
		}
		else (marks <400){
			System.out.println("Grade is C");
		}
	}
	private char calculateGrade(char grade) {
		
	}

}
