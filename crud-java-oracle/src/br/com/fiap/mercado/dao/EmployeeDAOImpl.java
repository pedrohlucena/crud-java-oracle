package br.com.fiap.mercado.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EmployeeDAO {
	private Connection connection;
	
	private PreparedStatement stmt;

	public void save(Employee employee) {
		this.connection = null;
		this.stmt = null;

		try {
			connection = EnterpriseDBConnection.connect();
			
			connection.setAutoCommit(false);

			String sql = "INSERT INTO T_COLABORADOR (cd_colaborador, nm_colaborador, ds_email, vl_salario, dt_contratacao)"
					+ "VALUES (SEQ_COLABORADOR.NEXTVAL, ?, ?, ?, ?)";

			stmt = connection.prepareStatement(sql);

			java.sql.Date data = new java.sql.Date(employee.getHiringDate().getTimeInMillis());

			stmt.setString(1, employee.getName());
			stmt.setString(2, employee.getEmail());
			stmt.setDouble(3, employee.getWage());
			stmt.setDate(4, data);

			stmt.executeUpdate();
			
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
				e.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Employee> list() {
		this.stmt = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		ResultSet result = null;
		try {
			this.connection = EnterpriseDBConnection.connect();
			stmt = connection.prepareStatement("SELECT * FROM T_COLABORADOR");
			result = stmt.executeQuery();

			Employee employee = null;
			while (result.next()) {
				java.sql.Date data = result.getDate("dt_contratacao");
				Calendar hiringDate = Calendar.getInstance();
				hiringDate.setTimeInMillis(data.getTime());

				employee = new Employee(result.getInt("cd_colaborador"), result.getString("nm_colaborador"),
						result.getString("ds_email"), result.getDouble("vl_salario"), hiringDate);

				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				result.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return employeeList;
	}

	public void remove(int code) {
		this.stmt = null;
		try {
			this.connection = EnterpriseDBConnection.connect();
			
			connection.setAutoCommit(false);

			stmt = connection.prepareStatement("DELETE FROM T_COLABORADOR WHERE cd_colaborador = ?");
			stmt.setInt(1, code);
			stmt.executeUpdate();
			
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
				e.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Employee fetchById(int code) {
		this.stmt = null;
		Employee employee = null;
		ResultSet result = null;

		try {
			this.connection = EnterpriseDBConnection.connect();

			stmt = connection.prepareStatement("SELECT * FROM T_COLABORADOR WHERE cd_colaborador = ?");
			stmt.setInt(1, code);

			result = stmt.executeQuery();

			if (result.next()) {
				java.sql.Date data = result.getDate("dt_contratacao");
				Calendar hiringDate = Calendar.getInstance();
				hiringDate.setTimeInMillis(data.getTime());

				employee = new Employee(result.getInt("cd_colaborador"), result.getString("nm_colaborador"),
						result.getString("ds_email"), result.getDouble("vl_salario"), hiringDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				result.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return employee;
	}

	public void update(Employee employee) {
		this.stmt = null;

		try {
			this.connection = EnterpriseDBConnection.connect();
			
			connection.setAutoCommit(false);

			String sql = "UPDATE T_COLABORADOR SET nm_colaborador= ?, ds_email = ?, vl_salario = ?, dt_contratacao = ? WHERE cd_colaborador = ?";

			stmt = connection.prepareStatement(sql);

			java.sql.Date data = new java.sql.Date(employee.getHiringDate().getTimeInMillis());

			stmt.setString(1, employee.getName());
			stmt.setString(2, employee.getEmail());
			stmt.setDouble(3, employee.getWage());
			stmt.setDate(4, data);
			stmt.setInt(5, employee.getCode());

			stmt.executeUpdate();
			
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
				e.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
