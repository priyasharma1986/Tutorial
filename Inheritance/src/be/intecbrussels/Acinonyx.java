package be.intecbrussels;

public class Acinonyx extends Animal {
	
private  double speed;
	
	public Acinonyx() {
		
	}
	
	public Acinonyx(double speed) {
		this.speed = speed;
		
	}
	
	public Acinonyx(char size, char coat, String color, double weight) {
		super(size, coat, color, weight);
		
	}
	
	@Override
	public String toString() {
		return "Acinonyx [speed=" + speed + "]";
	}
	
	public double getSpeed() {
		return speed;
	}

	

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void run(double distance) {
		this.speed= distance;
		
	}
	
	public void kiauuww() {
		System.out.println("Kiauuwwwww");
		
	}
	

	

}
