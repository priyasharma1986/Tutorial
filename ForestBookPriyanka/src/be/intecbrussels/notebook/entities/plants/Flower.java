package be.intecbrussels.notebook.entities.plants;

public class Flower extends Plant {

	
	private Scent smell;
	

	public Flower(String name) {
		super(name);
		
	}
	
	public Flower(String name,Scent smell) {
		super(name);
		this.smell = smell;
		
	}
	
	public Flower(String name, double height, Scent smell) {
		super(name, height);
		this.smell = smell;
		
	}
	
	
	public Flower(String name, double height) {
		super(name, height);

	}
	
	
	public Scent getSmell() {
		return smell;
	}


	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {
		return "Flower [smell=" + smell + "]" + super.toString();
	}


		
	
	

	


	
}
