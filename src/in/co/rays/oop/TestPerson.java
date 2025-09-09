package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person p1 = new Person();
		System.out.println("Enter your name.");
		p1.setName(sc.nextLine());
		System.out.println("Enter your DOB in YYYY-MM-DD formate.");
		p1.setDob(sdf.parse(sc.nextLine()));
		System.out.println("Enter your address.");
		p1.setAddress(sc.nextLine());
		
		System.out.println("Name: "+ p1.getName());
		System.out.println("DOB: "+ p1.getDob());
		System.out.println("Address: "+p1.getAddress());
		sc.close();
	}
}
