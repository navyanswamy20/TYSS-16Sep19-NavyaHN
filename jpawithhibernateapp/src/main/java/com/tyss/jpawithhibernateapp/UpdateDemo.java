package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.ProductInfo;

public class UpdateDemo {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			//ProductInfo productInfo = entityManager.find(ProductInfo.class, 40);
			ProductInfo productInfo = entityManager.getReference(ProductInfo.class, 40);
			productInfo.setPname("Sharu");
			System.out.println("Record Updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}
}
