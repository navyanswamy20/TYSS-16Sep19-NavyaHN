package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.Person;
import com.tyss.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(1);
		vc.setVname("manu");
		                                               
		Person p = new Person();
		p.setPid(1);
		p.setName("ram");
		p.setVoterCard(vc);
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		VoterCard vcard = entityManager.find(VoterCard.class, 1);
		System.out.println(vcard.getPerson().getPid());
	//	entityManager.persist(p);
		System.out.println("record saved");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		}
		}
