package com.io.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.io.model.CustomerDetails;
import com.io.utility.Database;

@Repository
public class BankDaoImpl implements BankDao {
	Database d = new Database();
	public CustomerDetails register(CustomerDetails cd) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("hibernate.cfg.xml");
		Session session = d.getSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(cd);
    	transaction.commit();
    	session.close();
		return cd;
	}
	public int login(CustomerDetails c) {
		// TODO Auto-generated method stub
		int accountNo = 0;
		//ApplicationContext context=new ClassPathXmlApplicationContext("hibernate.cfg.xml");		
		Session session=d.getSession();
		CustomerDetails cd = session.get(CustomerDetails.class, c.getAccountNo());
		if(cd.getPassword().equals(c.getPassword())) {
			accountNo = c.getAccountNo(); 
		}
		return accountNo;
	}

	

}
