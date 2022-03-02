package be.intecbrussels;

public class CatApp {

	
	

	public static void main(String[] args) {

		
		
		Felis [] felis = new Felis[7];
		
		felis[0] = new TurkishVanCat("turkish cat", 2, 345, 123, "lucy" );
		felis[1] = new SiameseCat("Siamese cat", 5, 456, 234);
		felis[2] = new PersianCat("Persian cat", 6, 222,111);
		felis[3] = new AndeanMountainCat("Andean cats ", 3, 675,879);
		felis[4] = new NorwegianForestCat("Norwegian cat", 1, 555, 222);
		felis[5] = new SiameseCat("Siamese cat", 2,111,567);
		felis[6] = new PersianCat("Persian cat", 5, 444, 123);
		
		
		printFelis(felis);
		
		

		PersianCat pc = new PersianCat("Cat", 10, 333, 543);
		SiameseCat sc = new SiameseCat("Cat",4, 333, 543);
		
		System.out.println("Both cats have same badgenNo and shelterNo: " + pc.equals(sc));
		
		
	}

	private static void printFelis(Felis[] felis) {
		
		for (Felis f : felis) {
			System.out.println("Name of the cat is: " + f.toString());
		
		}
		
		
		System.out.println("Total animal object created: "+ Animal.getanimalCount());
		System.out.println("Total vaccination count is: "+ Felis.getvaccinationCount());
		
		
	}
	


}
