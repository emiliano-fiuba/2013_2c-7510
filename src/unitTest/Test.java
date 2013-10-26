package unitTest;

import unitTest.Assert;

public abstract class Test {
	
	/*Metodo que el usuario implementara para que sus tests se ejecuten */
	public abstract void run();
	
	public void assertEquals(String methodName, String a, String b){
		boolean result = Assert.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, String a, String b){
		boolean result = Assert.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertEquals(String methodName, int a, int b){
		boolean result = Assert.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, int a, int b){
		boolean result = Assert.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertEquals(String methodName, char a, char b){
		boolean result = Assert.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, char a, char b){
		boolean result = Assert.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertEquals(String methodName, boolean a, boolean b){
		boolean result = Assert.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, boolean a, boolean b){
		boolean result = Assert.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
}
