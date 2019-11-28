package com.tyss.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteJPQL {
	public static void main(String[] args) {
		
	
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
	entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	String jpql = "delete from ProductInfo where pid=40";
	entityManager.createQuery(jpql);
	Query query = entityManager.createQuery(jpql);
	int count=query.executeUpdate();
	entityTransaction.commit();
	System.out.println(count+ " rows deleted");
}catch(Exception e) {
	e.printStackTrace();
}finally {
	entityManager.close();
	
}
}
}
