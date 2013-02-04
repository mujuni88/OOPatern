package com.strategy.pattern;

public abstract class Employer {
	private String name;
	private double salary;
	private double bonus;
	
	
	public Employer(String name, double salary, double bonus) {
		super();
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public Employer() {
		this("", 12000.00, 1);
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getSalary() {
		return salary*bonus;
	}
	protected void setSalary(double salary) {
		this.salary = salary;
	}
	protected double getBonus() {
		return bonus;
	}
	protected void setBonus(double d) {
		this.bonus = d;
	}
	
	

}
