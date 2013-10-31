package main.java;

public class TestResult {
	private String methodName;
	private boolean testPassed;
	
	public TestResult(String methodName, boolean testPassed) {
		this.methodName = methodName;
		this.testPassed = testPassed;
	}
	
	public void informTestPassed() {
		System.out.println(methodName + ": ok");
	}
	
	public void informTestFail() {
		System.err.println(methodName + ": FAIL");	
	}

	public void informResult() {
		if (testPassed) {
			informTestPassed();
		}
		else {
			informTestFail();
		}		
	}

}
