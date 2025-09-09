package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person p1 = new Person();
		p1.setName("Chaitanya Bhatt");
		p1.setDob(sdf.parse("2001-07-14"));
		p1.setAddress("Niranjanpur, Indore");
		
		System.out.println("Name: "+ p1.getName());
		System.out.println("DOB: "+ p1.getDob());
		System.out.println("Address: "+p1.getAddress());
	}
}
