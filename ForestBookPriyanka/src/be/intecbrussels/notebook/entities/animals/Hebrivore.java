package be.intecbrussels.notebook.entities.animals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import be.intecbrussels.notebook.entities.plants.Plant;



public class Hebrivore extends Animal{
	


	private Set<Plant> plantDiet=new HashSet<>();
	
	
	
	public Hebrivore(String name) {
		super(name);
		
	}
	

	public Hebrivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		
	}
	
	public Hebrivore(String name, double weight, double height, double length, Set<Plant> plantDiet) {
		super(name, weight, height, length);
		this.plantDiet = plantDiet;
		
	}


	public Set<Plant> getPlantDiet() {
		

		return plantDiet;
	}


	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
		
	}
	
	public void addPlanToDiet( Plant plant) {
		plantDiet.add(plant);
	}
	
	public void printDiet() {
		
		for(Plant p : plantDiet ) {
			System.out.println(p);
			
		}
		
		
	}


	@Override
	public String toString() {
		return "Hebrivore [plantDiet=" + plantDiet + "]" + super.toString();
	}

	
}
