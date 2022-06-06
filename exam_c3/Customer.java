package exam_c3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(Pattern.matches("[a-zA-Z]{3-8}",username)) {
			this.username=username;
		}
		else {
			System.out.println("Invalid Username");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(Pattern.matches("[a-zA-Z] {3-8}[0-9] {3-8}",password)) {
			this.password = password;
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber)) {
			this.mobileNumber = mobileNumber;
		}
		else {
			System.out.println("Invalid Mobile Number");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
