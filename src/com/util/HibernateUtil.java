package com.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	public static SessionFactory buildSessionFactory() {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(com.entity.Teacher.class)
				.addAnnotatedClass(com.entity.Subject.class)
				.addAnnotatedClass(com.entity.Classes.class)
				.addAnnotatedClass(com.entity.Student.class)
				.buildSessionFactory();
				
		return sessionFactory;
	}
}