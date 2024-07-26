package step1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,45,200,33,44,3,1,99);
		/*[
		   new ArrayList() | Arrays.asList()
		   
		   new ArrayList<>() : ArrayList 리턴, 원소의 추가/삭제 가능, set 사용 가능
		   
		   Arrays.asList()
		   - Arrays의 정적 클래스인 ArrayList를 리턴, 원소의 추가/삭제 불가능, set 사용 가능,
		   - 특정한 배열에 의해 백업된 고정된 크기의 List를 반환 (즉, 배열을 만들고, 그 배열의 주소값을 가져 옴)
		     -> 배열은 생성한 뒤 길이를 바꿀 수 없으므로, asList에 의해 생성된 배열도 길이를 바꿀 수 없어서 원소의 추가가 불가한 것임
		   - 만약 원소를 추가/삭제하고 싶다면, new ArrayList로 변환해준 뒤 add() 메서드를 사용
		     ex. List<String> arrayList = new ArrayList<>(Arrays.asList(fruits));
		 ]*/
		
		//1. 익명 클래스 사용
//		Collections.sort(list, new Comparator<Integer>() { //Comparator -> 함수형 인터페이스
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//			//추상메소드 구현
//			
//		});
//		
//		System.out.println(list);
		
		//2. 람다식 사용
		Collections.sort(list, (o1, o2) -> o2-o1);
		System.out.println(list);
			
	}

}
