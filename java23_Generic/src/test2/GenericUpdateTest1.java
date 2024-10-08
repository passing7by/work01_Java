/*
 * 해당 코드에서는 제너릭 기법 사용
 * 1. 뭐든지 담을 수 있다...박스에
 * 2. 꺼낼 때 오브젝트 캐스팅을 안 하고 효율적으로 꺼낼 수있다
 */
package test2;

import java.util.ArrayList;
import java.util.List;

class Box<T>{
//T라는 클래스는 실제로 존재하지 않지만 Type을 의미함
//[제너릭 : 클래스 내부에서 사용할 데이터 타입을 외부에서 지정]
	T content; //Box에는 T 타입의 내용물이 담겨짐 T 타입은 나중(사용시)에 구체적인 타입으로 대체됨
	
	public T selectContent() {
		return content;
	}
}//class Box<T>

public class GenericUpdateTest1 {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		//[Box 타입의 'box' 객체를 선언하되, 제너릭을 <String>으로 지정 (사용시에 구체적인 타입으로 설정)] 
		box.content = "곰인형";
		
		String bear = box.selectContent();
		System.out.println("담겨진 것은"+bear); //오브젝트 캐스팅을 할 필요가 없음
		
		List<Integer> list = new ArrayList<>();
		list.add(10); //auto boxing (list.add(new Integer(10))를 자동적으로 해 줌)
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		//unboxing (intValue() --> 10 을 자동적으로 해 줌)
		//[intValue() : Integer 객체에서 int형 값을 뽑아내는 메소드]
		
		//코드 작성은 편하지만, 제너릭은 내부적으로는 박싱-언박싱을 계속 왔다갔다 함 => 많은 값을 핸들링 시, 퍼포먼스 저하
	}//main
}//public class GenericUpdateTest1
