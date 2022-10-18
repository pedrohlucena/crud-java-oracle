package br.com.fiap.mercado.view;

import java.util.List;

public class TestList {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employeeList = employeeDAO.list();
		for(Employee employee: employeeList) {
			System.out.println(
					"Código: " + employee.getCode() + "\n" +
					"Nome: " + employee.getName() + "\n" +
					"Email: " + employee.getEmail() + "\n" +
					"Salário: " + employee.getWage() + "\n" +
					"Data de contratação: " + employee.getHiringDate().getTime() + "\n\n"
			);
		}
	}
}
