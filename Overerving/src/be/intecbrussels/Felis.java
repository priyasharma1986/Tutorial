package be.intecbrussels;

import java.util.Objects;

public  class Felis extends Animal{
	
	private static int vaccinationCount;
	private String name;
	private int age;
	private int shelterNo;
	private int badgeNo;
	private Animal Felis;
	
	
	
	{
		
				
		vaccinationCount++;
		
		
	}
	
	public Felis() {
		
	}
	

	public Felis( String name, int age, int shelterNo, int badgeNo) {
		this.name = name;
		this.age = age;
		this.shelterNo = shelterNo;
		this.badgeNo = badgeNo;
	}
	
	

	public Felis(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
		super(size, coat, color, weight);
		
	}
	

	public void miauw() {
		System.out.println("Miiiaaauuuwww");
		
	}
	
	
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}

	
	public int getShelterNo() {
		return shelterNo;
	}

	
	public void setShelterNo(int shelterNo) {
		if (shelterNo >=1  && shelterNo <= 999) {
			System.out.println("Shelter no should be between 1 - 999");
	      
	
			}
		
		this.shelterNo = shelterNo;
	}

	
	public int getBadgeNo() {
		return badgeNo;
	}

	
	public void setBadgeNo(int badgeNo) {
		if (badgeNo >= 1 && badgeNo <= 999) {
			System.out.println("Badge no should be between 1 - 999");
	    
		}
		this.badgeNo = badgeNo;
		
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(badgeNo, shelterNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Felis felis = (Felis) obj;
		return badgeNo == felis.badgeNo && shelterNo == felis.shelterNo;
		
	}

	
	public void miauw(int times) {
		System.out.println("The cat miauwed for 5 times ");
		
	}
	
	public void getNoVaccinatedCats() {
		System.out.println("these are the no of vaccinated cats.");
	
	}
	
	
	static int getvaccinationCount() {
		return vaccinationCount;
	}
	

	@Override
	public String toString() {
		return "Felis [name=" + name + ", age=" + age + ", shelterNo=" + shelterNo + ", badgeNo=" + badgeNo + "]";
	}

}
