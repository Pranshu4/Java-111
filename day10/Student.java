package day10;

public abstract class Student {
	String name;
	String address;
	
	abstract double getPercentage( );
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
//	public Student getObj() {
//		return new Student();
//	}

	
	
}
