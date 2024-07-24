package step1;
/*
   스트림의 특징
   1. Read Only - 스트림은 데이터 소스로부터 데이터를 읽어들이기만 할 뿐, 데이터를 변경하지 않는다
   2. 일회용임 - Iterator와의 공통점 - 최종연산이 진행되면 닫히고, 필요하면 다시 생성해서 사용해야 함
   3. 최종연산 전까지 스트림의 중간연산이 수행되지 않음 (지연된 연산)
   4. 병렬처리 작업이 가능 - 멀티 스레드 지원
   	  FP(함수형 언어)는 빅데이터(대용량 작업)를 빠르게 처리하기 위해 발전되어 온 기술...ai와 연결됨
   	  ㄴ 직렬적 작업보다는 병렬적 작업으로 많은 양의 데이터를 효율적으로 처리하는 기술이 필수 (람다와 스트림은 빅데이터를 처리하기 위해 발전된 기술임)
   5. Stream<Integer> VS IntStream
      Stream<Double>  VS DoubleStream
      Stream<Long>    VS LongStream
      Stream<Float>   VS FloatStream
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionStreamTest2 {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Melon");
		fruits.add("Orange");
		fruits.add("Grapefruit");
		
		fruits.add("Melon");
		fruits.add("Orange");
		fruits.add("Grapefruit");
		
		//1. 처음 리스트가 그대로 나옴
		System.out.println("원본 리스트1 ::: "+fruits);
		Stream<String> stream= fruits.stream(); 
		stream.distinct().limit(3).sorted().forEach(i->System.out.println(i+" "));
		
		System.out.println("원본 리스트1 ::: "+fruits); 
		
		System.out.println("-------------------------------------------------------");
		
		//2. 문자열 배열이 소스인 스트림
		String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
		Stream<String> strStream = Stream.of(strArr);
		strStream.forEach(System.out::println); //여기서 이미 최종연산이 진행됨(스트림 요소를 꺼냄)
		
		//long count = strStream.count();
		//System.out.println("남은 데이터 갯수 : "+count);
		//에러 발생 - 에러메시지: 스트림이 이미 닫힘 (최종연산을 하게 되면 스트림이 닫히고, 다시 사용하지 못함)
		
		System.out.println("-------------------------------------------------------");
		
		//3.
		IntStream intStream = new Random().ints(1, 46); //ints() - 반환타입이 intStream -> 박싱/언박싱 필요 없음 & 숫자 연산의 다양한 기능이 제공됨
//		intStream.forEach(i->System.out.print(i+" "));
		intStream.distinct().limit(6).sorted()
											.forEach(i->System.out.print(i+" "));
		
		//4.
		String[] strArr2 = {"dd", "aaa", "CC", "cc", "b"};
		Stream<String> strStream2 = Stream.of(strArr);
		
//		int sum = strStream2.mapToInt(s->s.length()).sum();
//		System.out.println("모든 문자열의 길이의 합 "+sum);
		
		//위의 코드를 병렬처리로 만들 수 있음 - parallel()
		int sum = strStream2.parallel().mapToInt(s->s.length()).sum();
		System.out.println("모든 문자열의 길이의 합 "+sum);
		
	}
}
