package com.prototype.pattern;

import com.main.Log;

public class ConcretePrototypeB implements Prototype {
	@Override
	public Prototype copy() {
		Log.o("Building Prot B");
		
		ConcretePrototypeB cpb = null;
		
		try {
			cpb = (ConcretePrototypeB) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cpb;

	}
	
	public String toString() {
		return "ConcProtB";
		
	}

}
