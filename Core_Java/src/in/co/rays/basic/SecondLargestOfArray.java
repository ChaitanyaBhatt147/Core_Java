package in.co.rays.basic;
import java.util.*;
public class SecondLargestOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [sc.nextInt()];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int lar = num[0],sLar = num[0];
		for (int i = 0; i < num.length-1; i++) {
			if (num[i]<num[i+1]) {
				sLar = lar;
				lar = num[i+1];
			}
		}
		System.out.println(sLar);
		sc.close();
	}
}
