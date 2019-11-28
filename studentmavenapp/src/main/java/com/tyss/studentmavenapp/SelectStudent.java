package com.tyss.studentmavenapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.studentmavenapp.dto.StudentInfo;

public class SelectStudent {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		StudentInfo info = entityManager.find(StudentInfo.class, 10);
		System.out.println("Student ID is--->"+info.getSid()); 
		System.out.println("Student Name  is--->"+info.getSname()); 
		System.out.println("Student Percentage is--->"+info.getPercentage()); 
		entityManager.close();
	}
	}
