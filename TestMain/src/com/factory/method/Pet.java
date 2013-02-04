package com.factory.method;

public abstract class Pet {
	public enum PET {
		DOG,
		CAT
		;
	}
	
	String owner;
	
	public Pet setOwner(String owner) {
		this.owner = owner;
		return this;
	}
	public String getOwner() {
		return owner;
	}
	
}

