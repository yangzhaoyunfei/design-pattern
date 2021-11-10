package com.company;

public class Main {

	public static void main(String[] args) {
		callSelf("-");
	}

	static void callSelf(String s) {
		System.out.printf("%s>进入%n", s);
		if (s.length() < 3) {
			callSelf(s + "-");
		}
		System.out.printf("<%s退出%n", s);
	}
}
