package be.intecbrussels.application;

import be.intecbrussels.eatable.Cone;
import be.intecbrussels.eatable.Eatable;
import be.intecbrussels.eatable.Flavor;
import be.intecbrussels.eatable.IceRocket;
import be.intecbrussels.eatable.Magnum;
import be.intecbrussels.eatable.MagnumType;
import be.intecbrussels.sellers.IceCreamCar;
import be.intecbrussels.sellers.IceCreamSalon;
import be.intecbrussels.sellers.IceCreamSeller;
import be.intecbrussels.sellers.PriceList;
import be.intecbrussels.sellers.Stock;

public class IceCreamApp2 {

	public static void main(String[] args) {

		PriceList priceList = new PriceList();
		Stock stock = new Stock();
		
		IceCreamSeller iceCreamCar = new IceCreamCar(priceList, stock);
		
		Eatable eatables[] = new Eatable[3];
		
		IceRocket iceRocket = iceCreamCar.orderIceRocket();
		eatables[0]=iceRocket;
		
		Cone cone=iceCreamCar.orderCone(Flavor.values());
		eatables[1]=cone;
		
		Magnum magnum=iceCreamCar.orderMagnum(MagnumType.ALPINENUTS);
		eatables[2]=magnum;
		
		
		for(Eatable eat :eatables) {
			eat.eat();
		}
		
		//iceRocket.eat();
		//cone.eat();
		//magnum.eat();
		
	System.out.println("Total profit from iceCream car :"+iceCreamCar.getProfit());
		
	}

}
