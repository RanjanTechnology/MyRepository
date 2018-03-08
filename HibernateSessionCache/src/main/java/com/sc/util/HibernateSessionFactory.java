package com.sc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateSessionFactory {
	
	private static SessionFactory sessionFactory;
	
	private HibernateSessionFactory(){
		//desc. no need
	}
	
	static{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public static synchronized SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void closeSessionFactory(){
		if(sessionFactory != null){
			sessionFactory.close();
		}
	}
}
