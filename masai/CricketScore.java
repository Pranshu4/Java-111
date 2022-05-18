package com.masai;

public class CricketScore {
	static void cricketscore(int ones, int twos, int threes, int fours, int sixes) {
		int score=(ones+(twos*2)+(threes*3)+(fours*4)+(sixes*6));
		System.out.println("scored by the batsman is "+ score);
	}

	public static void main(String[] args) {
		cricketscore(10,5,3,2,1);
		
	}

}
