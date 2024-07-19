package test3;
/*
 * 제한된 파라미터 타입
 * ::
 * 메소드 반환타입, 메소드 매개변수 타입으로만 가능...
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
	}
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

}//class
