package com.strategy.pattern;

public final class EmployerFactory {
	public enum EMPLOYER {
		SOFTWARE,
		SALES
	}
	
	public static Employer getEmployer(EMPLOYER empl) {
		switch(empl) {
		case SALES:
			return new SalesPerson();
		case SOFTWARE:
			return new SoftwareDeveloper();
		default:
			throw new IllegalArgumentException("That Employer does not exists");
		
		}
	}
}
