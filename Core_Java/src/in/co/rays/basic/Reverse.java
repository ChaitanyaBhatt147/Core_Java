package in.co.rays.basic;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0,num = sc.nextInt();
		while (num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		} 
		System.out.println(rev);
		sc.close();
	}
}
