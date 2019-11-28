package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.ProductInfo;

public class ReadDemo {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	//ProductInfo productDetail = entityManager.find(ProductInfo.class, 10);
	ProductInfo productDetail = entityManager.getReference(ProductInfo.class, 10);
	System.out.println("Product ID is--->"+productDetail.getPid()); 
	System.out.println("Product Name  is--->"+productDetail.getPname()); 
	System.out.println("Product Quantity is--->"+productDetail.getQuantity()); 
	entityManager.close();
}
}
