package br.com.fiap.mercado.view;

import br.com.fiap.mercado.dao.DAOFactory;
import br.com.fiap.mercado.dao.EmployeeDAO;
import br.com.fiap.mercado.entity.Employee;

public class TestUpdate {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
		
		Employee employeeToBeUpdated = employeeDAO.fetchById(3);
		System.out.println(employeeToBeUpdated.getName());
		
//		employeeToBeUpdated.setName("pedrimtrembala");
//		employeeToBeUpdated.setEmail("pedro@pedro.com.br");
//		employeeToBeUpdated.setWage(2239.87);
//		
//		employeeDAO.update(employeeToBeUpdated);
	}
}
