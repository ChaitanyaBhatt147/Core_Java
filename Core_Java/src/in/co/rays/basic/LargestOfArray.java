package in.co.rays.basic;
import java.util.*;
public class LargestOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [sc.nextInt()];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int lar = num[0];
		for (int i = 0; i < num.length-1; i++) {
			if (num[i]<num[i+1]) {
				lar = num[i+1];
			}
		}
		System.out.println(lar);
		sc.close();
	}
}
