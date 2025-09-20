package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestSreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(6);
		
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 != 0).forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 != 0).sorted().forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 != 0).sorted().distinct().forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 != 0).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 == 0).forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 == 0).sorted().forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 == 0).sorted().distinct().forEach(System.out::println);
		System.out.println("<------------------------->");
		list.stream().filter(e -> e%2 == 0).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
	}
}
