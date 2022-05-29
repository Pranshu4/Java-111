package day7;
 

public class Student {
	int stuId;
	String studName;
	double examFee;
	
double payFee(double fee) {
		return examFee-fee;
	}
public Student() {
	
}
	void displayDetails() {
		System.out.println("Name :"+this.studName);
		System.out.println("Student Id :"+this.stuId);
		System.out.println("Exam Fee :"+this.examFee);
	}
	
}
