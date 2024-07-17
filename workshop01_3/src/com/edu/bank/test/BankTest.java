package com.edu.bank.test;

import com.edu.bank.Customer;
import com.edu.bank.Account;
import java.util.Scanner;

public class BankTest {
	
	public static void main(String[] args) {
		Customer James = new Customer("James", "Seoul");
		Customer Tomas = new Customer("Tomas", "Daegu");
		
		Scanner sc = new Scanner(System.in);
		
		Double balance1 = sc.nextDouble();
		Double amount1 = sc.nextDouble();

		James.openAccount(new Account(111, "SCB", 100000));
		Tomas.openAccount(new Account(222, "DGB", 200000));
		
		Account JamesAccount = James.getAccount();
		Account TomasAccount = Tomas.getAccount();

		
		
		System.out.println("====잔액을 확인하신 후 입금하실 금액과 출금하실 금액을 입력해 주십시오====");
		System.out.println("잔액>>"+JamesAccount.getLastBalance());
		System.out.println("입금하실 금액: ");
		System.out.println("잔액>>" + balance1 + amount1);
		
		
		System.out.println("출금하실 금액: ");
		String getbankNameInfo = sc.nextLine();

		
		System.out.println("입금 10000원>>");
		JamesAccount.depositAccount(10000);
		
		System.out.println("입금 30000원>>");

		JamesAccount.depositAccount(30000);
		
		System.out.println("출금 20000원>>");
		JamesAccount.withdrawAccount(20000);
		
		System.out.println("최종 잔액>>"+JamesAccount.getLastBalance());
		

		System.out.println("====Jame님의 고객정보와 최종잔액입니다====");
		System.out.println(James.getCustomerInfo());

		
		System.out.println("====Tomas님의 고객정보와 최종잔액입니다====");
		System.out.println(Tomas.getCustomerInfo());
	}
}
