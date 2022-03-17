package be.intecbrussels.sellers;

import be.intecbrussels.eatable.Cone;
import be.intecbrussels.eatable.Flavor;
import be.intecbrussels.eatable.IceRocket;
import be.intecbrussels.eatable.Magnum;
import be.intecbrussels.eatable.MagnumType;

public interface IceCreamSeller extends Profitable {

	Cone orderCone(Flavor[] flavors);

	IceRocket orderIceRocket();

	Magnum orderMagnum(MagnumType magnum);

}
