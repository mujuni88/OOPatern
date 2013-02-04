package com.decorator.pattern;

public class TestDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddOperation aop = new AddOperation();		
		MultiplyDecorator md = new MultiplyDecorator(aop);
		DivideDecorator dd = new DivideDecorator(md);
		
		dd.calculate(4, 8);
	}

}
