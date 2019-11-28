package com.tyss.studentmavenapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.studentmavenapp.dto.StudentInfo;

public class InsertStudent {
	public static void main(String[] args) {
		
	
StudentInfo info = new StudentInfo();
info.setSid(20);
info.setSname("kali");
info.setPercentage(80);

EntityManager entityManager=null;
EntityTransaction entityTransaction=null;
try {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
entityManager = entityManagerFactory.createEntityManager();
entityTransaction=entityManager.getTransaction();
entityTransaction.begin();
entityManager.persist(info);
System.out.println("record inserted");
entityTransaction.commit();
}catch(Exception e) {
	e.printStackTrace();
}
entityManager.close();
}
}
