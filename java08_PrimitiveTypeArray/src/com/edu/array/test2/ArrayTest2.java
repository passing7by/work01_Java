package com.edu.array.test2;
/*
배열은 사이즈는 불변하지만,
다른 배열의 데이터를 카피해서 사용 가능
System.arraycopy() 함수 사용
::배열의 특징
1. 여러개의 값을 하나로 묶는 기능...전제조건 SameDateType
2. 배열은 사이즈 변경 불가...Resizing 안됨
3. 사이즈가 다른 배열의 요소값을 copy 해 올수는 있음
4. 배열은 객체다...클래스 타입이 제공되지 않는...
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6}; //사이즈가 6
		int[] source = {10,9,8,7,6,5,4,3,2,1}; //사이즈가 10

		//source 데이터를 카피해서...8~3 copy | targt에 처음부터 끝까지
		//target
		//System.arraycopy
		System.arraycopy(source, 2, target, 0, target.length);
		
		for(int i : target) System.out.println(i +" ");


	}
}