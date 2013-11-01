package main.java;

import java.util.LinkedList;

public class TestSuite extends Test {

	protected LinkedList<Test> tests;
	
	@Override
	public void run() {
		setUp();
		
		for (Test t : tests) {
			t.setUp();
			t.run();
			t.tearDown();
		}
		
		tearDown();
	}
	
	public void addTest(Test t) {
		tests.add(t);
	}

}
