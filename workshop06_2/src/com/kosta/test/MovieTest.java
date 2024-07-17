package com.kosta.test;

import java.util.Arrays;
import java.util.Scanner;

import com.kosta.service.MovieMgr;
import com.kosta.vo.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//[Scanner 클래스 타입의 'sc'라는 객체 선언 & 생성,
		//필드값은 'System.in'(system을 참조하여 들어온 값)]
		
		System.out.println("<<영화 관리 프로그램>>");
		
		//getInstance()로 MovieMgr 객체 받아옴..
		MovieMgr mvManager = MovieMgr.getInstance();
		//[MovieMgr 클래스 타입의 'mvManager' 변수에
		//MovieMgr을 참조하여 getInstance()를 통해 얻은 mgr 객체를 대입함]
		
		boolean flag = true;
		//[boolean type 'flag' local variable 선언 & 값을 true로 초기화]
		while(flag) {
		//['flag'가 참이면 {}를 계속 반복하라]
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("0. 종료");
			
			int selectNum = sc.nextInt();
			//[int type local variable 선언
			//& 값 초기화('sc'를 참조하여 nextInt()를 실행하여 얻은 값)] 
			switch(selectNum) {
			//['selectNum'과 동일한 값을 갖는 case로 가서 실행문을 실행하라]
			case 1:
			//['selectNum'이 1이라면 ':' 다음을 실행하라]
				System.out.print("영화 명을 입력해주세요 : ");
				String mvName = sc.next();
				//[String type 'mvName' local variable 선언
				//& 값 초기화('sc'를 참조하여 next()를 통해 얻은 값)]
				System.out.print("감독 명을 입력해주세요 : ");
				String mvDir = sc.next();
				System.out.print("등급을 입력해주세요 : ");
				int mvGr = sc.nextInt();
				System.out.print("장르를 입력해주세요 : ");
				String mvGre = sc.next();
				System.out.print("요약을 입력해주세요 : ");
				String mvSumm = sc.next();
				sc.nextLine();
				//[next()는 공백 전까지만 입력되므로 공백을 먹어줄 nextLine() 삽입]
				
				//MovieMgr의 add 호출
				mvManager.add(new Movie(mvName,mvDir,mvGr,mvGre,mvSumm));
				/*
				 * [getInstance를 통해 얻어온 객체인 'mgr'의 값을 대입한 'mvManager'의 값을 참조하여
				 * add()를 실행]
				 * [add()는 입력값으로 Movie 클래스 타입의 객체를 받으므로,
				 * 스캐너로 입력받은 값을 필드로 하여 새 Movie 클래스 타입의 객체를 만들고,
				 * 만든 객체를 add() 메소드에 입력시 영화를 추가함]
				 */				
				System.out.println();
				//[윗줄들이 실행된 후 한 줄 공백 삽입되도록 함]
				break;
				//[switch문을 빠져나옴]
			case 2:
				System.out.println(Arrays.toString(mvManager.search()));
				/*
				 * [Arrays.toString()
				 * :: 배열을 입력값으로 받아서, 배열의 값들을 문자열 형태로 만들어 리턴해 줌]
				 * [출력해라()를
				 * ('mvManager' 변수를 참조하여 search()를 실행하여 얻은 값(배열)들을
				 * 문자열 형태로 리턴해라)] 
				 */				
				break;
			case 3:
				System.out.println("찾고자하는 제목을 입력하세요 : ");
				mvName = sc.next();
				System.out.println(Arrays.toString(mvManager.search(mvName)));
				
				break;
			case 4:
				System.out.print("찾고자하는 장르를 입력하세요 : ");
				mvGre = sc.next();
				System.out.println(Arrays.toString(mvManager.search(mvGre)));
				
				break;
			case 5:
				System.out.print("삭제하고자하는 제목을 입력하세요 : ");
				mvName = sc.next();
				mvManager.delete(mvName);
				
				System.out.println("삭제완료");
				break;
			case 0:
				flag=false;
				//['flag'에 false를 대입시킨다]
				break;
				//[switch문을 빠져나온다]
				//[switch문을 빠져나온 뒤에, 'flag'의 값은 false이므로 while문이 실행되지 않음]
			}			
		}
	}

}
