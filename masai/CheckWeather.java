package com.masai;

public class CheckWeather {
	static void weathercheck(boolean isRaining, boolean isSnowing, double temperature) {
	    if(isRaining==true && isSnowing==true && temperature<50) {
	    	System.out.println("Let’s stay home.");
	    }
	    else
	    System.out.println("Let’s go out!");
	}
	public static void main(String[] args) {
		weathercheck(true, true, 40.0);
	}

}
