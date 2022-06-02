package day10;

public class HistoryStudent extends Student {
	int historyMarks,civicsMarks;
	

	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	 double getPercentage() {
		return ((civicsMarks+historyMarks)/2);
		// TODO Auto-generated method stub
		
	}

}
