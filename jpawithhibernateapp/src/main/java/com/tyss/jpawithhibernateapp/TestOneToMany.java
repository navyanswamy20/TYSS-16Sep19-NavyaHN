package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.onetomany.Pencil;
import com.tyss.jpawithhibernateapp.onetomany.PencilBox;

public class TestOneToMany {

	public static void main(String[] args) {
		PencilBox peBox = new PencilBox();
		peBox.setBid(2);
		peBox.setBname("apsara");
		

		Pencil p = new Pencil();
		p.setPid(10);
		p.setColor("red");
		p.setPencilBox(peBox);

		Pencil p1 = new Pencil();
		p1.setPid(20);
		p1.setColor("blue");
		p1.setPencilBox(peBox);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("record inserted");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
