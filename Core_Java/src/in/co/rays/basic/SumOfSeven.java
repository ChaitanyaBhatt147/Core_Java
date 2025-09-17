package in.co.rays.basic;

public class SumOfSeven {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				sum = sum+i;
				System.out.print(i+" ");
//				System.out.println();
				System.out.print(sum+", ");
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}
