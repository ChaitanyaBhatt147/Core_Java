package in.co.rays.oop.Inheritance;

public class Trangle extends Shape{
	private int hight;
	private int base;
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public double area() {
		double area = 0.5 * hight * base;
		return area;
	}
}
