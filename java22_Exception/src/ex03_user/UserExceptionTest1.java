package ex03_user;

class Boom extends Exception{

	public Boom() {
		this("This is Boom Exception");
	}
	public Boom(String message) {
		super(message);
	}
}

class User{
	public void calc(int x, int y) throws Boom{ //임의의 값인 x,y가 인자값으로 함수 호출시에 들어 옴
		System.out.println("2. calc 함수 호출");
		if(x==0)
		//ArithmeticException을 발생시킴...
			throw new Boom("x가 0이면 안돼요...분모가 될 숫자거든요"); //throw는 사용자가 예외를 만들 때 사용
			
		
			
		//연산이 진행됨... y/x
		System.out.println("3. calc 함수 호출...X는 0이 아닙니다");

	}
}

public class UserExceptionTest1 {

	public static void main(String[] args) {
	System.out.println("1. 유저 객체 생성");
		User user = new User(); 
	try {
	user.calc(0,10);
	}catch(Boom e) {
		System.out.println("3. 폭탄 처리...X는 0이었네요");
	}
	System.out.println("4. 폭탄 처리 성공...");


}
}
