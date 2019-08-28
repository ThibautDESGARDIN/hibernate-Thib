package fr.formation.inti.hibernate;

import java.sql.SQLException;
import java.util.List;

import fr.formation.inti.entities.Employee;

public interface IEmployeeDao {
	
	public Employee getByID(Integer id);
	
	public List<Employee> getAll();
	
	public Integer saveEmployee(Employee e); // doit enregistrer en BD retourner numero ID
	
	public void updateEmployee(Employee e); 
	
	public void delete(Employee e) ; // supprime la ligne

}


