package in.co.rays.oop;

public class Rectangle extends Shape {
	private int base;
	private int length;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double area() {
		double area = length * base;
		return area;
	}

}
