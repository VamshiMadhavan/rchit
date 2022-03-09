package com.te.exm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.exm.model.Players;

@Repository
public class MyDataAccess {
	
	public boolean add(Players players) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricket");
			EntityManager m = emf.createEntityManager();
			EntityTransaction transaction = m.getTransaction();
			transaction.begin();
		
			m.persist(players);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
