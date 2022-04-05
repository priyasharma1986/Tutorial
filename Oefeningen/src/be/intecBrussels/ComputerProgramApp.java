package be.intecBrussels;

public class ComputerProgramApp {

	public static void main(String[] args) {
		

		ComputerProgram program1 = new ComputerProgram("Word", 250, true, false); 
		ComputerProgram program2 = new ComputerProgram("PhotoShop", 1024, false, false);
		ComputerProgram program3= new ComputerProgram("Intellij", 1500, true, false); 
		ComputerProgram program4 = new ComputerProgram("LimeWire", 144, false, true); 
		ComputerProgram program5= new ComputerProgram("FireFox", 699, false, false); 
		ComputerProgram program6= new ComputerProgram("Excel", 250, false, false); 
		ComputerProgram program7 = new ComputerProgram("UTorrent", 400, true, true); 
		ComputerProgram program8 = new ComputerProgram("Final Fantasy XIV", 2000, true, false); 
	
		
		ComputerProgram [] allPrograms ={ program1, program2, program3, program4, program5,program6, program7, program8};
	
	
		for(int i = 0; i<allPrograms.length; i++) {
			if(allPrograms[i].isHasVirus() == true) {
				allPrograms[i].setHasVirus(false);

			}
			System.out.println(allPrograms[i]);

		}
		
		System.out.println("Unistalling the computers");
		
		
		for(int j = 0; j<allPrograms.length; j++) {
			if(allPrograms[j].getSizeInMB()>= 500 && allPrograms[j].isUsedRecently() == false) {
				allPrograms[j].setSizeInMB(0);
			}
			
			System.out.println(allPrograms[j]);
		}
		
	}	
		
	
	
	}


