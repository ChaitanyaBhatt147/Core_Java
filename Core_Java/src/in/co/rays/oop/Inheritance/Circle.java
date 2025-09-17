package in.co.rays.oop.Inheritance;

public class Circle extends Shape {
	private int radious;

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	public double area() {
		double area = Math.PI * radious * radious;
		return area;
	}
}
