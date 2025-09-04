package in.co.rays.basic;

import java.util.*;

public class DifferentFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diff = 0, n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n - 1];
		for (int i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0;i<n-1;i++) {
			a[i] = sc.nextInt();
		}
		for (int i =0;i<n;i++) {
			boolean pre = false;
				for (int j =0;j<n-1;j++) {
					if (a[i] == b[j]) {
						pre = true;
						break;
					}
				}
				if (!pre) {
					diff = a[i];
				}
		}
		System.out.println(diff);
		sc.close();
	}
}
