package com.observer.pattern;

import com.main.Log;


public class AppleStock implements StockObserver {

	public AppleStock() {
	}

	@Override
	public void update(String ibm, String apple) {
		Log.o(apple);
	}

}
