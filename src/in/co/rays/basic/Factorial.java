package in.co.rays.basic;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1, num = sc.nextInt();
		if (num == 0|| num == 1) {
			System.out.println("Factorial of "+num+" is 1.");
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact*i;
			}
			System.out.println("Factorial of "+num+" is "+fact);
		}
		sc.close();
	}
}
