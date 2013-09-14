package com.main;

public class Log {
	public static void o(String value) {
		System.out.println(value);
	}

	public static void o(String message, Object value) {
		System.out.println("<====" + message+": "+value.toString()+" ====>");
	}
}
