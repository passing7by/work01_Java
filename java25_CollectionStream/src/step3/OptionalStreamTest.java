package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*
   Optional은 java8에서 추가된 기능으로, 값이 존재하지 않는 경우(null)를 다룰 때 사용되는 클래스
   이 클래스는 값이 있을 수도 있고, 값을 반환받지 못하는 상황을 중재하는 일종의 컨테이너 역할을 함
   그럼으로써NullPointerException 발생을 방지하는 효과가 있음
   값이 없을 때, 또다른 집계 결과를 입력해서 사용하는 Consumer 역할도 함
 */
public class OptionalStreamTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //값이 없는 리스트를 일단 생성
		//List<Integer> list =Arrays.asList(1,2,3,4,5);
		
		///예외 발생 - NoSuchElementException
		//ㄴ 이런 경우에 옵셔널이 필요함
//		double avg=list.stream()
//		.mapToInt(i->i.intValue())
//		.average()
//		.getAsDouble();
//		System.out.println(avg);
		
		//방법 1
		OptionalDouble optional = list.stream()
		//.mapToInt(i->i.intValue())
		.mapToInt(Integer::intValue) //메소드 참조법
		.average();
		if(optional.isPresent())
			System.out.println("방법 1_평균 : "+optional.getAsDouble());
		else
			System.out.println("방법 1_평균 : 0.0");
		
		//방법 2
		double avg=list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.orElse(0.0);
		System.out.println("방법 2_평균 : "+avg);
		
		//방법 3
		list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(i->System.out.print("방법 3_평균 : "+i)); //값이 있을 때만 실행됨, 값이 없으면 실행조차 되지 않음

	}

}
