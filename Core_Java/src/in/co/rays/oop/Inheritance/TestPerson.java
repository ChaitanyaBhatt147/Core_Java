package in.co.rays.oop.Inheritance;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class TestPerson {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("<-------Businessman------->");
		Businessman b = new Businessman();
		System.out.println("Enter the name of the businessman: ");
		b.setName(sc.nextLine());
		System.out.println("Enter the address of the businessman: ");
		b.setAddress(sc.nextLine());
		System.out.println("Enter the date of birth of the businessman in (DD-MM-YYYY): ");
		b.setDateOfBirth(sdf.parse(sc.nextLine()));
		System.out.println("Enter the income of the businessman: ");
		b.setIncome(sc.nextDouble());
		
		System.out.println("Name of the businessman is: " + b.getName());
		System.out.println("Address of the businessman is: " + b.getAddress());
		System.out.println("Date of birth of the businessman in (DD-MM-YYYY) is: " + sdf.format(b.getDateOfBirth()));
		System.out.println("Income of the businessman is: " + b.getIncome());
		
		System.out.println("<-------Doctor------->");
		Doctor d = new Doctor();
		System.out.println("Enter the name of the doctor: ");
		d.setName(sc.nextLine());
		System.out.println("Enter the address of the doctor: ");
		d.setAddress(sc.nextLine());
		System.out.println("Enter the date of birth of the doctor in (DD-MM-YYYY): ");
		d.setDateOfBirth(sdf.parse(sc.nextLine()));
		System.out.println("Enter the registeration number of doctor: ");
		d.setRegistrationNo(sc.nextLine());
		
		System.out.println("Name of the doctor is: " + d.getName());
		System.out.println("Address of the doctor is: " +d.getAddress());
		System.out.println("Date of birth of the doctor in (DD-MM-YYYY) is: " + sdf.format(d.getDateOfBirth()));
		System.out.println("Registeration number of doctor is: "+ d.getRegistrationNo());

		System.out.println("<-------Student------->");
		Students s = new Students();
		System.out.println("Enter the name of the student: ");
		s.setName(sc.nextLine());
		System.out.println("Enter the address of the student: ");
		s.setAddress(sc.nextLine());
		System.out.println("Enter the date of birth of the student in (DD-MM-YYYY): ");
		s.setDateOfBirth(sdf.parse(sc.nextLine()));
		System.out.println("Enter the roll number of the student: ");
		s.setRollNo(sc.nextLine());
		System.out.println("Enter the marks of the student: ");
		s.setMarks(sc.nextInt());

		System.out.println("Name of the student is: " + s.getName());
		System.out.println("Address of the student is: " +s.getAddress());
		System.out.println("Date of birth of the student in (DD-MM-YYYY) is: " + sdf.format(s.getDateOfBirth()));
		System.out.println("Roll number of the student is: "+ s.getRollNo());
		System.out.println("Marks of the student are: " + s.getMarks());
		
		sc.close();
	}

}
