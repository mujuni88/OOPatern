package com.abstrct.factory;

public class ToyotaManufacture extends VehicleManufacture {

	@Override
	Vehicle createVehicle() {
		return new Camry();
	}

	@Override
	Engine createEngine() {
		return new ToyotaEngine();
	}

}
