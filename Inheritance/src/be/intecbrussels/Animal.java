package be.intecbrussels;

public class Animal {

	
		
		private static int animalCount;
		private char size;
		private char coat;
		private String color;
		private double weight;
		
		
		{
			animalCount++;
			
		}
		
		
		public Animal() {
			
			
		}

		
		public Animal(char size, char coat, String color, double weight) {
			
			this.size = size;
			this.coat = coat;
			this.color = color;
			this.weight = weight;
			
		}
		
		
		
		public void makeNoise(String sound) {
			System.out.println("This animal is making sound");
			
			
		}
		public void eat() {
			System.out.println("The animal is eating");
			
		}
		
		public void sleep() {
			System.out.println("The animal is sleeping");
		}
		
		public void  isAlive( boolean alive) {
			
			System.out.println("They are alive");
			
			
		}
		

		@Override
		public String toString() {
			return "Animal [size=" + size + ", coat=" + coat + ", color=" + color + ", weight=" + weight + "]";
		}
		
		
		public char getSize() {
			return size;
		}
		
		public void setSize(char size) {
			this.size = size;
		}
		
		public char getCoat() {
			return coat;
		}
		
		public void setCoat(char coat) {
			this.coat = coat;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		
		public static int getanimalCount() {
			return animalCount;
		}
		
		
	}



