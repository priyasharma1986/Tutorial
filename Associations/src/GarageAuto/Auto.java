package GarageAuto;

public class Auto {
	
	private String brandName;
	private String garage;
	
	
	public Auto(String brandName, String garage) {
	    this.brandName = brandName;
	    this.garage = garage;
	}
	public Auto(String brandName) {
	    this.brandName = brandName;
	}
	 public Auto(Auto auto) {
	     this.brandName = auto.brandName;
	     this.garage = auto.garage;
	 }
	public String getBrandName() {
	    return brandName;
	}
	
	public String getGarage() {
	    return garage;
	}
	public void setGarage(String garage) {
	    this.garage = garage;
	}
	public String toString() {
	    return "The car "  +getBrandName() + " is a sports car,it is only available in the garage " + getGarage();
	}
	
}

