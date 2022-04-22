package be.intecbrussels.notebook.entities.plants;



public class Plant implements Comparable<Plant> {

	
	private String name;
	private double height;

	
	
	public Plant(String name) {
		this.name = name;
		
	}
	



	public String getName() {
		return name;
		
	}



	public double getHeight() {
		return height;
		
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public int compareTo(Plant o) {
		return this.getName().compareTo(o.getName());
		
	}

	public Plant(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}



	@Override
	public String toString() {
		return "Plant [name=" + name + ", height=" + height + "]" ;
	}

	
}
