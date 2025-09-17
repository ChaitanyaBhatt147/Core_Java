package in.co.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class FormateDate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(d);
		System.out.println(date);
		System.out.println("-----------------------------");
		String dob = "14-07-2001";
		Date myDob = sdf.parse(dob);
		System.out.println("MyDob = " + dob);
		System.out.println(myDob);
	}
}
