package com.edu.condition.test1;
/*
 switch(조건에 해당하는 변수){
 case 90~100: --> *범위는 스위치문에서는 쓰지 못함
 case 95:
 case 90:
  //실행문
  break; --> 반드시 이 실행을 빠져나오는 문구를 넣어야 함 (*해당하는 케이스를 빠져나가고 switch까지 완벽하게 빠져나가는 키워드임. **없을 경우 다음 케이스를 탐색하여 실행함)
  
  case 80:
  case 85:
  //실행문
  break;
  
  defalt: --> if문의 else와 같은 역할
  //실행문
  
 }
 */
public class GradeSwtchTest3 {

	public static void main(String[] args) {
		
		int grade = 90;
		
		switch (grade) {
		case 90:
		case 95:
			System.out.println("A Grade~~");
			break;
		case 80:
		case 85:
			System.out.println("B Grade~~");
			break;
		case 70:
		case 75:
			System.out.println("C Grade~~");
			break;
		default:
			System.out.println("Nuts~~"); //defalt 뒤에 break; 를 넣으나 안 넣으나 결과는 같음
		}

	}

}
