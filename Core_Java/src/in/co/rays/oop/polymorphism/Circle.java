package in.co.rays.oop.polymorphism;

public class Circle extends Shape{
	private int radious;

	public void setRadious(int radious) {
		this.radious = radious;
	}

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
	public Circle() {
		// TODO Auto-generated constructor stub
	}
}
