package be.intecbrussels;

public class SiameseCat extends Felis{
	
	
	public SiameseCat() {
		
	}
	
	public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
		super(name, age, shelterNo, badgeNo);
		
	}

	@Override
	public String toString() {
		return "SiameseCat " + super.toString();
	}
	
	

}
