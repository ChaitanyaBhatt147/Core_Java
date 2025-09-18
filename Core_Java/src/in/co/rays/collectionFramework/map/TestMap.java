package in.co.rays.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(4, "Four");
		m.put(5, "Five");
		m.put("Five", 5);
		m.put(5, 5);
		m.put(null, null);
		m.put(null, null);
		m.put("null", null);
		
		System.out.println(m);
		System.out.println(m.get(5));
		System.out.println(m.entrySet());
		System.out.println(m.containsKey(6));
		System.out.println(m.containsValue(5));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.size());
		m.remove(5);
		System.out.println(m.entrySet());
		System.out.println(m.size());
		m.clear();
		System.out.println(m.size());
		System.out.println(m.entrySet());
		
	}
}
