package ex01_runtime;
/*
 * try ~ catch 구문에서 catch는 여러번 잡을 수 있음
 * Exception: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException의 부모
 * => Exception으로 한 번에 크게 잡을 수 있음
 */
public class RuntimeExceptionTest3 {

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
			}catch(Exception e) { //Exception으로 ArrayIndexOutOfBoundsException를 잡음
				System.out.println("Exception...Nice Catch!!");
			}
			i++;	
		}
		
		System.out.println("The end..."); //예외가 정상적으로 처리되고 나서 실행됨
	}
}
