package com.main;

public class TestMain {

	public TestMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length > 0) {
		for(String arg:args) {
			Log(arg);
		}
		}
		String val = System.getProperty("isOnDebug");
		Log(val);
		
		boolean isDebug = java.lang.management.ManagementFactory.getRuntimeMXBean(). getInputArguments().toString().contains("-agentlib:jdwp");
		Log(isDebug?"Yes":"Nope");
	}
	
	public static void Log(String log) {
		
		System.out.println(log);
	}

}
