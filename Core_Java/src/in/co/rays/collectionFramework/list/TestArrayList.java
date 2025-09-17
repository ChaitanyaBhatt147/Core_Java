package in.co.rays.collectionFramework.list;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(0,"Chaitanya");
		list.add(1,"Chaitanya");
		list.add(2,16);
		list.add(3,16.20);
		list.add('c');
		list.add("Chaitanya");
		list.add("Chaitanya");
		list.add(true);
		
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(1, "Akshata");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.indexOf("Chaitanya"));
		System.out.println(list.lastIndexOf("Chaitanya"));
	}

}
