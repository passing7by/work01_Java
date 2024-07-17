package com.edu.bank;

public class Account2 {
	int accNumber;
	String bankName;
	double balance;

	public Account2() {}
	public Account2(int accNumber, String bankName, double balance) {
		
		switch (bankName) {
		case "SCB":
		if(balance>=10000) {
			this.accNumber = accNumber;
			this.bankName = bankName;
			this.balance = balance;
			System.out.println("SCB 계좌 개설 완료");		
		}else {
			this.accNumber = accNumber;
			this.bankName = bankName;
			this.balance = balance;
			System.out.println("계좌 개설 완료");
		}
		}

	}
	
	public void withdrawAccount(double amount) {
		if(balance-amount<0) System.out.println("계좌 잔액을 확인 후 다시 출금 해 주십시오");
		else balance -= amount;
	}
	
	public void depositAccount(double amount) {
		if(amount<1000) System.out.println("1000원 이상의 금액만 입금 가능합니다");
		else balance += amount;
	}
	
	public String getAccountInfo() {
		return accNumber + ","+ bankName + ","+ balance;
	}
	
	public double getLastBalance() {
		return balance;
	}	
}