package step1;

@FunctionalInterface 
interface Workable{ 
	String monthPayment(String ename, double weekSal);
}//interface Workable

//재사용성...LambdaTest4에서 확인!!

class Employee{ //Workable을 매개변수로 Hasing
	public void work(Workable w) { //해징으로 함수형 인터페이스가 들어감
		String result = w.monthPayment("Smith", 2000.0); //() 안의 값으로 어떻게 구현할지{}를 21~23행의 람다식으로 작성
		System.out.println("result : "+ result);
	}
	
}//class Employee

public class LambdaTest2 {

	public static void main(String[] args) {
		//1. 익명 클래스로 구현
		Employee e1 = new Employee();
		e1.work(new Workable() {

			@Override
			public String monthPayment(String ename, double weekSal) {
				double salary = weekSal*4 +100.0;
				return ename+"씨의 4주 급여는 "+salary;
			}
			
		});
		
		//2. 람다식으로 구현
		Employee e2 =new Employee();
		e2.work((a,b)->{
			double salary = b*4 +100.0;
			return a+"씨의 4주 급여는 "+salary;
			
		});
	}//main
}//class LambdaTest2
