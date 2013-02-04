package com.observer.pattern;


public class TestObserver {
	public static void main(String ...args) {
		IBMStock ibm = new IBMStock();
		AppleStock apple = new AppleStock();
		
		StockObservable pub = new StockObservable();
		pub.attach(ibm);
		pub.attach(apple);
		pub.setApple("50");
		pub.setIbm("300");
		
		StockObservable pub2 = new StockObservable();
		pub2.attach(ibm);
		pub2.attach(apple);
		pub2.setApple("50");
		pub2.setIbm("300");
		
	}
}
