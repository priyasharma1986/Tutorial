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
		
		
		
		

		@Override
		public String toString() {
			return "AndeanMountainCat " + super.toString();
		}
		
		
		

	}


