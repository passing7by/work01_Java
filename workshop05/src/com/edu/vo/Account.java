package com.edu.vo;

public class Account {
	
	private int balance;
	//필드 선언

	public Account() {}
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	//기본 생성자와 명시적 생성자로 객체 생성
	
	public int getBalance() {
		return balance;
	}
	//잔고 값을 받아오는 메소드 생성
	
	public void deposit(int amt) {
		balance += amt;
	}
	//입금하는 메소드 생성
	
	public void withdraw(int amt) {
		balance -= amt;
	}
	//출금하는 메소드 생성
	
	public String toString(int balance) {
		return toString(balance);
	}
	
	
	
	
	

}
