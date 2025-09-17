package in.co.rays.oop.constructor;

public class Student extends Person{
	public void student() {
		System.out.println("Student: defoult");
	}
	public void student(String name, String address, int age, int rollNo) {
		super.person(name, address, age);
		System.out.println("Role number: " + rollNo);
	}
}
