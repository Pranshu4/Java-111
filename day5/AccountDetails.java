package day5;

public class AccountDetails {
	public Account getAccountDetails(int accountid, String accountType, int balance) {
		Account a1=new Account();
		a1.setAccountId(accountid);
		a1.setAccountType(accountType);
		a1.setBalance(balance);
		return a1;
	}
	public int getWithdrawAmount(int amount) {
		if(amount<0) {
			System.out.println("Amount should be positive");
			
		}
		return amount;
	}
	public static void main(String[] args) {
		AccountDetails a2=new AccountDetails();
		Account j=a2.getAccountDetails(101, "Saving", 100000);
		
		System.out.println("Bank Details");
		System.out.println("Account Id: "+j.getAccountId());
		System.out.println("Account Type: "+j.getAccountType());
		System.out.println("Account Balance: "+j.getBalance());
		System.out.println(j.withdraw(a2.getWithdrawAmount(5000)));
	}

}
