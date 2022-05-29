package day5;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void calculateNetSalary(int pfpercentage){
		this.netSalary =(salary-(salary*pfpercentage/100) );
		System.out.println("Id:"+this.employeeId);
		System.out.println("Name:"+this.employeeName);
		System.out.println("Salary:"+this.salary);
		System.out.println("Net Salary:"+this.netSalary);
	}
	
	
	public static int getPFPercentage(int pFper) {
		return pFper;
	}
	
	public static Employee getEmployeeDetails(Employee e2,int employeeId, String employeeName,double salary) {

		 e2.employeeId=employeeId;
		 e2.employeeName =employeeName;
		 e2.salary =salary;
		 return e2;
	}

}
