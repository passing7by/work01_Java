package com.edu.bank.test;

import com.edu.bank.Customer2;

import java.util.Scanner;

import com.edu.bank.Account2;


public class BankTest2 {
	

	public static void main(String[] args) {
		
		Customer2 James = new Customer2("James", "Seoul");
		Customer2 Tomas = new Customer2("Tomas", "Daegu");
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		String b =sc.next();
		double c =sc.nextDouble();
		
		James.openAccount(new Account2(a,b,c));
		Tomas.openAccount(new Account2(a,b,c));
		
		Account2 JamesAccount = James.getAccount();
		
		JamesAccount.depositAccount(900.0);
		JamesAccount.depositAccount(30000.0);
		JamesAccount.withdrawAccount(20000.0);
		
		Account2 TomasAccount = Tomas.getAccount();

		
		System.out.println("====Jame님의 고객정보와 최종잔액입니다====");
		System.out.println(James.getCustomerInfo());
		System.out.println(JamesAccount.getAccountInfo());
		
		System.out.println("====Tomas님의 고객정보와 최종잔액입니다====");
		System.out.println(Tomas.getCustomerInfo());
		System.out.println(TomasAccount.getAccountInfo());
		
		
		
	}
}