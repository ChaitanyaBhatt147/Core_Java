package in.co.rays.stream;

import java.util.ArrayList;

public class TestStream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Chaitanya");
		list.add("Chaitanya");
		list.add("Akshata");
		list.add("Farheen");
		list.add("Suraj");
		list.add("Pratyush");
		list.add("Ruby");
		list.add("Amrita");
		list.add("Sejal");
		list.add("Siddhi");
		list.add("Riddhi");
		
		System.out.println("<--------------------------------->");
		list.stream().map(e -> e.toUpperCase()).sorted().distinct().forEach(System.out::println);
		System.out.println("<--------------------------------->");
		list.stream().map(e -> e.toLowerCase()).sorted().distinct().forEach(System.out::println);
		System.out.println("<--------------------------------->");
		list.stream().map(e -> e.toLowerCase()).sorted().distinct().filter(e -> e.startsWith("s")).forEach(System.out::println);
	}
}
