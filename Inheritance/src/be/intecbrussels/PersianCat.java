package be.intecbrussels;

public class PersianCat extends Felis {
	
	public PersianCat() {
		
		
	}
	
	public PersianCat(String name, int age, int shelterNo, int badgeNo) {
		super(name, age, shelterNo, badgeNo);
		
	}
	
	public void miauw() {
		System.out.println("Persian cats miaaauuwws");
		
	}

	@Override
	public String toString() {
		return "PersianCat " + super.toString();
	}

}
