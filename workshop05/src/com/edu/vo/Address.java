package com.edu.vo;

public class Address {
	
	private int zipCode;
	private String region;
	private String city;
	//필드 선언
	
	public Address() {}
	public Address(int zipCode, String region, String city) {
		super();
		this.zipCode = zipCode;
		this.region = region;
		this.city = city;
	}
	//기본 생성자와 명시적 생성자로 객체 생성
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//모든 필드의 set, get 메소드 생성
	
	public String getAddress() {
		return zipCode + "," + region + "," + city;
	}
	//Address 값을 String 타입으로 반환하는 get 메소드 생성
	
	
	
	

}
