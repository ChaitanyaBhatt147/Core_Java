package in.co.rays.basic;
import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(),num2 = sc.nextInt(), num3;
		System.out.println("With using third variable:");
		System.out.println("Before swap "+num1+", "+num2);
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("After swap "+num1+", "+num2);
		System.out.println("Without using third variable:");
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After swap "+num1+", "+num2);
		sc.close();
	}
}
