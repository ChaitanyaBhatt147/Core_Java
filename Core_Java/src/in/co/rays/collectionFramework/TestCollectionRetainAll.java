package in.co.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionRetainAll {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("Chaitanya");
		c1.add(16);
		c1.add(16.20);
		c1.add('c');
		c1.add(true);

		Collection c2 = new ArrayList();

		c2.add("Akshata");
		c2.add(11);
		c2.add(11.20);
		c2.add('c');
		c2.add(false);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.retainAll(c2));
		System.out.println(c1.isEmpty());
		System.out.println(c1);
		System.out.println(c2);
	}
}
