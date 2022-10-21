package br.com.fiap.mercado.view;

import java.util.List;

import br.com.fiap.mercado.dao.EmployeeDAOImpl;
import br.com.fiap.mercado.entity.Employee;

public class TestList {
	public static void main(String[] args) {
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
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
