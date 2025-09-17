package in.co.rays.oop.abstraction;
import java.util.Scanner;
public class TestShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Trangle t = new Trangle();
		System.out.println("Enter the radious of the circle: ");
		c.setRadius(sc.nextInt());
		System.out.println("Area of a circle whose radious is "+c.getRadius()+" is: "+ c.area());
		
		System.out.println("Enter the length and breath of the rectangle respectively: ");
		r.setLength(sc.nextInt());
		r.setLength(sc.nextInt());
		System.out.println("Area of a rectangle whose lenhth and breath are respectively "+r.getLength()+", "+r.getBase()+" is: "+ r.area());
		
		System.out.println("Enter the hight and base of the traingle raspectively: ");
		t.setHight(sc.nextInt());
		t.setBase(sc.nextInt());
		System.out.println("Area of a traingle whose hight and base are respectively "+t.getHight()+", "+t.getBase()+" is: "+ t.area());
		sc.close();
	}
}
