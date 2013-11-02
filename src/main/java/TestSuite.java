package main.java;

import java.util.Collection;
import java.util.HashMap;

public class TestSuite extends Test {

	protected HashMap<String,Test> tests;

	public TestSuite (String newName) {
		super(newName);
		tests = new HashMap<String, Test>();
	}
	
	@Override
	public void run() {
		setUp();
		
		Collection<Test> col = tests.values();		

		for (Test t : col) {
			t.setUp();
			t.run();
			t.tearDown();
		}

		tearDown();
	}
	
	public void addTest(Test t) {
		if (!tests.containsKey(t.getName())) {
			tests.put(t.getName(), t);
		}
		else { 
			//throw exception? Send message? Return false? 
		}
	}

}
