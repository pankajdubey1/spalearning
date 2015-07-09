package com.xebia.spa.hiberbnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Application {

	/*public static void main(String[] args) {
		
      SessionFactory sessionFactory = null;
		
		Session session = null;
		
		Transaction transaction = null;
		try{
			// getting session factory
			sessionFactory = HibernateUtil.getSessionFactory();
			
			// getting the current operation
			session = sessionFactory.getCurrentSession();
			
			// Transaction is necessary for the save, update operation
			transaction = session.beginTransaction();
			
			Employee employee = new Employee();
			employee.setName("11 New Record");
			employee.setSalary(7000);
			Address address = new Address();
			address.setAddressLine1("NEw Addreess");
			address.setCity("Gurgaon");
			address.setZipcode("12103");
			address.setEmployee(employee);
			employee.setAddress(address);
			
			// hibernate save operation for saving data
			session.save(employee);
			
			//int i= 1/0;
			// transaction commit is necessary to save changes
			transaction.commit();
		}catch(Exception e){
			//transaction.rollback();
		}finally{
			//session.close();
			sessionFactory.close();
		}
		
		
		
		
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();*/
		
	}


