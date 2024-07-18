package ex01_runtime;
/*
try~catch구문에서 catch는 여러번 잡을수 있다.
1. 단 하나의 catch문만 돌아간다.
2. 예외를 잡을때 작은예외 =--> 큰예외 순으로 잡아야 한다. 거꾸로 하면 에러난다.
 */
public class RuntimeExceptionTest2 {
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
			}catch(NullPointerException e) { //객체생성하지 않고 멤버 접근했을때 발생..폭탄
				System.out.println("NullPointerException...Nice Catch~~!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException Nice Catch~~!!");
			}catch(Exception e) { //분모를 0으로 했을떄 발생하는...폭탄
				System.out.println("Exception Nice Catch~~!!");
			}
			i++;
		}	
		System.out.println("The end....");
	}
}
