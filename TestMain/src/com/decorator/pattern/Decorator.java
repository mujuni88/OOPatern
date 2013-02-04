package com.decorator.pattern;


public abstract class Decorator implements Component {

	Component c;
	public Decorator(Component c) {
		this.c = c;
	}

}
