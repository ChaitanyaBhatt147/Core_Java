package in.co.rays.oop.polymorphism;

public class Rectangle extends Shape{
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public double area() {
		double area = length * width;
		return area;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
}
