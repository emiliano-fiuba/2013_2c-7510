package test.java;

import main.java.TestExistsException;
import main.java.TestSuite;
import main.java.TestRunner;

public class FrameworkTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestRunner testRunner = new TestRunner();
		AffirmTestFwk affirmTest = new AffirmTestFwk("Test Affirm class");
		TestTestFwk testTest = new TestTestFwk("Test Test class");
		TestSuite testSuite = new TestSuite("Test suite");
		
		EqualsObjectTest equalsObjectTest = new EqualsObjectTest("Test two objects are equal");
		
		try {
			testSuite.addTest(testTest);
			testSuite.addTest(equalsObjectTest);
			
			
			testSuite.addTest(affirmTest);
		}catch (TestExistsException e) {
			
		}
		
		testRunner.startTesting(testSuite);

	}
}
