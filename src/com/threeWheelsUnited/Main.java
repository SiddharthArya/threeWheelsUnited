package com.threeWheelsUnited;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hibernate Trial");
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		User us = new User();
		us.setAadhar("12345678");
		us.setDob("22/10/1996");
		us.setEmail("siddhartharya1996@yahoo.com");
		us.setHomeArea("New Ashok Nagar");
		us.setWalletAmount(100);
		us.setName("Siddharth Arya");
		
		String query = "INSERT INTO User(Name,Email,Dob,Aadhar,HomeArea,WallerAmount) VALUES ("+us.getName()+","+us.getEmail()+","+us.getDob()+","+us.getAadhar()+","+us.getHomeArea()+","+us.getWalletAmount()+")";
		
		session.createSQLQuery(query);
		session.getTransaction().commit();

		System.out.println("Done");
	}

}
