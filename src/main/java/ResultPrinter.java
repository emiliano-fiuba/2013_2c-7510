package main.java;

import java.util.ArrayList;

public class ResultPrinter {

	private String SEPARATOR = "----------------";
	private String DOUBLE_SEPARATOR = "================";
	private String SUMMARY_HDR = "[failure] Summary";
	private static ResultPrinter instance = null;
	private String suiteName;
	private ArrayList<String> buffer;
	private int failedTests;
	private int errorTests;
	private int okTests;
	
	private ResultPrinter() {
		suiteName = "";
		failedTests = 0;
		errorTests = 0;
		okTests = 0;
		buffer = new ArrayList<String>();
	}
	
	public static ResultPrinter getInstance() {
		if (instance == null){
			instance = new ResultPrinter();
		}
		return instance;
	}

	public void addTestResults(Test test) {
		buffer.add(test.getResult().print());
		test.getResult().updateMe(this);
	}
	
	public void addSuite(String suiteName) {
		this.suiteName += "." + suiteName;
		buffer.add(this.suiteName);
		buffer.add(SEPARATOR);
	}
	
	public void removeSuite(String suiteName) {
		//Remove the last added Suite name
		this.suiteName.substring(0, this.suiteName.lastIndexOf("."));
	}
	
	public void print() { 
		for (String s: buffer) {
			System.out.println(s);
		}
		
		System.out.println(SUMMARY_HDR);
		System.out.println(DOUBLE_SEPARATOR);
		System.out.println("Run: " + failedTests + okTests + errorTests);
		System.out.println("Errors: " + errorTests);
		System.out.println("Failures: " + failedTests);
	}
	
	public void oneMoreTestFailed() {
		failedTests++;
	}

	public void oneMoreTestOk() {
		okTests++;
	}
	
	public void oneMoreTestErrored() {
		errorTests++;
	}
}
