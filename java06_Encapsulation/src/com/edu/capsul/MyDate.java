package com.edu.capsul;
//오늘 날짜정보를 저장하는 클래스
public class MyDate {
	
	int month;
	int day;
	//Encapsulation
	
	public int getMonth() {
		return month;
	}
	
	/*
	 * 1~12 에 해당하는 월 값이 들어올 때만 필드에 값을 할당
	 * 아니면 에러 메시지 출력
	 */
	public void setMonth(int month) {
		//필드초기화 전에 제어문 삽입
		if(month<=12 && month>=1) {
			this.month = month;
		}else {
			errorMsg("Month Error");
			System.exit(0);
		}
	}
	
	public int getDay() {
		return day;
	}
	
	/*
	 * 월에 따라서 날짜가 달라짐
	 * 1 3 5 7 8 10 12 -> ~31
	 * 2월 -> ~28
	 * 4 6 9 11 -> ~30
	 */
	public void setDay(int day) {
		
		switch(month) {
			case 2:
				if(day<=28 && day>=1)
					this.day = day;
				else {
					errorMsg("Day Error");
					System.exit(0);
				}

			case 4:
			case 6:
			case 9:
			case 11:
				if(day<=30 && day>=1)
				this.day = day;
				else {
					errorMsg("Day Error");
					System.exit(0);
				}
			default:
				if(day<=31 && day>=1)
				this.day = day;
				else {
					errorMsg("Day Error");
					System.exit(0);
				}	
		}//switch
	}//setDay
	
	//에러메시지를 출력하는 기능을 추가
	private void errorMsg(String value) {
		System.out.println("[에러]"+value);
	}
	
}//class
