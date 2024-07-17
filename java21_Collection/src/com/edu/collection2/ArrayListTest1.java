package com.edu.collection2;

import java.util.ArrayList;

import com.edu.vo.Person;

public class ArrayListTest1 {

	public static void main(String[] args) {
//		ArrayList<Person> list = new ArrayList<Person>();
		ArrayList list = new ArrayList();
		//기본 10칸짜리 리스트
		//<> : generic - List 안에 저장된 객체의 타입을 알려주는 역할
		
		//add
		list.add(new Person(11,"AA"));
		list.add(new Person(22,"BB"));
		list.add(new Person(33,"CC"));
		list.add(new Person(44,"DD"));
		list.add(new Person(55,"EE"));
		
		System.out.println(list);
		//원래는 list의 위치값이 나오는데, 지금은 안에 있는 데이터가 출력됨 (안에 있는 데이터가 출력되도록 컬력센은 toStrignd이 오버라이딩 되어 있음)
		//근데 객체가 들어갔는데? -> 객체에도 Person 클래스에서 생성한 toString이 오버라이딩 됨

		System.out.println(list.size());
		list.trimToSize(); // size와 capacity가 동일해 짐

		//리스트에 있는 사람 중에서 2번째 사람의 정보를 출력
		Person secondPerson = (Person)list.get(1);
		//list.get(1); : 해당 인덱스의 객체를 반환함
		//Object casting을 안 하려면 처음에 <>(제너릭)을 작성 해 줘야 함
		//ArrayList - 아무거나 다 들어감...(이유: Object 타입이 들어가도록 만들어져 있기 때문)
		System.out.println(secondPerson);
		
		//list에 들어있는 사람들 평균 나이를 구해서 출력
		int sum = 0;
		for(Object o : list	) {
			sum += ((Person) o).getAge();
			
			System.out.println("평균연령은 "+sum/list.size());
		}
		

		
	}

}
