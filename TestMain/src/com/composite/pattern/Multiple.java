package com.composite.pattern;

import java.util.ArrayList;
import java.util.List;

import com.main.Log;

public class Multiple implements Family {

	List<Family> fam;
	String name;
	
	Multiple() {
		fam = new ArrayList<Family>();
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void add(Family fam) {
		this.fam.add(fam);
	}

	@Override
	public void remove(Family fam) {
		this.remove(fam);
	}

	@Override
	public List<Family> getChildren() {
		return fam;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		for(Family fm: fam) {
			Log.o("\t");
			fm.display();
		}
		
	}


}
