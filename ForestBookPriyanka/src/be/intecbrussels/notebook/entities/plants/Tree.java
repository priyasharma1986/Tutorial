package be.intecbrussels.notebook.entities.plants;



public class Tree extends Plant{
	
	
	private LeafType leafType;
	
	
	public Tree(String name) {
		super(name);
		
	}
	
	
	public Tree(String name, double height) {
		super(name, height);
		
	}
	
	public Tree(String name, double height, LeafType leafTyfe) {
		super(name, height);
		this.leafType = leafType;
		
	}
	
	
	
	public Tree(String name, LeafType leafType) {
		super(name);
		this.leafType = leafType;
	}


	public LeafType getLeafType() {
		return leafType;
	}


	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}


	@Override
	public String toString() {
		return "Tree [leafType=" + leafType + "]" + super.toString();
	}


	
	
	
	
	

}
