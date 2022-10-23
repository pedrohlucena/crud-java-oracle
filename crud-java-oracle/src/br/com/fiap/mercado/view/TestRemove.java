package br.com.fiap.mercado.view;

import br.com.fiap.mercado.dao.DAOFactory;
import br.com.fiap.mercado.dao.EmployeeDAO;

public class TestRemove {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
		employeeDAO.remove(81);
	}
}
