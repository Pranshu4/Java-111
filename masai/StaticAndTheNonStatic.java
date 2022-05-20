// "The Common functionality of all objects in the application must be defined as\r\n"
// "static.\r\n"
// "Non-static functionality belongs to a particular object.\r\n"

package com.masai;

public class StaticAndTheNonStatic {
	void method1(String str) {
		System.out.println(str);
	}
	static void method2() {
		System.out.println("I Am Method 2");
	}

	public static void main(String[] args) {
		method2();
		StaticAndTheNonStatic s1=new StaticAndTheNonStatic();
		s1.method1("Pranshu");
	}

}
