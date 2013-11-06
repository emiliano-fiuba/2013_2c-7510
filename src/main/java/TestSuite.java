package main.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.regex.Pattern;
import main.java.TestExistsException;

public class TestSuite extends Test {

	protected HashMap<String,Test> tests;

	public TestSuite (String newName) {
		super(newName);
		tests = new HashMap<String, Test>();
	}
	
	@Override
	public void run() {
		ResultPrinter.getInstance().addSuite(this.getName());
		setUp();
		
		Collection<Test> col = tests.values();		

		for (Test t : col) {
			t.setUp();
			try {
				t.run();
			} catch (Exception e) {
				t.setResult(new TestResultError(t.getName()));
			}
			t.tearDown();
			
			ResultPrinter.getInstance().addTestResults(t);
		}

		tearDown();
		ResultPrinter.getInstance().removeSuite(this.getName());
	}

	public void run(String pattern) {
		setUp();
		
		Collection<Test> col = tests.values();		

		for (Test t : col) {
			if (Pattern.matches(pattern, t.getName())) {
				t.setUp();
				t.run();
				t.tearDown();
			}
		}

		tearDown();
	}
	
	public void addTest(Test t) throws TestExistsException {
		if (!tests.containsKey(t.getName())) {
			tests.put(t.getName(), t);
		}
		else { 
			throw new TestExistsException(t.getName() 
					+ " already present in TestSuite "
					+ this.getName()); 
		}
	}

}
