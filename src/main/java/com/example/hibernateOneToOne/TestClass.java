package com.example.hibernateOneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernateOneToOne.dto.Laptop;
import com.example.hibernateOneToOne.dto.UserDetails;

public class TestClass {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setBrandName("dell");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("Akanksha");
		userDetails.setLaptop(laptop);
		
		//save data
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.save(userDetails);
		session.save(laptop);
		t.commit();
		session.close();
		
	}

}
