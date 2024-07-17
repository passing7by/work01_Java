package com.edu.bank;

public class Customer2 {
	String name;
	String address;
	
	Account2 account2;

	public Customer2() {}
	public Customer2(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void openAccount(Account2 account2) {
		this.account2 = account2;
	}
	
	public Account2 getAccount() {
		return account2;
	}
	
	public String getCustomerInfo() {
		return name + ","+ address;
	}

}
