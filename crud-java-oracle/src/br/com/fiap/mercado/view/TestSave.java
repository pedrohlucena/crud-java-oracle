package br.com.fiap.mercado.view;

import java.util.Calendar;

public class TestSave {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Pedro Lucena", "blablabla@gmail.com", 2374.78, Calendar.getInstance());
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.save(employee);
	}
}