package in.co.rays.oop;
import java.util.Scanner;
public class TestAutomobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Automobile c1 = new Automobile();
		System.out.println("Enter the color of the car.");
		c1.setColor(sc.nextLine());
		System.out.println("Enter the makers name of the car.");
		c1.setMake(sc.nextLine());
		System.out.println("Enter the max speed of the car.");
		c1.setSpeed(sc.nextInt());
		System.out.println("Makers name: "+ c1.getMake());
		System.out.println("Color: "+ c1.getColor());
		System.out.println("Max Speed: "+ c1.getSpeed());
		sc.close();
	}
}
