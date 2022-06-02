package beerPackage.data;

public class Brewers {
	
	
	private String Name;
	private int Id;
	
	public Brewers() {
	}
	
	public Brewers(String name, int id) {
	
		Name = name;
		Id = id;
	}
	
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Brewers [Name=" + Name + ", Id=" + Id + "]";
	}
	
	

}
