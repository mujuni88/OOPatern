package com.abstrct.factory;

public class NissanManufacture extends VehicleManufacture {

	@Override
	Vehicle createVehicle() {
		return new Maxima();
	}

	@Override
	Engine createEngine() {
		return new NissanEngine();
	}

}
