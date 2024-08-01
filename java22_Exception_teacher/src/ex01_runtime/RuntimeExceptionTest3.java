package ex01_runtime;
/*
	try~catch구문에서 catch문은 여러번 작성할 수 있다.
	Exception으로 한번에 크게 잡을수 있다.
 */
public class RuntimeExceptionTest3 {
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
			}
			i++;
		}	
		
		System.out.println("The end....");
	}//main
}//RuntimeExceptionTest3
