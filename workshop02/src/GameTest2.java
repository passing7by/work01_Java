import java.util.Random;
import java.util.Scanner;

public class GameTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//스캐너 생성
		
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요. ");
		//게임 정보 소개
		
		int type = sc.nextInt();  //*게임 타입
		//스캐너로 값을 받아와서 게임 타입 선택

		int game = 0;  //*총 게임 횟수
		int judge = 0;
		int win = 0;
		int lose = 0;
		//변수 생성

		if (type == 1) {   //*스캐너로 입력받은 게임 타입이 1
			game = 5;  //*총 게임 횟수 5
			judge = 3; //*판정? 횟수 3
		//만약 스캐너로 입력받은 게임 타입이 1이라면, 총 게임 횟수는 5이고, 판정? 횟수는 3
		} else if (type == 2) {  //*스캐너로 입력받은 게임 타입이 2
			game = 3;  //*총 게임 횟수 3
			judge = 2; //*판정? 횟수 2
		//만약 스캐너로 입력받은 게임 타입이 2이라면, 총 게임 횟수는 3이고, 판정? 횟수는 2
		} else {  //*스캐너로 입력받은 게임 타입이 1도 2도 아님
			game = 1;  //*총 게임 횟수 1
			judge = 1; //*판정? 횟수 1
		//만약 스캐너로 입력받은 게임 타입이 1도 2도 아니라면, 총 게임 횟수는 1이고, 판정? 횟수는 1
		}
		//스캐너로 입력받은 게임 타입에 따라, 총 게임 횟수와, 판정? 횟수를 설정

		for (int i = 0; i < game && win < judge && lose < judge; i++) {
			int com = (int) (Math.random() * 3) + 1;
			System.out.print("가위바위보 중 하나 입력: ");
			String s = sc.next();
			int in = 0;
			if (s.equals("가위")) {
				in = 1;
			} else if (s.equals("주먹")) {
				in = 2;
			} else if (s.equals("보")) {
				in = 3;
			}
			if (com == in) {
				System.out.println("비겼습니다!!!");
			} else if ((com == 1 && in == 2) || (com == 2 && in == 3) || (com == 3 && in == 1)) {
				System.out.println("이겼습니다!!!");
				win++;
			} else {
				System.out.println("졌습니다!!!");
				lose++;
			}
		}
		String result = "무승부";
		if (win == lose) {
			result = "무승부";
		} else if (win > lose) {
			result = "컴퓨터 패";
		} else {
			result = "컴퓨터 승";
		}
		System.out.println("\n### " + result + "!!!");
	}

}
