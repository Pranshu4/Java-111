package exam_c3;
import java.util.Scanner;
public class Pp {
	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter The Length of Array");
		int[] a=new int[s1.nextInt()];
		for (int i=0;i<a.length;i++) {
			a[i]=s1.nextInt();
		}
		System.out.println("Enter the index you want");
		try {
			int num =s1.nextInt();
			System.out.println("The array element at index"+num+"="+a[num]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
