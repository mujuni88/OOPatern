package com.abstrct.factory;

import com.main.Log;

public class NissanEngine extends Engine {

	@Override
	protected void putGas() {
		Log.o("Nissan putGas");

	}

	@Override
	protected void startIgnition() {
		Log.o("Nissan Start Ignition");
	}

}
