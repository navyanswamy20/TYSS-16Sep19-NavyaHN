package com.tyss.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernateapp.dto.ProductInfo;

public class ReadJPQL {
public static void main(String[] args) {
	EntityManager entityManager=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select pname from ProductInfo";
		entityManager.createQuery(jpql);
		Query query = entityManager.createQuery(jpql);
		List<String> result = query.getResultList();
		for(String lists:result) {
			//System.out.println(lists.getPid());
			System.out.println(lists);
			//System.out.println(lists.getQuantity());
			System.out.println("----------------------------");
		}
	}catch(Exception e) {
		e.printStackTrace();
		entityManager.close();
	}
}
}
