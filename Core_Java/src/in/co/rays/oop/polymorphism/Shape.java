package in.co.rays.oop.polymorphism;

public class Shape {
	protected String color;
	protected int boderWidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBoderWidth() {
		return boderWidth;
	}
	public void setBoderWidth(int boderWidth) {
		this.boderWidth = boderWidth;
	}
	public double area() {
		return  0.0;
	}
	
	public static Shape getShape(int i) {
		if (i == 0) {
			return new Circle();
		} else if (i == 1) {
			return new Rectangle();			
		}else if(i ==2) {
			return new Trangle();			
		}
		return new Shape();
	}
}
