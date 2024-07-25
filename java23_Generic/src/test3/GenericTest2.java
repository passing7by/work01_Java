package test3;
/*
 * 제한된 파라미터 타입
 * ::
 * 경우에 따라서는 타입 파라미터(<T>)를 대체하는 구체적인 타입을 제한할 필요가 있음
 * ex) 숫자를 연산하는 제네릭 메소드는 대체 타입으로 Number 또는 자식 클래스 (Byte, Short, Integer, Long, Double)로 제한할 필요가 있음
 * 이처럼 모든 타입으로 대체할 수 없고, 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는 타입 파라미터를 제한된 타입 파라미터 (Bounded Type Parameter) 라고 함
 * ::
 * 메소드 반환타입, 메소드 매개변수 타입으로만 가능
 * 클래스 타입에서는 적용될 수 없음
 * ::
 * <T extends Number>
 * Number : 숫자 값들의 조상.......
 * T에 올 수 있는 클래스 타입은 Number의 자식 클래스
 * Long Integer Double Float Byte Short...이런 값(Number 포함)들을 다룰 때 사용됨
 */
public class GenericTest2 {
//제한된 파라미터 타입을 갖는 제너릭 메소드 정의
	
	public static <T extends Number> boolean campare(T t1, T t2) {
	//[어디서든지 접근 허용 & 객체생성 없이 사용 가능 & Number를 포함하여, Number로부터 상속받은 모든 타입이 이 메소드에 들어갈 수 있음
	//& boolean 타입으로 리턴함 & 인자값은 두 개]
		System.out.println("compare( "+t1.getClass().getSimpleName()+", "+ 
										t2.getClass().getSimpleName()+" )");
		//[getClass() : 현재 참조하고 있는 클래스를 확인할 수 있는 메소드
		//출력값 : class 패키지명.클래스명]
		//[getName(): 패키지명이 포함된 클래스명 추출]
		//[getSimpleName() : 클래스명만 추출]
		double v1=t1.doubleValue(); //UnBoxing
		double v2=t2.doubleValue();

		return (v1==v2);
	}//campare
	//[main 밖에서 GenericTest2의 메소드 작성 - Static Method -> 객체 생성 없이 호출 가능]
	
	public static void main(String[] args) {
		//......Auto Boxing
		boolean result=campare(10,20);
		System.out.println(result);
		
		//......Auto Boxing
		boolean result2=campare(4.5,4.5);
		System.out.println(result2);
		
//		boolean result3=campare('A','A');
//		System.out.println(result2);
		//숫자 타입만 가능
	}//main
	
}//public class GenericTest2
