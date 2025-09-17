package in.co.rays.oop.polymorphism;

import java.util.Scanner;

public class TestPolimorphishByArray {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Shape [] s = new Shape[3];
			System.out.println("Enter the radious of circle: ");
			s[0] = new Circle(sc.nextInt());
			System.out.println("Enter the lenhth and width of the rectangle respectively: ");
			s[1] = new Rectangle(sc.nextInt(), sc.nextInt());
			System.out.println("Enter the hight and base of the trangle respectively: ");
			s[2] = new Trangle(sc.nextInt(), sc.nextInt());
			for (int i = 0; i < s.length; i++) {
				System.out.println("Area: " + s[i].area());
			}
			sc.close();
		}
}
