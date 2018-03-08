package com.sc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sc.entities.Product;
import com.sc.util.HibernateSessionFactory;

public class SessionCacheGetTest {

	public static void main(String[] args) {
		
		SessionFactory sfactory = null;
		Session session1 = null;
		Session session2 = null;

		sfactory = HibernateSessionFactory.getSessionFactory();
		session1 = sfactory.openSession();
		session2 = sfactory.openSession();

		session1.beginTransaction();
		Product product1 = (Product) session1.get(Product.class, 101);
		
		product1.setProductName("Sumsung s7 next");
		product1.setDescription("sumsung best phone");
		session1.update(product1);
		
		System.out.println("session1 updated completed but not committed...");
		Product product2 = (Product) session2.get(Product.class, 101);
		System.out.println("Session2 , Product2, ProductName : "
				+ product2.getProductName());
		session1.getTransaction().commit();
		System.out.println("session1, comitted...");
		
		session2.evict(product2);
		
		Product product3 = (Product) session2.get(Product.class, 101);
		System.out.println("Session2 , Product2, ProductName : "
				+ product3.getProductName());
		
		HibernateSessionFactory.closeSessionFactory();
	}

}
