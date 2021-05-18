package BankAccount;

public class Checking extends Account {
	public Checking ( int accNO) {
		super (accNo);
	}
	public String getAccountDetails() {
		return "Checkings Account Information\nAccount No: "+getAccountNo()+ "\nAccount Balance:" + getAccountBalance();
	}
}
