package in.co.rays.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Totel balance after deposit: "+ this.balance);
	}
	public void withdrawal(double amount) {
		if (amount>this.balance) {
			System.out.println("Insufficent fund transfer.");
		} else {
			this.balance = this.balance - amount;
			System.out.println("Totel balance after withdrawal: "+ this.balance);
		}
	}
}
