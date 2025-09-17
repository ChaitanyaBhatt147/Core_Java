package in.co.rays.basic;
import java.util.*;
public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double sum = 1.00d;
		for (int i = 1; i < num; i++) {
			sum = sum+(1.0/(i+1));
		}
		System.out.println(sum);
		sc.close();
	}
}
