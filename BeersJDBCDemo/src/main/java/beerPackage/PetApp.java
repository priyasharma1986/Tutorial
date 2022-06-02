package beerPackage;

import javax.persistence.EntityManager;

import beerPackage.data.Dog;
import beerPackage.data.Owner;
import beerPackage.repositories.EMFactory;

public class PetApp {

	public static void main(String[] args) {

		
		
		EntityManager em = EMFactory.getEMF().createEntityManager();

	    Owner owner = new Owner( 1,"Shaggy");
		
		//Owner owner = em.find(Owner.class, 1);
		
		
		// Dog dog = new Dog( "Scooby doo",owner );
	
		em.getTransaction().begin();
		em.persist(owner);
		em.getTransaction().commit();
	
		
		
	//	System.out.println(owner.getDog());
		
	}

}
