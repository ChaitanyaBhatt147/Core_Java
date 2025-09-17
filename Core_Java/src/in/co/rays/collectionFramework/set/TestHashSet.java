package in.co.rays.collectionFramework.set;

import java.util.HashSet;

public class TestHashSet {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		
		s.add('a');
		s.add('A');
		s.add('A');
		s.add('A');
		s.add('B');
		s.add('c');
		s.add('d');
		s.add('C');
		s.add('D');
		s.add('b');
		s.add(null);
		s.add(true);
		s.add(false);
		
		System.out.println(s);
	}

}
