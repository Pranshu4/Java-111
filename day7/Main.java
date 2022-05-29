package day7;

public class Main {
	public static void main(String[] args) {
		Employee E1=new Employee();
		Manager M1=new Manager();
		E1.age=24;
		E1.address="Delhi";
		E1.name="Pranshu";
		E1.salary=20000.0;
		E1.Specialisation="IT Specilist";
		M1.age=26;
		M1.address="Noida";
		M1.name="Allu";
		M1.salary=260000.0;
		M1.Department="IT Department";
		System.out.println("For Employee");
		System.out.println("Age :"+E1.age);
		System.out.println("Name :"+E1.name);
		System.out.println("Address :"+E1.address);
		System.out.println("Specilisation :"+E1.Specialisation);
		E1.printSalary();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("For Manager");
		System.out.println("Age :"+M1.age);
		System.out.println("Name :"+M1.name);
		System.out.println("Address :"+M1.address);
		System.out.println("Specilisation :"+M1.Department);
		M1.printSalary();
	}
}