package com.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class StudentMain {

	

//	public static void main(String[] args) {
//		System.out.println("line 1");
//		//Configuration configuration=new Configuration();
//		Configuration configuration=new Configuration();
//		System.out.println("line 2");
//		
//		configuration.configure("hibernate.cfg.xml");
//		System.out.println("line 3");
//		
//		SessionFactory sessionFactory=configuration.buildSessionFactory();
//		System.out.println("line 4");
//		Session session=sessionFactory.openSession();
//		
//		Query query=session.createQuery("from Student1");
//	    List<Student1> students=query.getResultList();
//	    
//	    for(Student1 student: students)
//	    {
//	    	System.out.println("id="+student.getId());
//	    	System.out.println("firstName="+student.getFirstName());
//	    	System.out.println("lastName="+student.getLastName());
//	    	System.out.println("city="+student.getCity());
//	    }
//	    
//		
//		
//		session.close();
//		sessionFactory.close();
//		System.out.println("Recored display Successfully!!!!!");
//		
//	}
//
	
}
