package ex01_runtime;
/*
 * try -- 예외 가능성이 있는 코드
 * catch -- 예외 발생 시 잡는 코드
 * finally -- (중요) 예외 발생과는 상관 없이 무조건 실행되어야 하는 코드
 */
public class RuntimeExceptionTest4 {

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
			}catch(Exception e) {
				System.out.println("Exception...Nice Catch!!");
			}finally { //무조건 실행됨 (예외가 발생했든, 발생하지 않았든) => 총 4번 실행 됨
				System.out.println("이 부분은 무조건 실행됩니다...예외 발생 여부와 상관 없이");
			}
			i++;
		}
		
		System.out.println("The end..."); //예외가 정상적으로 처리되고 나서 실행됨
	}
}
