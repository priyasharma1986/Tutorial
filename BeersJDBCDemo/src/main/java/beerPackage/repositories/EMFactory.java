package beerPackage.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class EMFactory {
	
	public static EntityManagerFactory getEMF() {
		
		return Persistence.createEntityManagerFactory("priyankaDatabase");
		
		
	}

}
