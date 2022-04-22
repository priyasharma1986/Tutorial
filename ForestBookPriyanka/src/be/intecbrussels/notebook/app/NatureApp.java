package be.intecbrussels.notebook.app;

import java.util.LinkedHashSet;
import java.util.Set;

import be.intecbrussels.notebook.entities.animals.Animal;
import be.intecbrussels.notebook.entities.animals.Carnivare;
import be.intecbrussels.notebook.entities.animals.Hebrivore;
import be.intecbrussels.notebook.entities.animals.Omnivore;
import be.intecbrussels.notebook.entities.plants.Bush;
import be.intecbrussels.notebook.entities.plants.Flower;
import be.intecbrussels.notebook.entities.plants.LeafType;
import be.intecbrussels.notebook.entities.plants.Plant;
import be.intecbrussels.notebook.entities.plants.Scent;
import be.intecbrussels.notebook.entities.plants.Tree;
import be.intecbrussels.notebook.entities.plants.Weed;
import be.intecbrussels.notebook.service.ForestNotebook;




public class NatureApp {

	public static void main(String[] args) {

		
		Set<Plant> plantDiet = new LinkedHashSet<>();
		ForestNotebook forestNotebook = new ForestNotebook();
		
		
		Plant plant = new Bush ("yew",10.45, "MiniCherries",LeafType.HAND);
		Plant plant2 = new Flower("Rose",13.20,Scent.MUSKY);
		Plant plant3 = new Flower("Tulips", 12.32,Scent.EARTHY);
		Plant plant4 = new Tree("CherryTree", 300.23, LeafType.ROUND);
		Plant plant5 = new Weed("Cannabis",5.87,100.05);
		
		forestNotebook.addPlant(plant);
		forestNotebook.addPlant(plant2);
		forestNotebook.addPlant(plant3);
		forestNotebook.addPlant(plant4);
		forestNotebook.addPlant(plant5);
		
		plantDiet.add(plant);
		plantDiet.add(plant2);
		plantDiet.add(plant3);
		plantDiet.add(plant4);
		plantDiet.add(plant5);
	
		Animal animal = new Hebrivore("Cow",123.45,153.45,120.56);
		Animal animal1 = new Omnivore("Bear",123.45,153.45,120.45);
		Animal animal2 = new Carnivare("Lion",123.45,153.45,120.45,45.6);
		Animal animal3 = new Carnivare("Tiger",123.45,153.45,120.45,76);
		Animal animal4 = new Animal("Rabbit",123.45,153.45,120.45);
		Animal animal5 = new Animal("Deer",123.45,153.45,120.45);
		Hebrivore sheep = new Hebrivore("Sheep",23.4,67,34);
		sheep.addPlanToDiet(plant);
		Hebrivore horse = new Hebrivore("Horse",120,89.7,67);
		horse.addPlanToDiet(plant2);
		Carnivare lion = new Carnivare("Lion",167,78,89.5,4);
		lion.setMaxFoodSize(4);
		Carnivare tiger = new Carnivare("Tiger",156,78,69.5,2);
		tiger.setMaxFoodSize(2);
		Omnivore bear = new Omnivore("Bear",200.50,102,67);
		bear.setMaxFoodSize(3);
		bear.addPlantToDiet(plant5);
		Omnivore raccoon = new Omnivore("Raccoon",30.34,42,13);
		raccoon.addPlantToDiet(plant4);
		raccoon.setMaxFoodSize(1);

		
		forestNotebook.addAnimal(animal);
		forestNotebook.addAnimal(animal1);
		forestNotebook.addAnimal(animal2);
		forestNotebook.addAnimal(animal3);
		forestNotebook.addAnimal(animal4);
		forestNotebook.addAnimal(animal5);
		forestNotebook.addAnimal(raccoon);
		forestNotebook.addAnimal(bear);
		forestNotebook.addAnimal(sheep);
		forestNotebook.addAnimal(horse);
		forestNotebook.addAnimal(lion);
		forestNotebook.addAnimal(tiger);
		

		System.out.println("Total animals counted: "+forestNotebook.getAnimalCount());
		System.out.println("Total plants counted: "+ forestNotebook.getPlantCount());
		

		System.out.println("Unsorted list of Plants & Animals: ");
		forestNotebook.printNotebook();
		
	
		System.out.println("Sorting Animals by name : ");
		forestNotebook.sortAnimalsByName();
	
		System.out.println("Sorting Plants by name : ");
		forestNotebook.sortPlantsByName();

		
		System.out.println("Sorting animal by their height:");
		forestNotebook.sortAnimalsByHeight();
		
		
		System.out.println("Sorting plant by their height:");
		forestNotebook.sortPlantsByHeight();

        System.out.println("Herbivores Animals: ");
		forestNotebook.getHerbivore();
		
        System.out.println("Carnivores Animals: ");
		forestNotebook.getCarnivores();
		
        System.out.println("Omnivores Animals: ");
		forestNotebook.getOmnivores();
		
		
	}
	
	

}
