package in.co.rays.collectionFramework.set;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		
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
