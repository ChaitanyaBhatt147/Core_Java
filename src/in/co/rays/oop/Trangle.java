package in.co.rays.oop;

public class Trangle extends Shape {
	private int base;
	private int hight;

	@Override
	public double area() {
		double area = 0.5 * base * hight;
		return area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

}
