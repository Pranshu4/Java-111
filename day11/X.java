package day11;

public interface X {
	void absx1();
	default void absx2() {
		System.out.println("Default method of X");
	}
	static void absx3() {
		System.out.println("Static Method of X");
	}
}
