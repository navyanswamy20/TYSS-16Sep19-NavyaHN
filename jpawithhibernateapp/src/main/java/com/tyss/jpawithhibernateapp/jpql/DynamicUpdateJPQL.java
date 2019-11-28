package com.tyss.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateJPQL {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update ProductInfo set pname=:name where pid=:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("name", "book");
		query.setParameter("id", 10);
		int count=query.executeUpdate();
		entityTransaction.commit();
		System.out.println(count+ " rows updated");
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		entityManager.close();
	}
	}
	}
