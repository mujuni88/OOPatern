package com.abstrct.factory;

public abstract class Engine {
	public void runMotor() {
		putGas();
		startIgnition();
	}
	protected abstract void putGas();
	protected abstract void startIgnition();
}
