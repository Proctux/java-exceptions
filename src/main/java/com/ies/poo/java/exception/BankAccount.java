package com.ies.poo.java.exception;

public class BankAccount {
	private Customer customer;
	private Integer account;
	private String password;
	
	public BankAccount(Customer customer, Integer account, String password) {
		this.customer = customer;
		this.account = account;
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String accessAccount(Integer account, String password) throws WrongAccountPasswordException {
		if(this.account.equals(account) && this.password.equals(password)) {
			return "You're online!";
		} else {
			throw new WrongAccountPasswordException();
		}
	
	}
	
	
}
