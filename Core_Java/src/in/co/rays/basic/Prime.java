package in.co.rays.basic;

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number.");
		} else if (num == 2 || num == 3) {
			System.out.println(num + " is a prime number.");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {

					System.out.println(num + " is not a prime number.");
					break;
				}
				System.out.println(num + " is a prime number.");
			}
		}
		sc.close();
	}
}
