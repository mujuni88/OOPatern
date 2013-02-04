package com.factory.method;

import com.factory.method.Pet.PET;

public class PetFactory implements FactoryMethod{

	@Override
	public Pet createPetAnimal(PET pet) {
		switch(pet) {
		case CAT:
			return new Cat().setOwner("John");
		case DOG:
			return new Dog().setOwner("Joe");
		default:
			throw new IllegalArgumentException("Pet not found");
		}
	}

}
