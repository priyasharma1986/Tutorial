package be.intecBrussels;

public class ComputerProgram {
	
	private String name;
	private int sizeInMB;
	private boolean usedRecently;
	private boolean hasVirus;
	
	
	
	public ComputerProgram(String name, int sizeInMB, boolean usedRecently, boolean hasVirus) {
		
		this.name = name;
		this.sizeInMB = sizeInMB;
		this.usedRecently = usedRecently;
		this.hasVirus = hasVirus;
		
	}



	public String getName() {
		return name;
		
	}



	public void setName(String name) {
		this.name = name;
		
	}



	public int getSizeInMB() {
		return sizeInMB;
		
	}



	public void setSizeInMB(int sizeInMB) {
		this.sizeInMB = sizeInMB;
		
	}


	public boolean isUsedRecently() {
		return usedRecently;
		
	}



	public void setUsedRecently(boolean usedRecently) {
		this.usedRecently = usedRecently;
		
	}


	public boolean isHasVirus() {
		return hasVirus;
		
	}



	public void setHasVirus(boolean hasVirus) {
		this.hasVirus = hasVirus;
		
	}



	@Override
	public String toString() {
		return "ComputerProgram [name=" + name + ", "
				+ "sizeInMB=" + sizeInMB + ", "
						+ "usedRecently=" + usedRecently
				+ ", hasVirus=" + hasVirus + "]";

	}
	
	
}	
	
	


