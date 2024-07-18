package ex01_runtime;
/*
	try -- 예외 가능성있는 코드
	catch -- 예외 발생시 잡는 코드
	finally -- !!! 예외발생관 상관없이 무조건 실행되어야 하는 코드
 */
public class RuntimeExceptionTest4 {
	public static void main(String[] args) {
		String[ ] str = {
			"Hello",
			"No, I mean it",
			"Nice to meet you"
		};
		int i=0;
		while(i<=3) {
			try {
				System.out.println(str[i]);//Hello(0), No(1), Nice(2),....str[3]
			}catch(Exception e) { //분모를 0으로 했을떄 발생하는...폭탄
				System.out.println("Exception Nice Catch~~!!");
			}finally {
				//이 부분은 어떨때 과연 사용할까...
				System.out.println("이 부분은 무조건 실행됩니다..예외 발생여부와 상관없이..");
			}
			i++;
		}	
		System.out.println("The end....");
	}
}
