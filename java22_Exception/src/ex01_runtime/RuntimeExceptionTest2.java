package ex01_runtime;
/*
 * try ~ catch 구문에서 catch는 여러번 잡을 수 있음
 * 1. 단, 하나의 catch 문만 돌아감
 * 2. 예외를 잡을 때 작은 예외 -> 큰 예외 순으로 잡아야 함. 거꾸로 하면 에러 발생
 */
public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		
		String[] str = {
			"Hello",
			"No, I mean it",
			"Nice to meet you"
		};
		
		int i = 0;
		while(i<=3) {
			try {
				System.out.println(str[i]); //str[3]에서 비정상적인 종료가 일어남
			}catch(NullPointerException e) { //NullPointerException: 객체를 생성하지 않고 멤버에 접근했을 때 발생
				System.out.println("NullPointerException...Nice Catch!!");
			}catch(ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException: 배열에서 인덱스 범위를 초과하여 실행할 경우 발생
				System.out.println("ArrayIndexOutOfBoundsException...Nice Catch!!");
			}catch(ArithmeticException e) { //ArithmeticException: 분모를 0으로 했을 때 발생
				System.out.println("ArithmeticException...Nice Catch!!");
			}
			i++;	
		}
		
		System.out.println("The end..."); //예외가 정상적으로 처리되고 나서 실행됨
	}
}
