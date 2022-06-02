package day10;

public  class ScienceStudent extends Student {
	int phisicsMarks,chemistryMarks,mathsMarks;
	
	 
	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}


	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return ((phisicsMarks+chemistryMarks+mathsMarks)/3);
	}
	
	
}
