package com.edu.collection2;

import java.util.TreeSet;

/*
 *        Set
 *        |
 *        HashSet
 *        |
 *        TreeSet(중복 X, 정렬O)
 */
public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("BBB");
		set.add("CCC");
		set.add("AAA");
		set.add("DDD");
		System.out.println(set);
		
//		set.add(new Integer(11));
		set.add(22); //Boxing
		set.add(3);
		set.add(10);
		set.add(20);
		set.add(100);
		System.out.println(set.higher(10)); //11
		System.out.println(set.lower(100)); //20
		System.out.println(set.headSet(20)); //특정한 값을 중심으로 보다 작은 값
		System.out.println(set.tailSet(10)); //특정한 값을 중심으로 보다 큰 값
		//오름차순 정렬만 가능
		//Comparable, Comparator를 사용하여 내가 원하는 방식의 정렬 가능





	}

}
