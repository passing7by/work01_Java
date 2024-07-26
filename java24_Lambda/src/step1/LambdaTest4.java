package step1;
/*
 *  LambdaTest2에서 기능의 매개변수로 인터페이스를 주입
 *  훨씬 더 간단한 코드로 다시 작성해보자.
 *  
 *  @FunctionalInterface
 *  0. 매개변수 X, 반환타입 X ex. Runnable | void run()
 *  1. 매개변수 O, 반환타입 X ex. Consumer | void accept(T) --> 값 주입/출력
 *  2. 매개변수 X, 반환타입 O ex. Supplier | T get() --> 값 리딩
 *  3. 매개변수 O, 반환타입 O ex. Function | T apply(T)
 *  4. 매개변수 O, 반환타입 boolean ex. Predicate | boolean test(T)
 *  
 */

@FunctionalInterface
interface Calculable{
	void calculate(int a, int b); //매개변수 2개, 반환타입 없음
}//interface Calculable

public class LambdaTest4 {
	
	//2. static 메소드의 매개변수로 Hasing
		public static void action(Calculable cal) {
			System.out.println("action...method...");
			int a = 11;
			int b = 11;
			cal.calculate(a, b);
		}
	
	public static void main(String[] args) {
		//1. 함수형 인터페이스를 바로 사용...람다식
		Calculable c = (x,y)->System.out.println(x+y);
		c.calculate(10, 20);
		
		System.out.println("--------------------------");
		
		//2. static 메소드의 매개변수로 Hasing
		action((x,y)->{
			int result = x+y;
			System.out.println("Result : " + result);
		});
		
		action((x,y)->{
			int result2 = x*y;
			System.out.println("Result2 : " + result2);
		});

	}//main
}//class LambdaTest4
