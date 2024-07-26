/*
 * 람다, 람다식
 * ::
 * 함수형 프로그래밍
 * 자바는 자바8버전부터 함수형 프로그래밍 람다식을 제공
 * ::
 * 1. 익명함수(함수명이 없음)
 * 2. 코드가 간결하고 성능적으로는 불리한 부분이 있음
 * 3. 병렬처리 가능
 * ::
 * 
 * <일반적인 함수 형식>
 * Public int max(int a, int b){
 * 		return a>b? a : b ;
 * }
 * 
 * <람다식>
 * (int a, int b) -> { return a>b? a : b ; }
 * (int a, int b) -> a>b? a : b ; // 리턴 생략 가능, ;는 안됨
 * (a, b) -> a>b? a : b ; //매개변수 타입 생략 가능
 * 
 * -----------------------------------------------------------
 *
 * @FunctionalInterface의 구현체를 우리는 람다식으로 만들어야 함
 * 그렇기 때문에 @FunctionalInterface는 단 하나의 추상메소드만 가짐
 * 
 */
package step1;

@FunctionalInterface //어노테이션을 안 해도 에러는 안 나지만, 해주면 컴파일 시에 진짜 추상메소드가 한 개인지 체크하고 걸러내 줌
interface MyFunction{ //인터페이스 -> 추상메소드 가짐
	int max(int a, int b); //2개의 수 중 더 큰 수를 반환하는 기능의 템플릿
}
//추상메소드가 오직 한 개인 인터페이스를 '펑셔널 인터페이스'라고 함

public class LambdaTest1 {

	public static void main(String[] args) {
		//1. 익명클래스로 구현
		MyFunction f = new MyFunction() {
		//new와 MyFunction 사이에 '? implements'가 생략됨
		//[interface인  MyFunction()의 구현부 {}를 구현해야 함
		// 즉, interface를 구현하려면 interface를 상속받아 클래스를 생성하고(class명 implements interface명),
		// 그 클래스 안에서 메소드를 구현해야 함]

			@Override
			public int max(int a, int b) {
				
				return a>b ? a:b;
			}
			
		};
		int result1 = f.max(5, 3);
		System.out.println("result1 : "+result1);
		
		//2. 람다식으로 구현 (매개변수 -> 구현부;)
		MyFunction f2 = (a, b) -> a>b ? a:b;
		//[MyFunction 타입의 interface f2를 상속받은 익명의 클래스 안의 메소드 max() 구현...]
		int result2 = f2.max(5, 3); //윗줄에서 f2에 할당된 람다식((a, b) -> a>b ? a:b;)이 돌아감
		System.out.println("result2 : "+result2);

		//
	}

}
