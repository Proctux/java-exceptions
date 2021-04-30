package com.ies.poo.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ies.poo.java.exception.BankAccount;
import com.ies.poo.java.exception.Customer;
import com.ies.poo.java.exception.WrongAccountPasswordException;

public class AccountExceptionTest {
	@Test(expected = WrongAccountPasswordException.class)
	public void wrongAccountException() throws Exception {
		Customer luiz = new Customer("Luiz", "999.999.999-99", 'M');
		BankAccount luizAccount = new BankAccount(luiz, 1212, "sup3rpassw0rd");
		
		luizAccount.accessAccount(1212, "uaehaueh");
	}
	
	@Test()
	public void correctAccount() throws Exception {
		Customer luiz = new Customer("Luiz", "999.999.999-99", 'M');
		BankAccount luizAccount = new BankAccount(luiz, 1212, "sup3rpassw0rd");
		
		assertEquals("You're online!", luizAccount.accessAccount(1212, "sup3rpassw0rd"));
	}
}
