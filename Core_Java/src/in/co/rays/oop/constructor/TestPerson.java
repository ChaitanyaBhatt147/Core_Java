package in.co.rays.oop.constructor;
import java.util.Scanner;
public class TestPerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		p.person(sc.nextLine(), sc.nextLine(), sc.nextInt());
		sc.close();
	}
}
