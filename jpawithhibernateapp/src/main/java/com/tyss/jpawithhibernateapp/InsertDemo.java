package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.ProductInfo;

public class InsertDemo {
	public static void main(String[] args) {
		
		
		ProductInfo productinfo = new ProductInfo();
		productinfo.setPid(20);
		productinfo.setPname("kalli");
		productinfo.setQuantity(15);

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productinfo);
		System.out.println("record inserted");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		}
		}
