package com.edu.collection1;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest3 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("강호동");
		set.add("이수근");
		set.add("강호동");//중복
		set.add("서장훈");
		set.add("김희철");
		
		System.out.println(set.size()+" 명입니다."); //4
		System.out.println(set.toString());
		
		//1. 서장훈씨가 포함되어져 있는지 확인...
		boolean flag=set.contains("서장훈");
		System.out.println("서장훈 님이 포함되어져 있나요? "+flag);
		
		//2. 현재 Collection 안이 비어졌는지 여부도 확인...
		System.out.println("데이타가 비어져 있나요?"+set.isEmpty());
		
		//3. 이수근 을 삭제...나머지 사람들을 출력
		set.remove("이수근");
		System.out.println(set);
		
		//4. set안에 들어있는 모든 데이타를 삭제
		set.clear();
		
		//5. 정말로 비워졌는지를 확인
		System.out.println("데이타가 비어져 있나요?"+set.isEmpty());
	}
}








