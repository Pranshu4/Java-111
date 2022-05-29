package day7;

public class AxisBank extends Bank{
	double rateOfInterest;

	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("Rate Of Interest:"+this.rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
