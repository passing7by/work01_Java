package com.edu.collection2;

import java.util.Random;
import java.util.TreeSet;

/*
 * 중복된 번호를 받아들이지 않은 Set의 성질을 이용한 응용 예제
 * page 489 :: 예제 11-25와 동일한 로직..
 */
public class LottoMachineService {
	public TreeSet createLottoNumber(){
		//1. set이라는 이름으로 TreeSet을 생성
		//2. r이라는 이름으로 Random이라는 객체를 하나 생성(java.util)
		//3. while문 안에서 1~45 까지의 임의의 수를 반환받아 온다...r.nextInt(?)
		//4. 반환받은 값을 set에다 추가...
		//5. 6개의 값이 set에 저장되도록 while을 돌린다..
		TreeSet set = new TreeSet();
		Random r = new Random();
		while(set.size()<6){
			int num = r.nextInt(45)+1 ; //1~45까지의 랜덤한 수가 할당..
			set.add(num);
		}		
		return set; 
	}
}


