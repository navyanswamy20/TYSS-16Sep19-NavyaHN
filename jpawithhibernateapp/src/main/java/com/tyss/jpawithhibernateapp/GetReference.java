package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.ProductInfo;

public class GetReference {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
	 entityManager = entityManagerFactory.createEntityManager();
		ProductInfo productInfo = entityManager.getReference(ProductInfo.class, 100);
		System.out.println(productInfo.getPid());
		System.out.println(productInfo.getPname());
		System.out.println(productInfo.getQuantity());
		
}
}
