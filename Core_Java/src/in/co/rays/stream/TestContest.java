package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContest {
	public static void main(String[] args) {
		ArrayList<Contest> list = new ArrayList<Contest>();
		list.add(new Contest("Chaitanya", "7220044837"));
		list.add(new Contest("Akshata", "7740975290"));
		list.add(new Contest("Farheen", "9875236891"));
		list.add(new Contest("Suraj", "9854678854"));
		list.add(new Contest("Pratyush", "722004837"));
		list.add(new Contest("Ruby", "8401644837"));
		list.add(new Contest("Amrita", "9414737027"));
		list.add(new Contest("Ankita", "9460828348"));
		list.add(new Contest("Chaitanya", "7044837"));
		
		Collections.shuffle(list);
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10 ).distinct().limit(3).forEach(System.out::println);

//		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
//				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
//					Collections.shuffle(e);
//					return e.stream();
//				})).limit(3).forEach(System.out::println);
	}
}
