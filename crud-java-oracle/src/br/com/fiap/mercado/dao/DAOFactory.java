package br.com.fiap.mercado.dao;

public abstract class DAOFactory {
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
