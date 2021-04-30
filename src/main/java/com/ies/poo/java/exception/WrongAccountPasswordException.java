package com.ies.poo.java.exception;

public class WrongAccountPasswordException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public WrongAccountPasswordException() {
		super("Account/password wrong");
	}
}
