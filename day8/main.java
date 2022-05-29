package day8;

public class main {
	public static void main(String[] args) {
		Bird b1 = new Parrot(); //with this b1 reference call the fly method of Parrot
		b1.fly();
		Parrot p1 =(Parrot)b1;
		p1.sing();

	}
}
