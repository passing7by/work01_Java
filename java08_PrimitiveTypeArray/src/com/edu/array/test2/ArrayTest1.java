package com.edu.array.test2;
/*
 * 배열은 한 번 잡은 사이즈는 바뀔 수 없음
 * 사이즈를 변경하는 순간 새로운 배열이 생성됨
 * 원본 데이터의 값을 복사해서 쓸 수는 있음
 * => (배열은 사이즈가 다른 배열의 데이터를 복사해서 자신의 배열 데이터로 사용 가능) System.arraycopy() 사용
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] members = {1,2,3,4,5}; //5칸 생성
		
		members = new int[8];
		//8칸짜리 배열이 다시 생성됨 = 다른 객체니까 다른 주소값이 부여됨 > 새로운 주소값이 members가 덧씌워지고, 전에 생성했던 객체는 쓰레기 객체가 됨
		members[5] = 6;
		members[6] = 7;
		members[7] = 8;
		
		for(int member : members)
			System.out.println(members);





	}
}