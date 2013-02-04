package com.decorator.pattern;

import com.main.Log;

public class AddOperation implements Component {

	@Override
	public void calculate(double x, double y) {
		Log.o("x+y= "+(x+y));

	}

}
