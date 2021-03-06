package day7;

public class DemoBank {
	public static Bank getBank(String bank) {
		if(bank=="axis") {
			AxisBank ax = new AxisBank();
			ax.branchName="Buddha Axis";
			ax.IfscCode="Ax1234";
			ax.rateOfInterest=9;
			ax.displayDetails();
			ax.getCreditCard();
			return ax;
		}
		else if(bank == "icici") {
			ICICIBank ic = new ICICIBank();
			ic.branchName="New Delhi";
			ic.IfscCode="GREAT";
			ic.rateOfInterest=10;
			ic.displayDetails();
			return ic;
		}
		else
			return null;
	}

	public static void main(String[] args) {
		
		getBank("axis");
		getBank("icici");
	}

}
