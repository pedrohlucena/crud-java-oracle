package br.com.fiap.mercado.view;

import java.util.Calendar;

import br.com.fiap.mercado.dao.DAOFactory;
import br.com.fiap.mercado.dao.EmployeeDAO;
import br.com.fiap.mercado.entity.Employee;

public class TestSave {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Pedro Lucena", "blablabla@gmail.com", 2374.78, Calendar.getInstance());
		EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
		employeeDAO.save(employee);
	}
}