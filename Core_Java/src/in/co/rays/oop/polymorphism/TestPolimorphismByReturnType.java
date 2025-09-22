package in.co.rays.oop.polymorphism;

public class TestPolimorphismByReturnType {
	public static void main(String[] args) {
		Shape [] s = new Shape[3];
		
		s[0] = Shape.getShape(0);
		s[1] = Shape.getShape(1);
		s[2] = Shape.getShape(2);
		
//		typeCast
		Circle c = (Circle) s[0];
		c.setRadious(3);
		Rectangle r = (Rectangle) s[1];
		r.setLength(10);
		r.setWidth(5);
		Trangle t = (Trangle) s[2];
		t.setHeight(10);
		t.setBase(5);
		for (int i = 0; i < s.length; i++) {
			System.out.println("Area: "+ s[i].area());
		}
	}

}
