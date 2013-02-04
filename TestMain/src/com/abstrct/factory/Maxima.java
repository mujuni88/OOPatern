package com.abstrct.factory;

import com.main.Log;

public class Maxima implements Vehicle {

	@Override
	public void createTires() {	
		Log.o("Maxima creating tires...");

	}

	@Override
	public void createDoors() {
		Log.o("Maxima creating doors...");

	}

	@Override
	public void createMirrors() {
		Log.o("Maxima creating mirrors...");

	}

}
