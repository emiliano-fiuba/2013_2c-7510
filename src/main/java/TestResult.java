package main.java;

public class TestResult {
	private String methodName;
	private boolean testPassed;
	private ResultBoard rb;
	
	public TestResult(String methodName, boolean testPassed) {
		this.methodName = methodName;
		this.testPassed = testPassed;
		rb = new ResultBoard();
	}

	public void informResult() {
		
		rb.ShowResult(methodName, testPassed);
	}

}
	