package br.com.fiap.mercado.view;

import java.util.Calendar;

import br.com.fiap.mercado.dao.EmployeeDAOImpl;
import br.com.fiap.mercado.entity.Employee;

public class TestSave {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Pedro Lucena", "blablabla@gmail.com", 2374.78, Calendar.getInstance());
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		employeeDAO.save(employee);
	}
}