package be.intecBurssels;

public class Animal {
	
	private String name;
	
	public void Animal() {
		
	}
	
	
	public void Animal(String name) {
		this.name =  name;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println("It is running");
	}
	
	public void makeNoise() {
		System.out.println("This animal is making sound");
		
	}

}
