package be.intecbrussels.eatable;

import java.util.Arrays;

public class Cone implements Eatable{
	
	
	private Flavor[] balls;

	
	public Cone() {
		
		
	}
	
	public Cone(Flavor[] balls) {
		
		this.balls = balls;
				
			
	}	
		

	
	@Override
	public void eat() {
		Flavor[] balls = Flavor.values();
		System.out.println("Eating icecream in cone and available flavors are " + Arrays.toString(balls) );
		
	}
	

}
