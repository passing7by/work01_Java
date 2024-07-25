package com.edu.statictest;
/*
 * static한 변수는 생성된 객체들이 공유하는 값이다!!!!
 */
class Car{
	int serialNumber; //field
	static int counter; //static 변수
	
	Car(){
		counter++;
		serialNumber = counter;
	}
	//[Car 생성자 정의]
	//[Car 객체를 생성한 후 counter(static)가 1 증가하고, 증가된 counter(static)를 serialNumber에 대입함]
}//class Car
public class StaticExamTest2 {

	public static void main(String[] args) {
		Car car1 = new Car(); //[(f)serialNumber=0, (s)counter=0 | 객체 생성 후 -> | (f)serialNumber=1, (s)counter=1]
		Car car2 = new Car(); //[(f)serialNumber=1, (s)counter=1 | 객체 생성 후 -> | (f)serialNumber=2, (s)counter=2]
		Car car3 = new Car();
		//[필드 : 각각의 인스턴스들이 가지는 서로 다른 값]
		//[스태틱 : 모든 인스턴스들이 가지는 동일한 값]
		//[(f)serialNumber는 객체마다 다른 값을 가지게 되지만, (s)counter은 값이 변경될 때마다 변경된 값이 모든 객체에 적용됨]
		
		/*
		 * [스택에 car1 생성 > 힙에 serialNumber라는 공간 생성, 클래스 에리어에 counter라는 공간 생성
		 * > 각 객체는 서로 다른 serialNumber를 가지고, 클래스 에리어에 있는 counter 값을 끌어다 씀]
		 */
		System.out.println("========== field ==========");
		System.out.println(car1.serialNumber);
		System.out.println(car2.serialNumber);
		System.out.println(car3.serialNumber);
		
		System.out.println("========== static ==========");
		System.out.println(car1.counter);
		System.out.println(car2.counter);
		System.out.println(car3.counter);
		
		System.out.println("========== Car ==========");
		System.out.println(Car.counter); //Car 클래스에 최종적으로 변경된 static이 적용됨
	}//main
}//public class StaticExamTest2
