package in.co.rays.collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(0,"Chaitanya");
		l.add(1,"Chaitanya");
		l.add(2,16);
		l.add(3,16.20);
		l.add('c');
		l.add("Chaitanya");
		l.add("Chaitanya");
		l.add(true);
		
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(1, "Akshata");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		System.out.println(l.indexOf("Chaitanya"));
		System.out.println(l.lastIndexOf("Chaitanya"));
		
	}
}
