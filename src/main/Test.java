package main;

import main.Affirm;

public abstract class Test {
	
	public Test() {
	}

	public static void assertEquals(String methodName, int a, int b) {
		boolean result = Affirm.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public static void assertNotEquals(String methodName, int a, int b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public static void assertEquals(String methodName, char a, char b) {
		boolean result = Affirm.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public static void assertNotEquals(String methodName, char a, char b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public static void assertEquals(String methodName, boolean a, boolean b) {
		boolean result = Affirm.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public static void assertNotEquals(String methodName, boolean a, boolean b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public static void assertEquals(String methodName, Object a, Object b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public static void assertNotEquals(String methodName, Object a, Object b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public static void assertEquals(String methodName, float a, float b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public static void assertNotEquals(String methodName, float a, float b) {
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
}
