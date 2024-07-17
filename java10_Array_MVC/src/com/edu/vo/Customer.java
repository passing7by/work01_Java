package com.edu.vo;
/*
 * 상품을 구입하는 고객에 대한 정보를 담고 있는 vo 클래스
 * web 스펙에 가서는 Model에 해당되는 클래스로 승격된다
 */
public class Customer {
	private int ssn; //소셜 시큐리티 넘버(주민등록번호)
	private String name;
	private String address;
	private Product[] products;

	
	public Customer() {}
	public Customer(int ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	
	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public void changeAddress(String address) {
		this.address = address;
	}
	
	public Product[] getProducts() {
		return products;
	}
	
	public void buyProducts(Product[] produccts) { //has a relation
		this.products = produccts;
	}
	
	public String getCustomerInfo() {
		return name + "," + address;
	}
	

}
