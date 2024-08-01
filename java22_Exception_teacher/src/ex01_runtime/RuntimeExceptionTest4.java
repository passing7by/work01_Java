package ex01_runtime;
/*
	try -- 예외 가능성있는 코드
	catch -- 예외 발생시 잡는 코드
	finally -- (중요) 예외발생관 상관없이 무조건 실행되어야 하는 코드
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
			}catch(Exception e) {
				System.out.println("Exception Nice Catch~~!!");
			}finally {
				//이 부분은 어떨때 과연 사용할까...
				System.out.println("이 부분은 무조건 실행됩니다..예외 발생여부와 상관없이..");
			}
			i++;
		}
		
		
		//[만약 예외를 잡지 못했다면?]
		/*
		while(i<=3) {
			try {
				System.out.println(str[i]);//Hello(0), No(1), Nice(2),....str[3]
			}
			finally {
				System.out.println("이 부분은 무조건 실행됩니다..예외 발생여부와 상관없이..");
			}
			//[1. try{} 에서 예외가 발생하지 않아도 finally{}는 실행됨
			// 2. try{} 에서 예외가 발생하더라도 finally{}가 반드시 실행된 후에 예외가 터짐]
			i++;
		}	
		*/
		
		System.out.println("The end....");
		//[예외가 발생하지 않았거나, 예외가 처리되었다면 실행됨 & 예외가 처리되지 않고 터졌다면 실행되지 않음]
	}//main
}//RuntimeExceptionTest4
