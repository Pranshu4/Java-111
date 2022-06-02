package day10;

public class Q_3 {
	public static void main(String[] args) {
		System.out.println("1) Abstract class can have abstract and non-abstract methods.");
		System.out.println("1) Interface can have only abstract methods. Since Java 8, it can have default and static methods also.");
		System.out.println("2) Abstract class doesn't support multiple inheritance.");
		System.out.println("2) Interface supports multiple inheritance.");
		System.out.println("3) Abstract class can have final, non-final, static and non-static variables.");
		System.out.println("3) Interface has only static and final variables.");
		System.out.println("4) Abstract class can provide the implementation of interface.");
		System.out.println("4) Interface can't provide the implementation of abstract class.");
		System.out.println("Example Of Abstract class:\r\n"
				+ "public abstract class Shape{\r\n"
				+ "public abstract void draw();\r\n"
				+ "}");
		System.out.println("Example Of Interface:\r\n"
				+ "public interface Drawable{\r\n"
				+ "void draw();\r\n"
				+ "}");
	}
}
