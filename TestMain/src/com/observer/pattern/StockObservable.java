package com.observer.pattern;

import java.util.ArrayList;

import com.main.Log;

public class StockObservable {
	protected ArrayList<StockObserver> list;
	protected String ibm, apple;
	public static int ID = 0;
	
	public StockObservable() {
		list = new ArrayList<StockObserver>();
		ibm = apple = "";
		ID++;
	}
	
	public void attach(StockObserver ob) {
		list.add(ob);
	}
	
	public String getIbm() {
		return ibm;
	}

	public void setIbm(String ibm) {
		this.ibm = ibm;
		update();
	}

	public String getApple() {
		return apple;
	}

	public void setApple(String apple) {
		this.apple = apple;
		update();
	}

	public void detach(StockObserver ob) {
		list.remove(ob);
	}
	
	public void update() {
		Log.o("StockObservable "+ID);
		for(StockObserver ob:list) {
			ob.update(ibm, apple);
		}
	}
	
	
}
