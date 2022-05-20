package com.masai;

public class StudentObjectDetails {
	int roll;
	String name;
	int marks;
	static int score=100;
  void displayStudentDetails(){
	  System.out.println("Roll is :"+roll);
	  System.out.println("Name is :"+name);
	  System.out.println("Marks is :"+marks);
	  System.out.println(score);
  }

	public static void main(String[] args) {
		
		
		StudentObjectDetails s1= new StudentObjectDetails();
		StudentObjectDetails s2=new StudentObjectDetails();
		s1.roll=10;
		s1.name="Pranshu";
		s1.marks=100;
		s1.displayStudentDetails();
		System.out.println("=======================================");
		s2.roll=007;
		s2.name="Allu";
		s2.marks=96;
		s2.displayStudentDetails();
		
	}

}