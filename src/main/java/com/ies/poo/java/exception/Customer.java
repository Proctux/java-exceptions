package com.ies.poo.java.exception;

public class Customer {
	private String name;
	private String cpf;
	private Character sex;
	
	public Customer(String name, String cpf, Character sex) {
		this.name = name;
		this.cpf = cpf;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}
}
