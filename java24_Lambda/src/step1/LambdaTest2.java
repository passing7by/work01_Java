package step1;

@FunctionalInterface 
interface Workable{ 
	String monthPayment(String ename, double weekSal);
}

//재사용성...LambdaTest4에서 확인!!

class Employee{ //Workable을 매개변수로 Hasing
	public void work(Workable w) { //해징으로 함수형 인터페이스가 들어감
		String result = w.monthPayment("Smith", 2000.0);
		System.out.println("result : "+ result);
	}
}

public class LambdaTest2 {

	public static void main(String[] args) {
		Employee e =new Employee();
		e.work((a,b)->{
			double salary = b*4 +100.0;
			return a+"씨의 4주 급여는 "+salary;
			
		});
	}

}
