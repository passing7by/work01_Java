package step2;

import java.util.Arrays;

//중간처리 연산자...
public class Stream02ProcessMethod {

	public static void main(String[] args) {
		System.out.println("======== 1. 중간처리 연산자 잘못 사용하는 경우 =======");
		int[] intArr = {1,2,3,4,5};
		Arrays.stream(intArr)
				  .filter(i->i%2==0)
				  .peek(System.out::print); //peek() - 중간처리 연산자 => 최종연산이 있어야 결과를 볼 수 있음 (중간연산자는 지연된 연산을 함)
		
		System.out.println("\n======== 2. 중간처리 연산자 peek()을 제대로 이용 =======");
		int sum = Arrays.stream(intArr)
				.filter(i->i%2==0)
				.peek(i->System.out.println(i+" "))
				.sum(); //최종처리
		
		System.out.println("Result "+sum);

	}

}
