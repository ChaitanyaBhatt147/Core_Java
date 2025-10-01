package in.co.rays.threads;

public class Account {
	private double balance;

	public double getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(double balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	public synchronized void deposit(String name, double balance) {
		double amount = this.balance+ balance;
		setBalance(amount);
		System.out.println(name+" deposit "+getBalance());
	}
	
}
