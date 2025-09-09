package in.co.rays.oop;
import java.util.Scanner;
public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.println("Enter the account number.");
		a1.setNumber(sc.nextLine());
		System.out.println("Enter the account type.");
		a1.setAccountType(sc.nextLine());
		System.out.println("Enter the account balance.");
		a1.setbalance(sc.nextDouble());
		System.out.println("Account Number: " + a1.getNumber());
		System.out.println("Account Type: " + a1.getAccountType());
		System.out.println("Current Balance: " + a1.getBalance());
		System.out.println("Enter the amount you want to deposit.");
		a1.deposit(sc.nextDouble());
		System.out.println("Enter the amount you want to withdrawal.");
		a1.withdrawal(sc.nextDouble());
		System.out.println("Enter the amount you want to withdrawal.");
		a1.withdrawal(sc.nextDouble());
		sc.close();
	}
}
