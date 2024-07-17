package com.edu.exception;

public class DuplicateEmpidException extends Exception{
	public DuplicateEmpidException() {
		this("EmpId에 해당하는 직원은 이미 등록된 상태입니다");
	}
	
	public DuplicateEmpidException(String message) {
		super(message);
	}
}
