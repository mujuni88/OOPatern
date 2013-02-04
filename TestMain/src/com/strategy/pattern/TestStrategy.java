package com.strategy.pattern;

import com.main.Log;
import com.strategy.pattern.EmployerFactory.EMPLOYER;

public class TestStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SoftwareDeveloper joe = (SoftwareDeveloper) EmployerFactory.getEmployer(EMPLOYER.SOFTWARE);
		Log.o(String.format("Joe salary %s", joe.getSalary()));
		
		SalesPerson edwin = (SalesPerson) EmployerFactory.getEmployer(EMPLOYER.SALES);
		Log.o(String.format("Edwin salary %s", edwin.getSalary()));
		
		joe.setBonus(20.0);
		Log.o(String.format("Joe salary %s", joe.getSalary()));

		edwin.setBonus(20.6);
		Log.o(String.format("Edwin salary %s", edwin.getSalary()));


	}

}
