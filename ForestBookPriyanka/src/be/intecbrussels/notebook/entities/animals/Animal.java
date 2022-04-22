package be.intecbrussels.notebook.entities.animals;



public class Animal  implements Comparable<Animal>{

	private String name;
	private double weight;
	private double height;
	private double length;

	
	
	public Animal(String name) {
		this.name = name;
		
	}


	public Animal(String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
		
	}


	
	public String getName() {
		return name;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getLength() {
		return length;
	}

	
	public void setLength(double length) {
		this.length = length;
	}


	
	
	@Override
	public int compareTo(Animal o) {
		return this.getName().compareTo(o.getName());
		
	}

	

	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", height=" + height + ", length=" + length + "]";
		
	}


	
	
	
	
	
	
}

