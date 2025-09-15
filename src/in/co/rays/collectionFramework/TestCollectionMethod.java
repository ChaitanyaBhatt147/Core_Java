package in.co.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add("Chaitanya");
		c1.add(16);
		c1.add(16.20);
		c1.add('c');
		c1.add(true);
		
		System.out.println(c1);
		System.out.println(c1.contains('c'));
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		System.out.println(c1.remove('c'));
		System.out.println(c1.size());
		System.out.println("before adding c2 " + c1);
		
		Collection c2 = new ArrayList();
		
		c2.add("Akshata");
		c2.add(11);
		c2.add(11.20);
		c2.add('a');
		c2.add(false);
		
		System.out.println(c2);
		c1.addAll(c2);
		System.out.println("after adding c2 " + c1);
		System.out.println(c1.size());
		System.out.println(c1.removeAll(c2));
		System.out.println(c1.size());
		c1.clear();
		System.out.println(c1.isEmpty());
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
