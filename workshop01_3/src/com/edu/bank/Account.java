package com.edu.bank;

public class Account {
	

	public int accNumber;

	public String bankName;

	public double balance;

	public Account() {}

	/*
	 1. 생성자에 balance --> 통장을 개설할 때 잔액이 함께 주입됨
	    은행에 따라서 이 부분의 정책이 다름 
	    ex. 토스 -> 잔액 0원도 개설 가능
	    ex. 국민 -> 잔액 1만원 이상일 때만 개설 가능
	 */
	public Account(int accNumber, String bankName, double balance) {
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}

	/*
	 잔액 이하만 출금되도록하고, 잔액 이상이면 메시지 띄문 후 다시 출금할 수 있도록 만들기
	 */
	public void withdrawAccount(double amount) {
		balance -= amount;
	}

	/*
	 deposit - 천원 이상의 금액만 입금, 그렇지 않으면 "입금액은 천원 이상입니다"라는 문구를 출력하고, 다시 입금할 수 있도록 만들기
	 */
	public void depositAccount(double amount) {
		balance += amount;
	}

	public int getAccNumberInfo() {
		return accNumber;
	}

	public String getbankNameInfo() {
		return bankName;
	}

	public double getbalanceInfo() {
		return balance;
	}

	public double getLastBalance() {
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
}

