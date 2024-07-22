package step1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class LambdaTest3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,45,200,33,44,3,1,99);
		
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
