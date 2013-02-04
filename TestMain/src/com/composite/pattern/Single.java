package com.composite.pattern;

import java.util.List;

import com.main.Log;

public class Single implements Family {

	String name;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		Log.o(name);
	}

	@Override
	public void add(Family fam) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Family fam) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public List<Family> getChildren() {
		return null;
	}

}
