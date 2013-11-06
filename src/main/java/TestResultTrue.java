package main.java;

public class TestResultTrue extends TestResult {
	
	public TestResultTrue(String testName) {
		super (testName);
	}
	
	public String print() {
		return "[ok] " + this.testName;
	}
}
