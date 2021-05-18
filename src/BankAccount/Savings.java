package BankAccount;

public class Savings  extends Account{
	private double interestRate;
	public Savings( int accNo, double rate) {
		super ( accNO);
		this.interestRate = rate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double InterestRate) {
		this.interestRate = interestRate;
	}
	public String getAccountDetails() {
		return "Savings Account Information\nAccount No:" +getAccountNo() + "\nAccount Balance:" + getAccountBalance() + "\nInterest Rate: " + getInterestRate();
		
	}

}
