package step1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
   스트림 만드는 작업과정
   1. 스트림 생성..stream()
   2. 중간연산자
   3. 최종연산자
 */
public class CollectionStreamTest4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//////////////////////////////// 1. 스트림은 일회성이다 //////////////////////////////////
		Stream<Integer>intStream = list.stream();
		//3.
		intStream.forEach(System.out::print);
		
		System.out.println();
		
		intStream = list.stream(); //2. 스트림을 새로 염
		intStream.forEach(System.out::print); //1. Error...이미 위에서 스트림이 닫힘(최종연산 완료됨)
		
		System.out.println("\n------------------------------------------------------------------");
		
		//Stream<T>
		Stream<Integer> intStream2 = Stream.of(1,2,3,4,5); //스트림 생성
		System.out.println("intStream2 count"+intStream2.count());
//		System.out.println("intStream2 sum"+intStream2.sum()); //sum 기능 없음....intStream에 있음
		
		System.out.println("------------------------------------------------------------------");
		
		//intStream
		int[] intArr = {1,2,3,4,5};
		IntStream intStream3 = Arrays.stream(intArr);
		//intStream3.forEach(System.out::print);

//		System.out.println(intStream3.sum());
//		System.out.println(intStream3.average());
		System.out.println(intStream3.findFirst());

	}
}




