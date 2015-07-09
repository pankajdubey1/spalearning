package com.xebia.spa.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import com.xebia.spa.error.SpaException;
import com.xebia.spa.hiberbnate.HibernateUtil;
import com.xebia.spa.model.User;

public class UserService {

	public void registerUser(String fname, String lname, String uname,
			String password) {
		
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
			
			User user = new User();
			user.setFname(fname);
			user.setLname(lname);
			user.setUname(uname);
			user.setPassword(password);
			
			// hibernate save operation for saving data
			session.save(user);	
			
			//int i= 1/0;
			// transaction commit is necessary to save changes
			transaction.commit();
		}catch(Exception e){
			//transaction.rollback();
		}finally{
			session.close();
			sessionFactory.close();
		}		
		
	}

		
	public void userLogin(String uname, String password) throws SpaException {
       
		Session session = HibernateUtil.getSessionFactory().openSession();
	    Query query = session.createQuery("from User where uname = :uname");
		
	    query.setParameter("uname",uname);
		  	
		List<?> list = query.list();
		
		if(list.isEmpty()){
			System.out.println("user found null");
			throw new SpaException(404);
		}
		User user = (User)list.get(0);
	    if(!user.getPassword().equals(password)){
	    	System.out.println("incorrect password");
	    	throw new SpaException(404);
	    }
		System.out.println("login successdul "+user.getFname()+" "+user.getLname());

		session.close();
		//sessionFactory.close();
	}


	public String forgetPassword(String uname) throws SpaException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User where uname = :uname");
		query.setParameter("uname", uname);
		
		List<?> list = query.list();
		
		if(list.isEmpty()){
			System.out.println("user found null");
			throw new SpaException(404);
		}
		User user = (User) list.get(0);
		System.out.println(user.getPassword());
		return user.getPassword();
	}

	/*public static void main(String[] args) throws SpaException {
		String str = new UserService().forgetPassword("pdubey");
	}		*/
}