package exam_c3;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DemoC {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer c2=new Customer();
		c2.setUsername(sc.next());
		c2.setPassword(sc.next());
		c2.setMobileNumber(sc.next());
		c2.setEmail(sc.next());
		System.out.println("User Name is: "+c2.getUsername());
		System.out.println("Password is: "+c2.getPassword());
		System.out.println("Mobile Number is: "+c2.getMobileNumber());
		System.out.println("E-MAIL is: "+c2.getEmail());
	}
}
