package be.intecbrussels.sellers;

public class PriceList {
	
	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;
	
	
	public PriceList() {
		
	}
	
	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice ) {
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
		
	}

	public double getBallPrice() {
		return ballPrice;
	}

	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public double getMagnumStandardPrice() {
		return magnumStandardPrice;
	}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public double getRocketPrice() {
		return rocketPrice;
	}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}
	
	

}
