package in.co.rays.basic;
import java.util.*;
public class febonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0, cur =1, next , num = sc.nextInt();
		System.out.print(pre+", "+cur);
		for (int i = 0; i <= num; i++) {
			next = pre+cur;
			System.out.print(", "+next);
			pre= cur;
			cur = next;
		}
		sc.close();
	}
}
