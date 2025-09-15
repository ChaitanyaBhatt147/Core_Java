package in.co.rays.oop.constructor;

import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<-------Circle------->");
		System.out.println("Enter the radious of the circle: ");
		Circle c = new Circle(sc.nextInt());
		System.out.println("Enter the color of the circle: ");
		c.setColor(sc.nextLine());
		System.out.println("Enter the boder width of the circle: ");
		c.setBoderWidth(sc.nextInt());
		
		
		System.out.println("The color of the circle is: "+c.getColor());
		System.out.println("The boder width of the circle is: "+c.getBoderWidth());
		System.out.println("The radious of the circle is: " + c.getRadious());
		System.out.println("The area of the circle whose radious is '"+c.getRadious()+"' is: "+ c.area() );
		
		System.out.println("<-------Rectangle------->");
		System.out.println("Enter the lenhth and width of the rectangle respectively: ");
		Rectangle r = new Rectangle(sc.nextInt(),sc.nextInt());
		System.out.println("Enter the color of the rectangle: ");
		r.setColor(sc.nextLine());
		System.out.println("Enter the boder width of the rectangle: ");
		r.setBoderWidth(sc.nextInt());

		System.out.println("The color of the rectangle: " + r.getColor());
		System.out.println("The boder width of the rectangle: " + r.getBoderWidth());
		System.out.println("The lenhth and width of the rectangle respectively: "+r.getLength()+", "+r.getWidth());
		System.out.println("Area of the rectangle whose length and width are '"+r.getLength()+"', '"+r.getWidth()+"' is: "+r.area());
		
		System.out.println("<-------Trangle------->");
		System.out.println("Enter the hight and base of the trangle respectively: ");
		Trangle t = new Trangle(sc.nextInt(),sc.nextInt());
		System.out.println("Enter the color of the trangle: ");
		t.setColor(sc.nextLine());
		System.out.println("Enter the boder width of the trangle: ");
		t.setBoderWidth(sc.nextInt());
		
		System.out.println("The color of the trangle: "+t.getColor());
		System.out.println("The boder width of the trangle: "+t.getBoderWidth());
		System.out.println("The hight and base of the trangle respectively: "+t.getHeight()+", "+t.getBase());
		System.out.println("Area of the trangle whose hight and base are '"+t.getHeight()+"', '"+t.getBase()+"' is: "+t.area());
		sc.close();
	}
}
