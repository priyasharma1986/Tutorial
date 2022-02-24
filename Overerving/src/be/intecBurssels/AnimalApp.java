package be.intecBurssels;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.setName("Lion");
		System.out.println("The name of animal is: " + animal.getName());
		
		
		animal.move();
		animal.makeNoise();
		
		Animal animal2 = new Animal();
		animal.setName("Cat");
		System.out.println("The name of animal is: " + animal.getName());
		Cat cat = new Cat();
		cat.move();
		cat.makeNoise();
		
		
		Animal animal3 = new Animal();
		animal.setName("Fish");
		System.out.println("The name of animal is: " + animal.getName());
		Fish fish = new Fish();
		fish.move();
		fish.makeNoise();
		
		
		Animal animal4 = new Animal();
		animal.setName("Parrot");
		System.out.println("The name of animal is: " + animal.getName());
		Bird bird = new Bird();
		bird.move();
		bird.makeNoise();
		
		
		Animal animal5 = new Animal();
		animal.setName("Snake");
		System.out.println("The name of animal is: " + animal.getName());
		Snake snake = new Snake();
		snake.move();
		snake.makeNoise();
		
		
		
		

	}

}
