package ex01_runtime;
/*
 * Runtime 계열 예외
 * 예외처리를 직접적으로 할 필요 없이 바로 소스를 수정하면 됨
 * 하지만 이 코드를 가지고 직접적으로 예외를 처리하는 방법을 익혀보도록 한다
 */
public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		
		String[] str = {
			"Hello",
			"No, I mean it",
			"Nice to meet you"
		};
		
		int i = 0;
		while(i<=3) {
			//예외 발생 가능성이 있는 코드
			try {
				System.out.println(str[i]); //str[3]에서 비정상적인 종료가 일어남
			//예외가 잡혔을 때의 코드
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch!!");
			}
			i++;	
		}
		
		System.out.println("The end..."); //예외가 정상적으로 처리되고 나서 실행됨
	}
}
