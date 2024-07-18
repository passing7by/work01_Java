package com.edu.collection2;

import java.util.TreeSet;

public class LottoMachineServiceTest4 {

	public static void main(String[] args) {
		LottoMachineService service = new LottoMachineService();
		TreeSet set = service.createLottoNumber();
		System.out.println("당신이 추첨하신 Lotto Number :: "+set);
	}
}
