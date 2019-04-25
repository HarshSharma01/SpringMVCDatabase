package com.io.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.io.model.CustomerDetails;
import com.io.model.TransactionDetails;

public class Database {
	public Session getSession() {
		Configuration configuration=new Configuration().configure().addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		return session;
	}
	
	public Session getSession2() {
		Configuration configuration=new Configuration().configure().addAnnotatedClass(TransactionDetails.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		return session;
	}
}
