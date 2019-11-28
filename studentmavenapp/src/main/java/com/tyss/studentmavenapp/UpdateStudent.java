package com.tyss.studentmavenapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.studentmavenapp.dto.StudentInfo;

public class UpdateStudent {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	StudentInfo Info = entityManager.find(StudentInfo.class, 100);
		Info.setSname("Momos");
		System.out.println("Record Updated");
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();
}
}
