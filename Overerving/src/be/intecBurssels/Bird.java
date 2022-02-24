package be.intecBurssels;

public class Bird extends Animal{
	
	public void Bird() {
		
	}
	
	public void Bird(String name){
		super.setName("Lucy");

		
	}

	public void move() {
		System.out.println("Parrot is flying.");
		
	}
	
	public void makeNoise() {
		System.out.println("Parrot is making weird sounds.");
		
	}
}
