package in.co.rays.basic;
import java.util.*;
public class Trangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i+1 + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
