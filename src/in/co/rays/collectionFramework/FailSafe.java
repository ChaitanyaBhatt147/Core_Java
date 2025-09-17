package in.co.rays.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class FailSafe {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Chaitanya");
		list.add("Farheen");
		list.add("Suraj");
		list.add("Ruby");
		list.add("Puneet");
		
		Iterator it = list.iterator();
		
//		Fail Fast
		list.add("Amrita");
		
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}
}
