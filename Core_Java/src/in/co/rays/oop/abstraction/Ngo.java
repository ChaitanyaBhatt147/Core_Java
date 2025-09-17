package in.co.rays.oop.abstraction;

public class Ngo extends Person implements SocialWorker{

	@Override
	public void helpToOuther() {
		System.out.println(getName()+" NGO is formed to helps outher.");
		
	}

}
