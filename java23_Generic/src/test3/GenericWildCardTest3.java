package test3;

class Person{
	
}
class Worker extends Person{
	
}
class Child extends Worker{
	
}
class Employee extends Person{
	
}
class Manager extends Employee{

}
class MGR1 extends Manager{

}
class Engineer extends Employee{

}//extends Person...

class Animal{
	
}

class Application<T>{
//제한된 파라미터 타입 사용 못함
//[클래스 타입에서는 제한된 파라미터 사용 불가 -> 메소드 반환타입 or 메소드 매개변수타입으로만 사용 가능]
	T kind;

	public Application(T kind) {
		super();
		this.kind = kind;
	}
	
}//Application

class PersonService{
	public static void register(Application<?> application) {
		System.out.println(application.kind.getClass().getSimpleName()+" 이 등록됨...");
	}
	
	public static void register2(Application<? super Worker> application) {
		System.out.println(application.kind.getClass().getSimpleName()+" 이 등록됨...");
	}
	
	public static void register3(Application<? extends Employee> application) {
		System.out.println(application.kind.getClass().getSimpleName()+" 이 등록됨...");
	}

}//PersonService(Application를 해징)

public class GenericWildCardTest3 {

	public static void main(String[] args) {
		PersonService.register(new Application(new Employee())); //ok
		PersonService.register2(new Application(new Manager())); //ok
//		PersonService.register3(new Application(new Person())); //fail
		PersonService.register2(new Application(new Object()));
		PersonService.register2(new Application(new Worker()));
		PersonService.register2(new Application(new Employee()));
		PersonService.register2(new Application(new Manager()));
		PersonService.register2(new Application(new Engineer()));
		
		System.out.println("\n===================== 1. <?> =====================");
		//2. 제너릭을 Object로 지정
		PersonService.register(new Application<Object>(new Object())); //성공 : Object 타입 객체 해징 가능
		PersonService.register(new Application<Object>(new Person())); //성공 : Object의 하위 타입 객체 해징 가능
		
		//1. 제너릭을 Person으로 지정
//		PersonService.register(new Application<Person>(new Object())); //실패 : Person의 상위 타입 객체 해징 불가
		PersonService.register(new Application<Person>(new Person())); //성공 : Person 타입 객체 해징 가능
		PersonService.register(new Application<Person>(new Worker())); //성공 : Person의 하위 타입 객체 해징 가능
		
		System.out.println("\n===================== 2. <? super Worker> =====================");
		//1. 제너릭을 Worker로 지정
//		PersonService.register2(new Application<Worker>(new Person()));
		//실패 : Worker의 상위 타입 객체 해징 불가 | 에러메시지 : "Application<Worker>(Person) 라는 생성자가 정의되지 않았음"
		PersonService.register2(new Application<Worker>(new Worker()));
		//성공 : Worker 타입 객체 해징 가능
		PersonService.register2(new Application<Worker>(new Child()));
		//성공 : Worker의 하위 타입 객체 해징 가능
//		PersonService.register2(new Application<Worker>(new Employee()));
		//실패 : Worker 타입이 아닌 객체 해징 불가 | 에러메시지 : "Application<Worker>(Employee) 라는 생성자가 정의되지 않았음"
		
		//2. 제너릭을 Person으로 지정
//		PersonService.register2(new Application<Person>(new Object())); //실패 : Person의 상위 타입 객체 해징 불가
		PersonService.register2(new Application<Person>(new Person())); //성공 : Person 타입 객체 해징 가능
		PersonService.register2(new Application<Person>(new Worker())); //성공 : Person의 하위 타입 객체 해징 가능
		PersonService.register2(new Application<Person>(new Child())); //성공 : Person의 하위 타입 객체 해징 가능
//		PersonService.register2(new Application<Person>(new Animal())); //실패 : Person 타입이 아닌 객체 해징 불가
		
		//3. 제너릭을 Child로 지정
//		PersonService.register2(new Application<Child>(new Child()));
		//실패 : Worker의 하위 타입을 제너릭으로 지정할 수 없음 | 에러메시지: "register2(Application<? super Worker>) 메소드는 (Application<Child>)를 인자값으로 받을 수 없음"

		//4. 제너릭을 Employee로 지정
//		PersonService.register2(new Application<Employee>(new Employee()));
		//실패 : Worker 타입이 아닌 타입을 제너릭으로 지정할 수 없음 | 에러메시지: "register2(Application<? super Worker>) 메소드는 (Application<Employee>)를 인자값으로 받을 수 없음"
		
		System.out.println("\n===================== 3. <? extends Employee> =====================");
		//1. 제너릭을 Employee로 지정
//		PersonService.register3(new Application<Employee>(new Person()));
		//실패 : Employee의 상위 타입 객체 해징 불가 | 에러메시지 : "Application<Employee>(Person) 라는 생성자가 정의되지 않았음"
		PersonService.register3(new Application<Employee>(new Employee()));
		//성공 : Employee 타입 객체 해징 가능
		PersonService.register3(new Application<Employee>(new Manager()));
		PersonService.register3(new Application<Employee>(new Engineer()));
		//성공 : Employee의 하위 타입 객체 해징 가능
//		PersonService.register3(new Application<Employee>(new Worker()));
		//실패 : Employee 타입이 아닌 객체 해징 불가 | 에러메시지 : "Application<Employee>(Worker) 라는 생성자가 정의되지 않았음"
		
		//2. 제너릭을 Person으로 지정
//		PersonService.register3(new Application<Person>(new Person())); //실패 : Employee의 상위 타입을 제너릭으로 지정할 수 없음
		
		//3. 제너릭을 Manager로 지정
//		PersonService.register3(new Application<Manager>(new Employee())); //실패 : Manager의 상위 타입 객체 해징 불가
		PersonService.register3(new Application<Manager>(new Manager())); //성공 : Manager 타입 객체 해징 가능
		PersonService.register3(new Application<Manager>(new MGR1())); //성공 : Manager의 하위 타입 객체 해징 가능

		//4. 제너릭을 Worker로 지정
//		PersonService.register3(new Application<Worker>(new Worker())); //실패 : Employee 타입이 아닌 타입을 제너릭으로 지정할 수 없음
	}
}
