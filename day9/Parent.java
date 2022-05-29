package day9;

public class Parent {
	public void m1(){
		System.out.println("m1 from Parent");
	}
public void m2(){
	System.out.println("m2 from Parent");
	}
public void m3(){
	System.out.println("m3 from Parent");
}
 int number=10;
public Parent(int n) {
	this.number=n;
	System.out.println(this.number);
}
public Parent(){
	
}
public static void main(String[] args) {
	System.out.println("Parent");
}
}
