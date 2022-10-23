package br.com.fiap.mercado.view;

import br.com.fiap.mercado.dao.EmployeeDAO;
import br.com.fiap.mercado.dao.EmployeeDAOImpl;

public class TestRemove {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.remove(81);
	}
}
