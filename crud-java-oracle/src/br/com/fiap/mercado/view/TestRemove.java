package br.com.fiap.mercado.view;

import br.com.fiap.mercado.dao.EmployeeDAOImpl;

public class TestRemove {
	public static void main(String[] args) {
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		employeeDAO.remove(81);
	}
}
