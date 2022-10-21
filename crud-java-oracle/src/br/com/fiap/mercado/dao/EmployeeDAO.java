package br.com.fiap.mercado.dao;

import java.util.List;

import br.com.fiap.mercado.entity.Employee;

public interface EmployeeDAO {
	void save (Employee employee);
	List<Employee> list ();
	void remove (int code);
	Employee fetchById (int code);
	void update (Employee employee);
}
