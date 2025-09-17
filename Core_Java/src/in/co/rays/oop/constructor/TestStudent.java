package in.co.rays.oop.constructor;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.student();
		System.out.println("-----------------------------------");
		s.student(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
		sc.close();
	}

}
