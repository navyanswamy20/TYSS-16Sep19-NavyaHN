package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.ProductInfo;

public class ReAttachingDemo {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		ProductInfo productInfo = entityManager.getReference(ProductInfo.class, 10);
		System.out.println(entityManager.contains(productInfo)); 
		entityManager.detach(productInfo);
		System.out.println(entityManager.contains(productInfo));
		ProductInfo productInfo2 = entityManager.merge(productInfo);
		productInfo2.setQuantity(18);
		entityManager.clear();//detach all the objects
		System.out.println("Record Updated");
		entityTransaction.commit();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
