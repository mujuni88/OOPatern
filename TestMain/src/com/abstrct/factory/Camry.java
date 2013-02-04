package com.abstrct.factory;

import com.main.Log;

public class Camry implements Vehicle {

	@Override
	public void createTires() {	
		Log.o("Camry creating tires...");

	}

	@Override
	public void createDoors() {
		Log.o("Camry creating doors...");

	}

	@Override
	public void createMirrors() {
		Log.o("Camry creating mirrors...");

	}

}
