package com.sc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sc.entities.Product;
import com.sc.util.HibernateSessionFactory;

public class SCTest {

	
	public static void main(String[] args) {
		
		SessionFactory sfactory = null;
		Session session = null;
		Product product = new Product();
		product.setProductName("MI a1");
		product.setDescription("best phone");
		product.setPrice(10999.99f);
		System.out.println("Creating  SessionFactory object");
		sfactory = HibernateSessionFactory.getSessionFactory();
		System.out.println("Creating  Session object");
		session = sfactory.openSession();

		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		System.out.println("Saved daa");
		HibernateSessionFactory.closeSessionFactory();
		
		
	}

}
