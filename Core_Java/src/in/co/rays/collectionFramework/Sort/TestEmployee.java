package in.co.rays.collectionFramework.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Chaitanya", 90000, "DTX"));
		list.add(new Employee("Farheen", 25000, "Arcgate"));
		list.add(new Employee("Puneet", 22000, "Arcgate"));
		list.add(new Employee("Ruby", 50000, "Junomoneto"));
		list.add(new Employee("Sparsh", 80000, "EY"));
		list.add(new Employee("Suraj", 20000, "SKK"));
		
		list.forEach(System.out::println);
		System.out.println("----------------------");
		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		list.forEach(System.out::println);
		System.out.println("----------------------");
		OrderBySalary bySalary = new OrderBySalary();
		Collections.sort(list, bySalary);
		list.forEach(System.out::println);
		System.out.println("----------------------");
		OrderByCompany byCompany = new OrderByCompany();
		Collections.sort(list, byCompany);
		list.forEach(System.out::println);
		System.out.println("----------------------");
	}

}
