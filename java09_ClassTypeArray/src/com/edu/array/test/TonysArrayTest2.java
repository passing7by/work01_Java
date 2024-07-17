package com.edu.array.test;

class Contact2{
	String name;

	public Contact2(String name) {
		super();
		this.name = name;
	}
	public void printName() {
		System.out.println(name+"...print!!");
	}
}


public class TonysArrayTest2 {

	public static void main(String[] args) {
		Contact2 contactRef = null;
		int x = 0;
		while(x<10) {
			contactRef = new Contact2("PerconName..."+contactRef);
			System.out.println("Contact2 Reference..."+contactRef);
			x++;
		}
		//힙에 컨택트가 열 개 들어감 (주소값이 다 다르게 들어가며, 스택에 있는 컨택트레프의 값에 계속 덮어씌워짐)
		contactRef.printName();
	}

}
