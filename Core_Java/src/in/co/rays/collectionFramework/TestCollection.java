package in.co.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(16);
		c.add(16.20);
		c.add("Chaitanya");
		c.add('c');
		c.add(true);
		
		System.out.println(c);
		System.out.println("-------------------------------");
		for (Object o : c) {
			System.out.println(o);
		}
	}
}
