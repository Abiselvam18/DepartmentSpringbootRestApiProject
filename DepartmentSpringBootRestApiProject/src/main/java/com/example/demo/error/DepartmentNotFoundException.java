package com.example.demo.error;

public class DepartmentNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;

	public DepartmentNotFoundException(String s) {
		super(s);
	}
 
}

