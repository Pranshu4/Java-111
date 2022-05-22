package com.masai.Day4;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age=age;
		}
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks=marks;
		}
	}
	public int getRoll() {
		return roll;
	} 
	public String getName() {
		return name;
	} 
	public int getAge() {
		return age;
	} 
	public int getMark() {
		return marks;
	}
	public Student(int roll, String name, int age, int marks){
		this.age=age;
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	public Student() {
		System.out.println("hello");
	}

}
