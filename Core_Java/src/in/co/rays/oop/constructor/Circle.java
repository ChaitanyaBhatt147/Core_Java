package in.co.rays.oop.constructor;

public class Circle extends Shape {
	private int radious;

	public int getRadious() {
		return radious;
	}

	public Circle(int radious) {
		this.radious = radious;
	}

	@Override
	public double area() {
		double area = Math.PI * radious * radious;
		return area;
	}
}
