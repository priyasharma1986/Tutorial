package be.intecbrussels;

public class AndeanMountainCat extends Felis{
	
	
	public AndeanMountainCat() {
		
	}
	
	
	
	public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
		super(name, age, shelterNo, badgeNo);
		
	}
	
	public void miauw(String customSound) {
		System.out.println("Custom sound is miaauuuwww");
		
		
	}
	
	public void isAlive(){
		
		System.out.println("This cat is not alive anymore");
		
		}
	
	public  boolean setIsAlive(boolean alive ) {
		return true;
		
	}
	public boolean getIsAlive() {
		return false;
		
	}
	
	
	

	@Override
	public String toString() {
		return "AndeanMountainCat " + super.toString();
	}
	
	
	

}
