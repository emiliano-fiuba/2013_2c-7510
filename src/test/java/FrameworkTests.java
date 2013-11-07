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
		TestSuite testSuite = new TestSuite("Test suite");
		
		EqualsObjectTest equalsObjectTest = new EqualsObjectTest("Test two objects are equal");
		NotEqualsObjectTest notEqualsObjectTest = new NotEqualsObjectTest("Test two objects are different");
		NotEqualsIntTest notEqualsIntTest = new NotEqualsIntTest("Test two integers are different");
		EqualsIntTest equalsIntTest = new EqualsIntTest("Test two integers are equal");
		
		try {
			testSuite.addTest(equalsObjectTest);
			testSuite.addTest(notEqualsObjectTest);
			testSuite.addTest(notEqualsIntTest);
			testSuite.addTest(equalsIntTest);
			
		}catch (TestExistsException e) {
			
		}
		
		testRunner.startTesting(testSuite);

	}
}
