package in.co.rays.collectionFramework.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(7);
		System.out.println("Before sort");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sort");
		System.out.println(list);
		
	}
}
