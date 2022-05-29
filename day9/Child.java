package day9;

public  class Child extends Parent{

	@Override
	public void m1() {
		System.out.println("m1 from child");
	}
	public void m4() {
		System.out.println("m4 from child");
	}
	public static void main(String[] args) {
		Parent c1=new Child();
		Parent a1=new Parent(10);
		c1.m1();
		c1.m2();
		c1.m3();
		Child c2=(Child) c1;
		c2.m4();
	}
}
