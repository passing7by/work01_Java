package test3;

import java.util.List;

abstract class Animal{
	public void eat() {
		System.out.println("Animal eating...");
	}
}//Animal

class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eating...");
	}
}//Dog

class Cat extends Animal{
	public void eat() {
		System.out.println("Cat eating...");
	}
}//Cat

public class GenericWildCardTest4 {
	//wild card 적용하는 기능 정의
//	public static void takeAnimals(List<Animal> animals) {
//		for(Animal a : animals) a.eat();
//	}
	//Animal eating... 3 개 출력됨
	
//	public static void takeAnimals(List<Animal> animals) {
//		for(Animal a : animals) a.eat();
//	}
	
	//wild card 적용하는 기능 정이
	//List<T>
	public static void takeAnimals(List<? extends Animal> animals) {
		for(Animal a : animals) a.eat();
	}

	public static void main(String[] args) {
		
		List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
		takeAnimals(animals);
		
		System.out.println("-----------------------------------");
		
		List<Dog> dogs = List.of(new Dog(), new Dog());
		takeAnimals(dogs);
		//제한된 파라미터 안 쓸 경우 : 에러...dogs가 animals에 할당 되어야 하지 않냐? 다형성 아닌가!
		//ㄴ 객체가 아닌 리스트라는 컨테이너를 만드는 것 => 객체의 다형성과는 다름 => List<Animal>와 List<Dog>는 다형성으로 연결된 관계가 아님

	}//main
	
}//GenericWildCardTest4
