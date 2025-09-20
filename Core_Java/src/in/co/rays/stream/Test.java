package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(20000);
		list.add(10000);
		list.add(10000);
		list.add(90000);
		list.add(88888);
		list.add(54546);
		list.add(32500);
		list.add(33640);
		list.add(38546);
		list.add(76123);
		list.add(40213);
		list.add(60000);
		
		System.out.println("<-------------------------->");
		list.stream().sorted().distinct().limit(1).forEach(System.out::println);
		System.out.println("<-------------------------->");
		list.stream().sorted(Comparator.reverseOrder()).distinct().limit(1).forEach(System.out::println);
		System.out.println("<-------------------------->");
		list.stream().sorted().distinct().skip(1).limit(1).forEach(System.out::println);
		System.out.println("<-------------------------->");
		list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
		System.out.println("<-------------------------->");
		
		list.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
		System.out.println("<-------------------------->");
		list.stream().max(Comparator.reverseOrder()).ifPresent(System.out::println);
	}
}
