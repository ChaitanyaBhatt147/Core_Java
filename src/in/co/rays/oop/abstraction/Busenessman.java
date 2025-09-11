package in.co.rays.oop.abstraction;

public class Busenessman extends Person implements Richman{

	@Override
	public void earnMoney() {
		System.out.println(getName()+" earns Money.");
		
	}

	@Override
	public void donate() {
		System.out.println(getName()+" donates Money.");
				
	}

	@Override
	public void party() {
		System.out.println(getName()+" doing party.");
		
	}

}
