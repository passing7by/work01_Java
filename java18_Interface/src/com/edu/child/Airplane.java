package com.edu.child;
import com.edu.parent.Flyer;
public class Airplane implements Flyer{
//[인터페이스를 상속한 뒤, 메소드를 오버라이드하여 구현부를 수정한 클래스] 
	/*
 * 1step-- void fly();
 * 2step-- public void fly(){};  오버라이딩
 */
//[자동 메소드 오버라이딩 방법: Ctrl + Space]

	@Override
	public void fly() {
		System.out.println("Airplane fly...");
	
	}
	@Override
	public void land() {
		System.out.println("Airplane land...");
	}
	@Override
	public void take_off() {
		
		System.out.println("Airplane take_off...");
	}
	
}