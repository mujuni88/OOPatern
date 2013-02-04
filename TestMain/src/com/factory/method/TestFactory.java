package com.factory.method;

import com.factory.method.Pet.PET;
import com.main.Log;

public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactoryMethod pf = new PetFactory();
		Pet pet = pf.createPetAnimal(PET.CAT);
		Log.o(pet.getOwner());
		
		pet = pf.createPetAnimal(PET.DOG);
		Log.o(pet.getOwner());
		
		pet = pf.createPetAnimal(null);
		Log.o(pet.getOwner());
	}

}
