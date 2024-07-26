package test3;

class Person{
	
}
class Worker extends Person{
	
}
class Employee extends Person{
	
}
class Manager extends Employee{

}
class Engineer extends Employee{

}//extends Person...

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

		
	}

}
