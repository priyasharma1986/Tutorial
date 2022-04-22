package be.intecbrussels.notebook.entities.animals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import be.intecbrussels.notebook.entities.plants.Plant;

public class Omnivore extends Animal {
	
	private Set<Plant>plantDiet=new HashSet<>();
	private double maxFoodSize;
	
	
	public Omnivore(String name) {
		super(name);
		
	}

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		
	}
	
	public Omnivore(String name, double weight, double height, double length, Set<Plant>plantDiet, double maxFoofSize) {
		super(name, weight, height, length);
		this.plantDiet = plantDiet;
		this. maxFoodSize = maxFoodSize;
		
	}
	
	
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	
	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	


	
	public void addPlantToDiet(Plant plant) {
        
		for(Plant plants : plantDiet) {
			System.out.println(plants);
		}
			
	}

	@Override
	public String toString() {
		return "Omnivore [plantDiet=" + plantDiet + ", maxFoodSize=" + maxFoodSize + "]" + super.toString();
		
	}


	

}
