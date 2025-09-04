package in.co.rays.basic;

import java.util.*;

public class AverageOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sumO = 0, sumE = 0;
		for (int i = 1, count = 0; count < num; i += 2, count++) {
			sumO = sumO + i;
		}
		double avgO = (double) sumO / num;
		for (int i = 2, count = 0; count < num; i += 2, count++) {
			sumE = sumE + i;
		}
		double avgE = (double) sumE / num;
		System.out.println(" Average of all " + num + " consecutive odd numbers is: " + avgO + ".");
		System.out.println(" Average of all " + num + " consecutive even numbers is: " + avgE + ".");
		sc.close();
	}
}
