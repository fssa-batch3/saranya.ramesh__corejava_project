package day05.practice;

public class Account {

	private String accNo;
	private double balance;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//constructor
	public Account(String accNo, double balance) {
		this.balance = balance;
		this.accNo = accNo;
	}
}
