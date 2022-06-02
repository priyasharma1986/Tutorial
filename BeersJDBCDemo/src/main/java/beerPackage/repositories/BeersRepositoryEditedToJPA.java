package beerPackage.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import beerPackage.data.Beers;

public class BeersRepositoryEditedToJPA {
	
	

    public void createOne(Beers beers) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(beers);
        em.getTransaction().commit();

    }

    public Beers findOneById(int id) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        return em.find(Beers.class, id);
    }

    public List<Beers> findAll() {
       EntityManager em = EMFactory.getEMF().createEntityManager();
        Query query = em.createQuery("Select v from Beers v");
        return query.getResultList();
    }

    public void updateOne(Beers beers) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(beers);
        em.getTransaction().commit();

    }

    public  void deleteOne(int id) {
        EntityManager em = EMFactory.getEMF().createEntityManager();
        Beers beers = findOneById(id);
        em.getTransaction().begin();
        em.remove(beers);
        em.getTransaction().commit();

	}
	
	
	
	


	}


