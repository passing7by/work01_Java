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
		System.out.println("compare( "+t1.getClass().getSimpleName()+", "+ 
										t2.getClass().getSimpleName()+" )");
		double v1=t1.doubleValue(); //UnBoxing
		double v2=t2.doubleValue();

		return (v1==v2);
	}//campare
	//[Static Method -> 객체 생성 없이 호출 가능]
	
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
