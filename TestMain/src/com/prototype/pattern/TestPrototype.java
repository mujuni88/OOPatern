package com.prototype.pattern;

import com.main.Log;

public class TestPrototype {
	public static void main(String...args) {
		ConcretePrototypeA protA = new ConcretePrototypeA();
		Log.o(protA.toString());
		ConcretePrototypeA protAA = (ConcretePrototypeA) protA.copy();
		Log.o(protAA.toString());
		
		Log.o("ProtA = "+protA.hashCode()+" ProtAA = "+protAA.hashCode());
		
		ConcretePrototypeB protB = new ConcretePrototypeB();
		Log.o(protB.toString());
		ConcretePrototypeB protBB = (ConcretePrototypeB) protB.copy();
		Log.o(protBB.toString());
		
		Log.o("ProtB = "+protB.hashCode()+" ProtBB = "+protBB.hashCode());

	}
}
