package ex01_runtime;
/*
try~catch구문에서 catch문은 여러번 작성할 수 있다.
1. 단 하나의 catch문만 돌아간다.
2. 예외를 잡을때 작은예외 =--> 큰예외 순으로 작성해야 한다. 거꾸로 하면 에러난다.
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
			}catch(NullPointerException e) { //[실제 값이 아닌 null을 가지고 있는 객체/변수를 호출할 때 발생]
				System.out.println("NullPointerException...Nice Catch~~!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException Nice Catch~~!!");
			}catch(Exception e) { //[위 catch문에서 잡히지 않은 예외가 잡힘]
				System.out.println("Exception Nice Catch~~!!");
			}
			i++;
		}	
		
		//[예외의 순서를 반대로 작성해 본다면? => 에러 발생]
		/*
		while(i<=3) {
			try {
				System.out.println(str[i]);
			}catch(Exception e) {
				System.out.println("NullPointerException...Nice Catch~~!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				//[컴파일 에러 발생 : 예외들의 조상인 Exception에서 모든 예외가 이미 다뤄지고 있기 때문에, 이 catch블락까지 예외가 닿지 않음]
				System.out.println("ArrayIndexOutOfBoundsException Nice Catch~~!!");
			}catch(NullPointerException e) { 
				//[컴파일 에러 발생 : 예외들의 조상인 Exception에서 모든 예외가 이미 다뤄지고 있기 때문에, 이 catch블락까지 예외가 닿지 않음]
				System.out.println("Exception Nice Catch~~!!");
			}
			i++;
		}	
		*/
		
		System.out.println("The end....");
	}//main
}//RuntimeExceptionTest2
