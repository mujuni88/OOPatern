package com.abstrct.factory;

public class TestAbstractFactory {
	public static final void main(String...args) {
		VehicleManufacture ty = new ToyotaManufacture();
		Engine ty_eng = ty.createEngine();
		ty_eng.runMotor();
		
		Vehicle ty_vcle = ty.createVehicle();
		ty_vcle.createDoors();
		ty_vcle.createMirrors();
		ty_vcle.createTires();
		
		VehicleManufacture ns = new NissanManufacture();
		Engine ns_eng = ns.createEngine();
		ns_eng.runMotor();
		
		Vehicle ns_vcle = ns.createVehicle();
		ns_vcle.createDoors();
		ns_vcle.createMirrors();
		ns_vcle.createTires();
		
		
	}
}
