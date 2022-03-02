package be.intecbrussels;

public class Panthera extends Animal {
	
	public Panthera() {
		
	}
	
	public Panthera(char size, char coat, String color, double weight) {
		super(size, coat, color, weight);
		
	}
	
	public void roar(String roarr) {
		
		System.out.println("Cats that roar lions, tigers, leopards, snow leopards, clounded leopard and jaguars.");
	
	}
	
	
	@Override
	public String toString() {
		return "Panthera " + super.toString();
	}

	public void hunt() {
		
		System.out.println("They are out fot hunting");
	
	}
	

}
