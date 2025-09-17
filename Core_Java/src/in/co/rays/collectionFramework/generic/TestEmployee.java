package in.co.rays.collectionFramework.generic;

import java.util.ArrayList;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Chaitanya", 22000, "Arcgate"));
		list.add(new Employee("Farheen", 21500, "Arcgate"));
		list.add(new Employee("Puneet", 21000, "Arcgate"));
		list.add(new Employee("Suraj", 18000, "Arcgate"));
		list.add(new Employee("Shilpa", 15000, "Arcgate"));
		
		list.forEach(System.out::println);
	}
}
