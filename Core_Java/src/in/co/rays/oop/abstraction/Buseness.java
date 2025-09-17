package in.co.rays.oop.abstraction;

public class Buseness extends Person implements Richman, SocialWorker{

	@Override
	public void helpToOuther() {
		System.out.println(getName()+" helps to outhers.");
		
	}

	@Override
	public void earnMoney() {
		System.out.println(getName()+" earns money.");
		
	}

	@Override
	public void donate() {
		System.out.println(getName()+" donates money.");
		
	}

	@Override
	public void party() {
		System.out.println(getName()+" never do party.");
		
	}

}
