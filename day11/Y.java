package day11;

public interface Y {
	void absy1();
	default void absy2() {
		System.out.println("Default method of Y");
	}
	static void absy3() {
		System.out.println("Static Method of Y");
	}
	public void pranshu();
}
