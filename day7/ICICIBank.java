package day7;

public class ICICIBank extends Bank {
	double rateOfInterest;

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Rate Of Interest:"+this.rateOfInterest);
	}
} 
