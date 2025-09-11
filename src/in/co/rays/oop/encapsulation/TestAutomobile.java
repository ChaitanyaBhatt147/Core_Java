package in.co.rays.oop.encapsulation;
import java.util.Scanner;
public class TestAutomobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Automobile c1 = new Automobile();
		System.out.println("Enter the color of the car.");
		c1.setColor(sc.nextLine());
		System.out.println("Enter the makers name of the car.");
		c1.setMake(sc.nextLine());
		System.out.println("Enter the speed of the car");
		c1.setSpeed(sc.nextInt());
		System.out.println("Makers name: "+ c1.getMake());
		System.out.println("Color: "+ c1.getColor());
		System.out.println("The corrent speed of the car is: "+ c1.getSpeed()+ " Km/h");
		c1.accleration();
		c1.Break();
		c1.accleration();
		System.out.println("Enter the gare number to which you want to change: ");
		c1.changeGare(sc.nextInt());
		sc.close();
	}
}
