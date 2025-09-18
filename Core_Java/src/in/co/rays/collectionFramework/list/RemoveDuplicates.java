package in.co.rays.collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(0);
		list.add(2);
		list.add(2);
		list.add(1);
		
		System.out.println("Natural list");
		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if(!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}
		}	
		System.out.println("Removed Duplicates");
		System.out.println(list2);
		
	}
}
