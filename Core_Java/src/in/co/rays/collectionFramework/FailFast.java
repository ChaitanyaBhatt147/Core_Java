package in.co.rays.collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class FailFast {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Chaitanya");
		v.add("Farheen");
		v.add("Suraj");
		v.add("Puneet");
		v.add("Ruby");
		
		Enumeration e = v.elements();
		
//		fail safe
		v.add("Amrita");		
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
	}
}
