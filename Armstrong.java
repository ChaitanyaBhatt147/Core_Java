package in.co.rays.basic;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arm =0;
		String dig = String.valueOf(num);
		int power = dig.length();
		for (int i = 0; i < power; i++) {
			int dit, sum=1;
			dit = num%10;
			for (int j = 0; j < power; j++) {
				sum = sum*dit;
			}
			arm= arm+sum;
			num=num/10;
		}
		num = Integer.parseInt(dig);
		if (arm == num) {
			System.out.println("Yes, "+num+" number is a armstrong number.");
		} else {
			System.out.println("No, "+num+" number is not a armstrong number.");
		}
		sc.close();
	}
}
