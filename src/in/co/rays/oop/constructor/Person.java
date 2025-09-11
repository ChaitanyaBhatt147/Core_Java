package in.co.rays.oop.constructor;

public class Person {
	public void person() {
		System.out.println("Person: defolt");
	}
	public void person(String name) {
		this.person();
		System.out.println("Name: " + name);
	}
	public void person(String name, String address) {
		this.person(name);
		System.out.println("Address: " + address);
	}
	public void person(String name, String address, int age) {
		this.person(name, address);
		System.out.println("Age: " + age);
	}
}
