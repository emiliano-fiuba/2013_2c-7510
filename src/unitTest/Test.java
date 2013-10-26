package unitTest;

import unitTest.Affirm;

public abstract class Test {
	
	public Test(){
		run();
	}
	
	/*Metodo que el usuario implementara para que sus tests se ejecuten */
	public abstract void run();
	
	
	public void assertEquals(String methodName, int a, int b){
		boolean result = Affirm.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, int a, int b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertEquals(String methodName, char a, char b){
		boolean result = Affirm.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, char a, char b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertEquals(String methodName, boolean a, boolean b){
		boolean result = Affirm.equals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
	
	public void assertNotEquals(String methodName, boolean a, boolean b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public void assertEquals(String methodName, Object a, Object b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public void assertNotEquals(String methodName, Object a, Object b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public void assertEquals(String methodName, float a, float b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}

	public void assertNotEquals(String methodName, float a, float b){
		boolean result = Affirm.notEquals(a, b);
		TestResult tr = new TestResult(methodName, result);
		tr.informResult();
	}
}
