package com.observer.pattern;

import com.main.Log;

public class IBMStock implements StockObserver{

	public IBMStock() {
	}

	@Override
	public void update(String ibm, String apple) {
		Log.o(ibm);
	}


}
