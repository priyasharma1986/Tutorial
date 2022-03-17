package be.intecbrussels.sellers;

import be.intecbrussels.eatable.Cone;
import be.intecbrussels.eatable.Flavor;
import be.intecbrussels.eatable.IceRocket;
import be.intecbrussels.eatable.Magnum;
import be.intecbrussels.eatable.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
	
	private PriceList priceList;
	private double totalProfit;
	
	@Override
	public double getProfit() {
		return totalProfit;
		
	}
	
	@Override
	public Cone orderCone(Flavor[] flavors) {
		totalProfit =  totalProfit+20;
		return new Cone(flavors);
	}
	
	@Override
	public IceRocket orderIceRocket() {
		totalProfit = totalProfit+10;
		return new IceRocket();
		
	}
	
	@Override
	public Magnum orderMagnum(MagnumType magnum) {
		totalProfit = totalProfit+50;
		return new Magnum(magnum);
		
	}
	
	public IceCreamSalon(PriceList priceList) {
		super();
		this.priceList = priceList;
		
	}
	
	
	
}
