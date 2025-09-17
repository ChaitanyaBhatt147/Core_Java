package in.co.rays.oop.constructor;

public class Trangle extends Shape{
	private int height;
	private int base;
	public Trangle(int height , int base) {
		this.height = height;
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	@Override
	public double area() {
		double area  = 0.5* height * base;
		return area;
	}
}
