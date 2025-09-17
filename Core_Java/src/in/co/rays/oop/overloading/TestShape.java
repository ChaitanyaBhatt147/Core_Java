package in.co.rays.oop.overloading;
import java.util.Scanner;

import in.co.rays.oop.Inheritance.Circle;
import in.co.rays.oop.Inheritance.Rectangle;
import in.co.rays.oop.Inheritance.Trangle;
public class TestShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<-------Circle------->");
		Circle c = new Circle();
		System.out.println("Enter the color of the circle: ");
		c.setColor(sc.nextLine());
		System.out.println("Enter the boder width of the circle: ");
		c.setBoderWidth(sc.nextInt());
		System.out.println("Enter the radious of the circle: ");
		c.setRadious(sc.nextInt());
		
		System.out.println("The color of the circle is: "+c.getColor());
		System.out.println("The boder width of the circle is: "+c.getBoderWidth());
		System.out.println("The radious of the circle is: " + c.getRadious());
		System.out.println("The area of the circle whose radious is '"+c.getRadious()+"' is: "+ c.area() );
		
		System.out.println("<-------Rectangle------->");
		Rectangle r = new Rectangle();
		System.out.println("Enter the color of the rectangle: ");
		r.setColor(sc.nextLine());
		System.out.println("Enter the boder width of the rectangle: ");
		r.setBoderWidth(sc.nextInt());
		System.out.println("Enter the lenhth and width of the rectangle respectively: ");
		r.setLength(sc.nextInt());
		r.setWidth(sc.nextInt());

		System.out.println("The color of the rectangle: " + r.getColor());
		System.out.println("The boder width of the rectangle: " + r.getBoderWidth());
		System.out.println("The lenhth and width of the rectangle respectively: "+r.getLength()+", "+r.getWidth());
		System.out.println("Area of the rectangle whose length and width are '"+r.getLength()+"', '"+r.getWidth()+"' is: "+r.area());
		
		System.out.println("<-------Trangle------->");
		Trangle t = new Trangle();
		System.out.println("Enter the color of the trangle: ");
		t.setColor(sc.nextLine());
		System.out.println("Enter the boder width of the trangle: ");
		t.setBoderWidth(sc.nextInt());
		System.out.println("Enter the hight and base of the trangle respectively: ");
		t.setHight(sc.nextInt());
		t.setBase(sc.nextInt());
		
		System.out.println("The color of the trangle: "+t.getColor());
		System.out.println("The boder width of the trangle: "+t.getBoderWidth());
		System.out.println("The hight and base of the trangle respectively: "+t.getHight()+", "+t.getBase());
		System.out.println("Area of the trangle whose hight and base are '"+t.getHight()+"', '"+t.getBase()+"' is: "+t.area());
		sc.close();
	}
}
