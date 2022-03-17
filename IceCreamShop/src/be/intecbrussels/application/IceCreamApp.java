package be.intecbrussels.application;

import be.intecbrussels.eatable.Cone;
import be.intecbrussels.eatable.Eatable;
import be.intecbrussels.eatable.Flavor;
import be.intecbrussels.eatable.IceRocket;
import be.intecbrussels.eatable.Magnum;
import be.intecbrussels.eatable.MagnumType;
import be.intecbrussels.sellers.IceCreamSalon;
import be.intecbrussels.sellers.IceCreamSeller;
import be.intecbrussels.sellers.PriceList;

public class IceCreamApp {

	public static void main(String[] args) {

		PriceList priceList = new PriceList();
		
		IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);
		
		Eatable eatables[] = new Eatable[3];
		
		IceRocket iceRocket = iceCreamSalon.orderIceRocket();
		eatables[0]=iceRocket;
		
		Cone cone=iceCreamSalon.orderCone(Flavor.values());
		eatables[1]=cone;
		
		Magnum magnum=iceCreamSalon.orderMagnum(MagnumType.ALPINENUTS);
		eatables[2]=magnum;
		
		
	//	for(Eatable eat :eatables) {
		//	eat.eat();
	//	}
		
		iceRocket.eat();
		cone.eat();
		magnum.eat();
		
	System.out.println("Total profit from iceCream sellar :"+iceCreamSalon.getProfit());
		
	}

}
