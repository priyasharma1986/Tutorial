package beerPackage;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import beerPackage.data.SuperHero;
import beerPackage.data.SuperVillain;


public class BeerApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("priyankalDatabase");
		EntityManager em = emf.createEntityManager();
	
		SuperHero superHero = new SuperHero("BatMan","Money");
		SuperVillain superVillain = new SuperVillain("Joker","A Sense of Humor");
	
		em.getTransaction().begin();
		em.persist(superVillain);
		em.getTransaction().commit();		
	/*
		Query query = em.createQuery("Select v from SuperVillain v");
		List<SuperVillain> list = query.getResultList();	
		
		
		for (SuperVillain sv: list) {
			System.out.println(sv);
		}
		
		
		
	
		SuperVillain superVillain = em.find(SuperVillain.class, 1);
		
		System.out.println(superVillain);
		
	    em.getTransaction().begin();
		superVillain.setSuperPower("Money And Robots");
	  //  em.remove(superVillain);
		em.persist(superVillain);
		em.getTransaction().commit();
		
		*/
		
	}
}
