package br.com.fiap.mercado.view;

public class TestRemove {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.remove(25);
	}
}
