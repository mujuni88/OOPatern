package com.decorator.pattern;

import com.main.Log;

public class MultiplyDecorator extends Decorator {

	public MultiplyDecorator(Component c) {
		super(c);
	}

	@Override
	public void calculate(double x, double y) {
		c.calculate(x, y);
		Log.o("\nx*y= "+(x*y));
	}

}
