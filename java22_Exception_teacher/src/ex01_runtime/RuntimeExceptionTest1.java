package ex01_runtime;
/*
 Runtime계열 예외
 예외처리를 직접적으로 할 필요가 없이 바로 소스를 수정하면 된다.
 하지만 이 코드를 가지고 직접적으로 예외 처리하는 방법을 익혀보도록 한다.
 */
public class RuntimeExceptionTest1 {
	public static void main(String[] args) {
		String[ ] str = {
			"Hello",
			"No, I mean it",
			"Nice to meet you"
		};
		
		int i=0;
		
		/*
		while(i<=3) {	
			System.out.println(str[i]);
			//[ str[0] : Hello(0), str[1] : No(1), str[2] : Nice(2),...str[3] : 배열의 길이를 벗어남 ]
			i++;
		}
		*/
		//[ArrayIndexOutOfBoundsException 발생 : 정해진 배열의 크기보다 크거나 음수 index에 대한 요청이 있을 시 발생]
		
		
		while(i<=3) {
			try { //[예외가 발생할 가능성이 있는 코드를 try{} 안에 작성]
				System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) { //[catch (발생한 예외의 종류) {예외 발생시 작동시킬 코드}]
				System.out.println("Nice Catch~~!!");
			}
			//[try{} 에서 예외가 발생하면, 해당 예외를 () 안에 담고 있는 catch(){} 가 실행됨]
			i++;
		}

		System.out.println("The end....");
		//[이 코드는 1. 모든 코드가 예외 없이 실행되거나 2. 예외가 발생하더라도 그 예외가 처리되었다면 실행되는 코드임]
	}//main
}//RuntimeExceptionTest1
