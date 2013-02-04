package com.abstrct.factory;

import com.main.Log;

public class ToyotaEngine extends Engine {

	@Override
	protected void putGas() {
		Log.o("Toyota putGas");

	}

	@Override
	protected void startIgnition() {
		Log.o("Toyota Start Ignition");
	}

}
