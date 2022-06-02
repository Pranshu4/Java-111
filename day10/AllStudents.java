package day10;

public class AllStudents {

	public static void main(String[] args) {
		HistoryStudent h1=new HistoryStudent("Allu", "Bihar");
		ScienceStudent s1=new ScienceStudent("PP","Delhi");
		h1.civicsMarks=80;
		h1.historyMarks=70;
		double d1=h1.getPercentage();
		System.out.println("Name is: "+h1.name+" Address is: "+h1.address+" Percentage is :"+d1);
		s1.chemistryMarks=50;
		s1.mathsMarks=80;
		s1.phisicsMarks=90;
		double d2=s1.getPercentage();
		System.out.println("Name is: "+s1.name+" Address is: "+s1.address+" Percentage is :"+d2);
	}

}
