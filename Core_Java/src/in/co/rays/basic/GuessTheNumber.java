package in.co.rays.basic;
import java.util.*;
public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int gNum, num = rand.nextInt(100), times = 1;
		System.out.println("Guess a number between 1 to 100.");
		do {
			gNum = sc.nextInt();
			if (gNum < num) {
				System.out.println("Too small!!!!");
			} else if (gNum > num) {
				System.out.println("Opp.......Too High!!!!!");
			}
			times++;
		} while (gNum != num);
		System.out.println("Grate!!!");
		System.out.println("You got it in "+times+" times.");
		sc.close();
	}
}
