package in.co.rays.basic;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println("-------------------------");
		LocalDate dob = LocalDate.of(2001, 07, 14);
		System.out.println(dob);
		System.out.println(dob.getDayOfWeek());
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getDayOfYear());
		System.out.println("-------------------------");
		System.out.println("Age: "+( date.getYear()- dob.getYear()));
	}
}
