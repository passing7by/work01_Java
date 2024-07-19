package test1;

//Generic 사용 안함
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
}

public class GenericTest01 {

	public static void main(String[] args) {
		Box box = new Box();
		box.content="곰돌이인형";
		
		String bearDoor=(String)box.selectContent(); //오브젝트 캐스팅 해 줘야 함
		System.out.println("박스 안의 내용물은..."+bearDoor);
		
	}

}
