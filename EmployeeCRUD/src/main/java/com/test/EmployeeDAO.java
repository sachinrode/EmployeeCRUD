package com.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public void addEmployee(Employee employee) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(employee);

			transaction.commit();
			session.close();
			sessionFactory.close();
			System.out.println("Employee Added Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateEmployee(Employee employee,int eid) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Employee emp = session.get(Employee.class, eid);
			if (emp != null) {
				session.update(emp);
				transaction.commit();
				session.close();
				sessionFactory.close();
				System.out.println("Employee Update Successfully");
			} else {
				System.out.println("Employee with ID " +eid +" not found.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteEmployee(int empId) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, empId);

			if (employee != null) {
				session.delete(employee);
				transaction.commit();
				session.close();
				sessionFactory.close();
				System.out.println("Employee with ID " + empId + " deleted successfully.");
			} else {
				System.out.println("Employee with ID " + empId + " not found.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getAllEmployees() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		System.out.println("Employee Details: " + employees);

		session.close();
		sessionFactory.close();
		System.out.println("Recored display Successfully!!!!!");
	}
}
