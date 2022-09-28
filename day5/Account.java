package day5;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	public boolean withdraw(int value) {
		if(value<=this.balance) {
			System.out.println("\"Balance amount after withdraw: "+(this.balance-value));
			return true;
		}
		else {
			System.out.println( "Sorry!!! No enough balance");
			return false;
		}
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}
//JAVA
	public void setBalance(int balance) {
		if(balance<0) {
			System.out.println("Amount Should Be Positive");
		}
		else {
			this.balance = balance;
		}
	}
	
}
