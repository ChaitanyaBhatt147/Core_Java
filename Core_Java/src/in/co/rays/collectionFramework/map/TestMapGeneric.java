package in.co.rays.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapGeneric {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(4, "Four");
		m.put(5, "Five");
//		m.put("Five", 5);
	}
}
