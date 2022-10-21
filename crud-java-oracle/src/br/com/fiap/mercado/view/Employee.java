package br.com.fiap.mercado.view;

import java.io.Serializable;
import java.util.Calendar;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int code;
	private String name;
	private String email;
	private double wage;
	private Calendar hiringDate;
	
	public Employee() { super(); }
	
	public Employee(int code, String name, String email, double wage, Calendar hiringDate) {
		super();
		this.code = code;
		this.name = name;
		this.email = email;
		this.wage = wage;
		this.hiringDate = hiringDate;
	}
	
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public double getWage() {
		return wage;
	}
	public Calendar getHiringDate() {
		return hiringDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
}
