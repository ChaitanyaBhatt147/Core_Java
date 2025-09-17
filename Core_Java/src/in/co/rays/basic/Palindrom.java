package in.co.rays.basic;
import java.util.*;
public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev=0, num = sc.nextInt();
		int or = num;
		do {
			rev = (rev*10)+(num%10);
			num= num/10;
		} while (num != 0);
		if (or==rev) {
			System.out.println(or+" is a palindrom.");
		} else {
			System.out.println(or+" is not a palindrom.");
		}
		sc.close();
	}
}
