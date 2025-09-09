package in.co.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setNumber("1234567890123456");
		a1.setAccountType("Saving");
		a1.setbalance(1000000.53);
		System.out.println("Account Number: " + a1.getNumber());
		System.out.println("Account Type: " + a1.getAccountType());
		System.out.println("Current Balance: " + a1.getBalance());
	}
}
