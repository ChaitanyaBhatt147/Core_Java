package in.co.rays.threads;

public class AccountThread extends Thread{
	public static Account a = new Account();
	String name;
	public AccountThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			a.deposit(name, 1000);
		}
	}
}
