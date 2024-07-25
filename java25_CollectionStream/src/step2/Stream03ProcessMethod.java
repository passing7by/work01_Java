package step2;
//최종처리 연산자
/*
   findFirst
   count
   forEach
   collect
   anyMatch
   
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream03ProcessMethod {

	public static void main(String[] args) {
		List<String> strings=List.of("I", "am", "a", "list", "String");
		
		//
		Stream<String>stream=strings.stream();
		stream=stream.limit(4);
//		System.out.println(stream); //데이터 안 나옴 (지연된 연산)
		
		//1. stream에서 첫번째 데이터를 찾아서 바로 출력
//		System.out.println(stream.findFirst().get());
		
		//2. stream 안에 있는 스트링 ㄷ이터의 갯수 출력
//		System.out.println(stream.count());
		
		//3. stream 안에 있는 스트링 데이터를 모두 출력 - forEach
//		stream.forEach(i->System.out.print(i+" "));
		
		//4. stream 안에 있는 스트링 데이터를 수집 - collect
		List<String>result=stream.collect(Collectors.toList());
		System.out.print(result);
		
	}

}
