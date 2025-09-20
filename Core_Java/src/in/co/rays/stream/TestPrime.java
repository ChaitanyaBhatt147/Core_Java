package in.co.rays.stream;

import java.util.ArrayList;

public class TestPrime {
	public static boolean prime(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else if (num == 2 || num == 3) {
			return true;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(2);
		list.add(13);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(11);
		list.add(13);
		list.add(13);
		list.add(7);
		list.add(15);
		
		list.stream().sorted().distinct().filter(e -> prime(e)).forEach(System.out::println);
	}

}
