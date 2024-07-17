package com.edu.bank;
//주석의 종류

// Single Line Comment

/*
 * Multi Line Comment
 */

/**
 * Document API Comment (클래스에 대한 설명)
 */

/**
 * <pre>
 * 
 * {@code
 * 	은행 계좌 정보를 저장하는 클래스
 * 
 * 	이번 Java Document 주석 사용법을 예시로 작성
 * 	이런 작업은 공동작업을 하기 위한 효율적 작업으로 사용되거나
 * 	혹은
 * 	개발자가 자신의 코드를 보완설명하기 위해서 반드시 사용하는 작업 방식입니다. *
 * }
 * 
 * </pre>
 * 
 * :내가 화면에 적은 그대로 도큐먼트에 출력되게 함
 * 
 * 은행 계좌 정보를 저장하는 클래스
 * 
 * @author JN (코드의 저작권자)
 * @version Test Projent version 1.0.1
 * @since JDK 17 (혹은 날짜 기입)
 */
public class Account {
	
	/**
	 * 
	 */
	public int accNumber;
	/**
	 * 은행명
	 */
	public String bankName;
	/**
	 * 계좌에 남아있는 잔액
	 * 혹은
	 * 개설시 필요한 조건으로서의 잔액
	 */
	public double balance;

	/**
	 * Account 기본 생성자
	 */
	public Account() {} //기본 생성자는 무조건 넣어주기!
	/**
	 * 
	 * Account 명시적 생성자
	 * 
	 * @param accNumber 계좌번호
	 * @param bankName 은행명
	 * @param balance 통장 개설시 초기금액
	 */
	public Account(int accNumber, String bankName, double balance) {
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	/**
	 * 
	 * @param amount 출금 금액
	 */
	
	public void withdrawAccount(double amount) {
		balance -= amount;
	}
	/**
	 * 
	 * @param amount 입금 금액
	 */
	public void depositAccount(double amount) {
		balance += amount;
	}
	/**
	 * 
	 * @return 계좌번호 반환
	 */
	public int getAccNumberInfo() {
		return accNumber;
	}
	/**
	 * 
	 * @return 계좌명 반환
	 */
	public String getbankNameInfo() {
		return bankName;
	}
	/**
	 * 
	 * @return 초기금액 반환
	 */
	public double getbalanceInfo() {
		return balance;
	}
	/**
	 * 
	 * @return 마지막 잔액 반환
	 */
	public double getLastBalance() {
		return balance;
	}
	
	
	public double getBalance() {
		return balance;
	}
	/**
	 * 
	 * @param balance
	 * 통장을 개설한 이후에 잔액을 다시 입력하는 기능
	 * @deprecated depositAccount 메소드로 대체 {@link #depositAccount(double)}
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
}

