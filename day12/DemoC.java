package day12;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class DemoC {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum) && Pattern.matches("[a-zA-Z]{7}", name) && Pattern.matches("[0-9]{12}", aadharCard)) {
			System.out.println("Name :"+name);
			System.out.println("Mobile :"+mobileNum);
			System.out.println("Aadhaar No:"+aadharCard);
			return true;
		}
		else {
			System.out.println("Invaild Details");
			return false;
		}
	}
	public static void main(String[] args) {
		DemoC d1 = new DemoC();
		Citizen cz= new Citizen();
		cz.setMobileNumber("7894013467");
		cz.setAadharNumber("997744556633");
		cz.setName("Pranshu");
		
		if(cz.getName().length()==7 && cz.getAadharNumber().length()==12 && cz.getMobileNumber().length()==10) {
			d1.validate(cz.getName(), cz.getMobileNumber(), cz.getAadharNumber());
		}
		else {
			System.out.println("PLEASE GIVE PROPER DETAILS");
		}
	}
}
