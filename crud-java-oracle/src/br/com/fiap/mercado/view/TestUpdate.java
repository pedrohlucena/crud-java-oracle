package br.com.fiap.mercado.view;

public class TestUpdate {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		Employee employeeToBeUpdated = employeeDAO.fetchById(44);
		
		employeeToBeUpdated.setName("pedrimtrembala");
		employeeToBeUpdated.setEmail("pedro@pedro.com.br");
		employeeToBeUpdated.setWage(2239.87);
		
		employeeDAO.update(employeeToBeUpdated);
	}
}
