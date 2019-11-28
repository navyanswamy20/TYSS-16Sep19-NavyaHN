package com.tyss.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.manytomany.Course;
import com.tyss.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		Course course= new Course();
		course.setCid(10);
		course.setCname("java");
		
		Course course1= new Course();
		course1.setCid(20);
		course1.setCname("sql");
		
		ArrayList<Course> alCourses=new ArrayList<Course>();
		alCourses.add(course);
		alCourses.add(course1);
		
		Student student = new Student();
		student.setSid(100);
		student.setSname("navya");
		student.setCourses(alCourses);
		
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		System.out.println("record inserted");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		}
		}
