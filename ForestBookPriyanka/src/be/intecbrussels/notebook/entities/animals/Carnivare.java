package be.intecbrussels.notebook.entities.animals;

public class Carnivare extends Animal{

	
	
	private double maxFoodSize;
	
	
	public Carnivare(String name) {
		super(name);
		
	}
	
	public Carnivare(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		
	}
	
	public Carnivare(String name, double weight, double height, double length,double maxFoodSize) {
		super(name, weight, height, length);
		this.maxFoodSize = maxFoodSize;
		
	}
	

	
	public double getMaxFoodSize() {
		return maxFoodSize;
		
	}

	
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
		
	}

	@Override
	public String toString() {
		return "Carnivare [maxFoodSize=" + maxFoodSize + "]" + super.toString();
	}

	
	
	
	

}
