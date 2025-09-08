package in.co.rays.basic;

import java.util.*;

public class CountTheNote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amout of which you want to conunt the numbers of note and it should multiple of 100 : ");
		int amount = sc.nextInt();
		int[] note = { 500, 200, 100 };
		if (amount % 100 != 0) {
			System.out.println("Oppp!!!!!!!!!!! \nThe amount you have entered is not a multile of 100.");
		} else {
			for (int i : note) {
				int count = 0;
				count = amount / i;
				System.out.println(i + " : " + count);
				amount = amount % i;
			}
		}
		sc.close();
	}
}
