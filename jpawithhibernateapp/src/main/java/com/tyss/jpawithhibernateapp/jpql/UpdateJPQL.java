package com.tyss.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateJPQL {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
	entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	String jpql = "update ProductInfo set pname='pencil' where pid=30";
	entityManager.createQuery(jpql);
	Query query = entityManager.createQuery(jpql);
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
