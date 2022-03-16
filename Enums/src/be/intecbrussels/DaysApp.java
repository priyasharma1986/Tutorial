package be.intecbrussels;

public class DaysApp {

	public static void main(String[] args) {


		Days[] listOfDays = Days.values();
		
		for(Days d: listOfDays) {
			System.out.println("name :: " + d.name());
			System.out.println("ordinal :: " + d.ordinal());
			System.out.println("toString :: " + d);
			System.out.println();
			
			
			
		}
		
		
		
	}

}
