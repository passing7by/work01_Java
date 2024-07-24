package test1;

//Generic 사용하지 않음
//box에 뭐든지 담을 수 있도록 설계했을 때의 상황...
/*
 * 1. 뭐든지 담긴다
 * 2. 꺼낼 때마다 오브젝트 캐스팅을 해 줘야 한다
 */

class Box{
	Object content; //box에 뭐든지 담을 수 있기 위해서는 object로 지정해야 함
	
	public Object selectContent() { //box에 들어 있는 내용물을 꺼내는 함수
		return content;
	}
}//class Box

public class GenericTest01 {

	public static void main(String[] args) {
		Box box = new Box();
		//[Box 객체 선언 & 생성(묵시적 초기화만 진행된 상태, 값을 넣지 않았기 때문에 명시적 초기화는 아직 안 된 상태]
		box.content="곰돌이인형";
		//[content 필드에 값 주입]
		
		String bearDoor=(String)box.selectContent(); //오브젝트 캐스팅 해 줘야 함
		/*
		 * [1) String 타입의 'bearDoor' 변수 선언 
		 * 2) (1) box에 있는 selectContent()를 통해 content를 가져옴
		 *    (2) Object 타입이기 때문에 String 타입으로 오브젝트캐스팅 함
		 * 3) 1)에 2)를 대입함(String 타입의 'bearDoor' 변수를 명시적 초기화)
		 */
		
		System.out.println("박스 안의 내용물은..."+bearDoor);
	}//main
}//public class GenericTest01
