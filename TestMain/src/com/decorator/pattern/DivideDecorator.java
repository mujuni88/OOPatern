package com.decorator.pattern;

import com.main.Log;

public class DivideDecorator extends Decorator {

	public DivideDecorator(Component c) {
		super(c);
	}

	@Override
	public void calculate(double x, double y) {
		c.calculate(x, y);
		Log.o("\nx/y= "+(x/y));
	}

}
