package main.java;

public class TestRunner {  
	
	public void startTesting(TestSuite t) {
		t.run();
		ResultPrinter.getInstance().print();
	}
	
	public void startTesting(TestSuite t, String pattern) {
		t.run(pattern);
	}
}
