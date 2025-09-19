package in.co.rays.collectionFramework.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	public static void main(String[] args) {
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		list.add(new Marksheet("12", "Puneet", 70));
		list.add(new Marksheet("13", "Ruby", 85));
		list.add(new Marksheet("14", "Amrita", 80));
		list.add(new Marksheet("11", "Chaitanya", 86));
		list.add(new Marksheet("16", "Chaitanya", 88));
		list.add(new Marksheet("17", "Nilesh", 60));
		System.out.println(list);
		System.out.println("-------------------");
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
