package com.composite.pattern;

import java.util.List;

public interface Family {
	public String getName();
	public void setName(String name);
	void add(Family fam);
	void remove(Family fam);
	List<Family> getChildren();
	void display();

}
