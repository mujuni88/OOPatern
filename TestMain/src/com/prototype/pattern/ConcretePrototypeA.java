package com.prototype.pattern;

import com.main.Log;

public class ConcretePrototypeA implements Prototype {

	@Override
	public Prototype copy() {
		Log.o("Building Prot A");

		ConcretePrototypeA cpa = null;
		
		try {
			cpa = (ConcretePrototypeA) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cpa;

	}
	
	public String toString() {
		return "ConcProtA";
		
	}

}
