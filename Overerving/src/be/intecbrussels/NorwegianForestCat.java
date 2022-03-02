package be.intecbrussels;

public class NorwegianForestCat extends Felis {
	
	public NorwegianForestCat() {
		
	}

	public NorwegianForestCat( String name,int age, int shelterNo, int badgeNo) {
		super(name,age,shelterNo,badgeNo);
		
	}
	
	public void miauwInNorvegian() {
		System.out.println("Norwegian cats miauws in norwegian");
		
	}

	@Override
	public String toString() {
		return "NorwegianForestCat " + super.toString();
	}
}
