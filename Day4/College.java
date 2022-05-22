package com.masai.Day4;

public class College {
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRoll(101);
		s1.setAge(23);
		System.out.println("before name");
		s1.setName("Pranshu");
		
		s1.setMarks(99);
		
		Student s2=new Student(25,"Allu",102,80);
		System.out.println("Student Details For S1");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRoll());
		System.out.println(s1.getMark());
		System.out.println("Student Details For S2");
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getRoll());
		System.out.println(s2.getMark());
	}

}
