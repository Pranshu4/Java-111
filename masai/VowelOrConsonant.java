package com.masai;

public class VowelOrConsonant {
	static void vowel(String str) {
		if(str=="A" || str=="a" ||str=="E"||str=="e"||str=="I"||str=="i"||str=="O"||str=="o"||str=="U"||str=="u") {
			System.out.println("It Is Vowel");
		}
		else if (str=="@"||str=="#"||str=="$"||str=="%"||str=="~"){
			System.out.println("invalid character");}
		else  {
			System.out.println("It Is Consonant");
		}
		
		
	}

	public static void main(String[] args) {
		vowel("~");
	}

}
