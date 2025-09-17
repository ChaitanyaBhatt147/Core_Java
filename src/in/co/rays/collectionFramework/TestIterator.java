package in.co.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Chaitanya");
		list.add("Farheen");
		list.add("Pratyush");
		list.add("Suraj");
		list.add("Puneet");
		
		System.out.println("list: "+ list);
		System.out.println("<------------------For each loop----------------->");
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		
		System.out.println("<------------------Iterator method----------------->");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
//			i.remove();
		}
		
		
		System.out.println("<------------------For each method----------------->");
		
		list.forEach(System.out::println);
	}

}
