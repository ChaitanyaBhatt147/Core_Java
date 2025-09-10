package in.co.rays.oop;

public class Automobile {
	private String color;
	private String make;
	private int speed;
	private int noOfGares = 5;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accleration() {
		this.speed = this.speed + 10;
		System.out.println("Now the corrent speed of the car is: "+this.speed+ " Km/h");
	}
	public void Break() {
		if (this.speed == 0) {
			System.out.println("Break cann't be applied as the car is alrady in study position.");
		} else {
			this.speed = this.speed - 10;
			System.out.println("Now the corrent speed of the car is: "+this.speed+ " Km/h");
		}
	}
	public void changeGare(int gare) {
		if (gare > 0&& gare <= noOfGares) {
			System.out.println("Gare changed to: "+gare);
		} else {
			System.out.println("Invalid gare selected. Plese select the gare in between 1 to "+noOfGares);
		}
		
	}
}
