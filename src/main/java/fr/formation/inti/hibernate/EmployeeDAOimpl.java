package fr.formation.inti.hibernate;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import fr.formation.inti.entities.Employee;
import fr.formation.inti.utils.HibernateUtils;

public class EmployeeDAOimpl implements IEmployeeDao {

	// on veut afficher la liste de tous les employés
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.getTransaction();

		tx.begin();
		session.createQuery("FROM " + Employee.class.getName()).getResultList();
		tx.commit();
		session.close();
		factory.close();
		
		return list;
	}

	public Integer saveEmployee(Employee e) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.getTransaction();

		tx.begin();
		
		session.persist(e); //enregistre les valeurs de e et lui associe un id dans la table
		session.flush();	//met à jour dans java les entités persistantes et non commited
		
		
		tx.commit();

		return e.getEmpId();
		
	}

	
	public void updateEmployee(Employee e) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();
		
		session.merge(e);
		
		tx.commit();

	}

	public void delete(Employee e) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.getTransaction();

		tx.begin();
		
		session.remove(e);
		
		tx.commit();

	}

	public Employee getByID(Integer id) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.getTransaction();

		tx.begin();
		
		Employee emp = session.find(Employee.class, id);

		tx.commit();
		
		return emp;
	}

}
