package com.edu.collection1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 *               Map
 *               |
 *               HashMap
 *               key    -    value 쌍으로 저장
 *               (중복안됨)     (중복가능)
 *               순서는 없다
 */
public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("강호동", 90); //Boxing...new Integer(90) (컴파일러가 알아서 int타입 값을 integer 타입으로 만들어서 넣어줌)
		map.put("이수근", 80);
		map.put("서장훈", 95);
		map.put("김희철", 60);
		
		/*
		 * 1. 키값들을 뽑아서
		 * 2. 반복문을 통해서 키값에 해당하는 점수를 뽑고
		 * 3. 최종적으로 모든 성적의 합과 평균을 구하라
		 */
		
		System.out.println("============== keySet() ==============");
		int total = 0; //UnBoxing
		for(String key : map.keySet()) {
			int score = map.get(key);
			total+=score;
		}
		
		System.out.println("모든 사람들의 성적의 총합은 "+total+"점 입니다");
		System.out.println("모든 사람들의 성적의 평균은 "+total/map.size()+"점 입니다");
		
		System.out.println("============== values() ==============");
		int sum = 0;
		for(int V : map.values()) sum +=V;
		

		System.out.println("모든 사람들의 성적의 총합은 "+total+"점 입니다");
		System.out.println("모든 사람들의 성적의 평균은 "+total/map.size()+"점 입니다");
		
		System.out.println("============== Collctions ==============");
		System.out.println("최고성적은 "+Collections.max(map.values())+"입니다");


	}

}
