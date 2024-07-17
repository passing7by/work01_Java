package self.bank.test;

import self.bank.service.BankService;

public class SingletoneTest {

	public static void main(String[] args) {
		//BankService s1 = new BankService(); -> 생성 안됨
		BankService s1 = BankService.getInstance();
		BankService s2 = BankService.getInstance();
		BankService s3 = BankService.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("====");
		System.out.println(s3.toString());
		//레퍼런스 변수에는 toString이 생략되어 있음

	}

}
