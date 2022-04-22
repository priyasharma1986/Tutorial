package be.intecbrussels.notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import be.intecbrussels.notebook.entities.animals.Animal;
import be.intecbrussels.notebook.entities.animals.Carnivare;
import be.intecbrussels.notebook.entities.animals.Hebrivore;
import be.intecbrussels.notebook.entities.animals.Omnivore;
import be.intecbrussels.notebook.entities.plants.Plant;



public class ForestNotebook {
	
	
	private List<Carnivare> carnivores = new ArrayList<>();
	private List<Omnivore> omnivores = new ArrayList<>();;
	private List<Hebrivore> herbivore = new ArrayList<>();;
	private  int animalCount;
	private  int plantCount;
	private List<Animal> animals = new ArrayList<>(); ;
	private List<Plant> plants = new ArrayList<>();;

	
	
	public ForestNotebook() {
		
		
	}

	

	public List<Carnivare> getCarnivores() {
		carnivores.add(new Carnivare("Lion",123.45,153.45,120.45,45.6));
		carnivores.add(new Carnivare("Tiger",123.45,153.45,120.45,76));
		carnivores.forEach(System.out::println);
		return carnivores;
	}


	public void setCarnivores(List<Carnivare> carnivores) {
		this.carnivores = carnivores;
	}


	public List<Omnivore> getOmnivores() {
		omnivores.add(new Omnivore("Raccoon",30.34,42,13));
		omnivores.add(new Omnivore("Bear",200.50,102,67));
		omnivores.forEach(System.out::println);
		return omnivores;
		
	}


	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
		
	}


	public List<Hebrivore> getHerbivore() {
		herbivore.add(new Hebrivore("Sheep",23.4,67,34));
		herbivore.add(new Hebrivore("Horse",23.4,67,34));
		herbivore.forEach(System.out::println);
		return herbivore;
	}


	public void setHerbivore(List<Hebrivore> herbivore) {
		this.herbivore = herbivore;
		
	}


	public  int getAnimalCount() {
		return animalCount;
	}


	public  int getPlantCount() {
		return plantCount;
		
	}
	
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
		animalCount++;
	
	}
	
	
	public void addPlant(Plant plant) {
		
		plants.add(plant);
		plantCount++;
					
	}
	
	
	public void printNotebook() {
		

		for(Animal animal : animals) {
			System.out.println(animal);
				
		}
		
		
		for(Plant plant : plants) {
			System.out.println(plant);
			
		}
		
	
	}
	
	public void sortAnimalsByName() {
		
		animals.sort(Comparator.comparing(Animal::getName));
		
	}
	
	public void sortPlantsByName() {
		plants.sort(Comparator.comparing(Plant::getName));
		
	}
	
	public void sortAnimalsByHeight() {
		
		animals.sort(Comparator.comparingDouble(Animal::getHeight));

	}
	
	public void sortPlantsByHeight() {
		
		plants.sort(Comparator.comparingDouble(Plant::getHeight));

		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(animalCount, animals, carnivores, herbivore, omnivores, plantCount, plants);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForestNotebook other = (ForestNotebook) obj;
		return animalCount == other.animalCount && Objects.equals(animals, other.animals)
				&& Objects.equals(carnivores, other.carnivores) && Objects.equals(herbivore, other.herbivore)
				&& Objects.equals(omnivores, other.omnivores) && plantCount == other.plantCount
				&& Objects.equals(plants, other.plants);
	}

		
	
}

	
	
	



