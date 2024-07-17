package com.edu.test;
import com.edu.child.Airplane;
import com.edu.child.Bird;
/*
 * abstract가 있으면 객체생성의 대상이 되지 않는다.
 */
import com.edu.parent.Flyer;
public class InterfaceTest1 {
	public static void main(String[] args) {
		Flyer f = new Bird(); //Polymorphism
		//[interface implements에 의해 "Bird"는 "Flyer"의 자식, 부보 타입으로 자식 타입 생성] 
		/*
		 * 1. Object Casting
		 * [형 변환 - 형 변환을 할 객체는 반드시 상속 관계에 있어야 함]
		 * 2. Virtual Method Invocation
		 * [JVM이 자식의 멤버를 읽는 과정에서, 자식이 Override했던 부모 메소드는 자식 메소드로 읽어와 짐] 
		 */
		((Bird)f).layEggs();//1. Object Casting
		f.land();//2. Virtual Method Invocation
		
		Flyer[] f3 = new Flyer[3];
		//interface를 가지고 상속을 하여서 객체생성이 가능하다.
		//[Flyer[] -> Bird 객체도, Airplane 객체도 담을 수 있음]
		
		//[진짜 담기는지 테스트]
		Flyer a = new Airplane();
		f3[0] = f;
		f3[1] = a;
		for(Flyer m : f3) System.out.println(m);
		
		//class간의 상속은 필드 중심으로 상속이 이뤄지고 interface간의 상속은 기능 중심으로 상속이 이뤄진다.
		//둘 다 상속의 부모이고 그 둘을 타입으로 객체를 생성가능하다.
	}
}