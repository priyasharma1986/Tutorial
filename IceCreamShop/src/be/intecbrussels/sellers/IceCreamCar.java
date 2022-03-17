package be.intecbrussels.sellers;

import be.intecbrussels.eatable.Cone;
import be.intecbrussels.eatable.Flavor;
import be.intecbrussels.eatable.IceRocket;
import be.intecbrussels.eatable.Magnum;
import be.intecbrussels.eatable.MagnumType;

public class IceCreamCar  implements IceCreamSeller{
	
	
	private PriceList priceList;
	private Stock stock;
	private double profit;
	
	
	
	
	public IceCreamCar(PriceList priceList, Stock stock) {
		
		super();
		this.priceList = priceList;
		this.stock = stock;
		
	}

	
	private Cone prepareCone (Flavor[] flavors) {
		return new Cone(flavors);
		
	}
	
	
	private IceRocket prepareRocket() {
		
		return new IceRocket();
		
	}
	
	
	private Magnum prepareMagnum(MagnumType magnum) {
		
		return new Magnum(magnum);
	}

	
	@Override
	public double getProfit() {

		return profit;
	}

	
	@Override
	public Cone orderCone(Flavor[] flavors) {
		profit = profit+15;
		return prepareCone(flavors);
		
	}
	
	
	@Override
	public IceRocket orderIceRocket() {
		profit = profit+10;
		return  prepareRocket();
		
	}
	
	
	@Override
	public Magnum orderMagnum(MagnumType magnum) {
		profit = profit+50;
		return prepareMagnum(magnum);
		
	}
	
}