package main.java;

public class TestResultFalse extends TestResult {
	
	public TestResultFalse(String testName) {
		super (testName);
	}
	
	public String print() {
		return "[fail] " + this.testName;
	}
}
