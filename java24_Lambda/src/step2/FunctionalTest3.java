/*
   Collection :: 객체를 저장하는 방법론
   List | Map | Set | Iterable
   
   8버전 이후에 함수형 인터페이스를 Hasing하면서 제공되는 기능이 추가됨...
   
   Collection : boolean removeIf(Predicate p)
   List : void replaceAll()
   	- replaceAll() : 인자로 함수를 받고, 함수는 리스트의 요소를 인자로 받으며 변경할 값을 리턴함
   					 즉, 리스트의 모든 요소를 순회하면서 값을 변경
   Map : compute(), forEach(!!!!!!), ?
   	- compute() : 람다식을 통해서 기존의 값에 어떻게 연산을 할지 지정할 수 있음
   				  메서드에 넘겨주는 전달 인자의 첫 번째는 키값이고, 두 번째 인자에 람다식을 전달하면 됨
   				  해당 키의 값이 존재하지 않으면 NullPointerException이 발생하므로,
   				  키의 값이 null일 때 리턴해줄 값도 지정해야 함
 */
package step2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FunctionalTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) list.add(i);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(111, "Scott");
		map.put(222, "Blake");
		map.put(333, "King");
//		
//		//1. 리스트에 담긴 객체를 뽑아서 정보 출력
//		Iterator<Integer>it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		System.out.println("1. 리스트에 담긴 객체를 뽑아서 정보 출력 ==> forEach()");
		list.forEach(i->System.out.print(i+" "));
//		list.forEach(System.out::print);

		//2. list에 담긴 값 중에서 2의 배수 혹은 3의 배수를 제거한 후 출력...removeIf(P)
		System.out.println("\n2. list에 담긴 값 중에서 2의 배수 혹은 3의 배수를 제거한 후 출력");
		list.removeIf(i->i%2==0 || i%3==0);
		System.out.print(list);
		
		System.out.println("\n3. list의 모든 값들을 10 곱한다 ==> replaceAll");
		list.replaceAll(i->i*10);
		System.out.print(list);
		
		System.out.println("\n---------------------map-----------------------");
		System.out.println("\n4. map의 모든 키값과 밸류값 출력 ==> iterator");
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			System.out.println(key + map.get(key));
		}
		
		
		System.out.println("\n4. map의 모든 키값과 밸류값 출력 ==> forEach");
		map.entrySet().forEach(i->{
			System.out.println(i);
		});
	}//main
}//FunctionalTest3


