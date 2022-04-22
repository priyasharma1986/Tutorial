package be.intecbrussels.notebook.entities.plants;

public class Bush extends Plant {
	
	
	private String fruit;
	private LeafType leafType;
	
	

	public Bush(String name) {
		super(name);
		
	}
	

	public Bush(String name, double height) {
		super(name, height);
		
	}
	

	public Bush(String name,double height, String fruit, LeafType leafType) {
		super(name,height);
		this.fruit = fruit;
		this.leafType = leafType;
	}

	public LeafType getLeafType() {
		return leafType;
	}



	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}



	public String getFruit() {
		return fruit;
	}

	
	public void setFruit(String fruit) {
		this.fruit = fruit;
		
	}


	@Override
	public String toString() {
		return "Bush [fruit=" + fruit + ", leafType=" + leafType + "]" + super.toString();
	}


	




	

	

	
	



}
