package com.edu.child;
import com.edu.parent.Flyer;
public class Bird implements Flyer{
/*
 * 1step-- void fly();
 * 2step-- public void fly(){};  오버라이딩
 */
//[자동 메소드 오버라이딩 방법: Ctrl + Space]

	@Override
	public void fly() {
		System.out.println("Bird fly...");
		
	}
	@Override
	public void land() {
		System.out.println("Bird land...");
	}
	@Override
	public void take_off() {
		
		System.out.println("Bird take_off...");
	}
	//자식만의 멤버 추가
	public String layEggs() {
		return"새가 알을 낳다.";
	}
	
	public String buildNest() {
		return "새가 둥지를 짓다.";
	}
}