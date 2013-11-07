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
		TestSuite testSuiteTest = new TestSuite("Test suite for testing Test");
		TestSuite testSuiteAffirm = new TestSuite("Test suite for testing Affirm");
		TestSuite testSuiteAll = new TestSuite("Test all");
		
		EqualsObjectTest equalsObjectTest = new EqualsObjectTest("Test two objects are equal");
		NotEqualsObjectTest notEqualsObjectTest = new NotEqualsObjectTest("Test two objects are different");
		NotEqualsIntTest notEqualsIntTest = new NotEqualsIntTest("Test two integers are different");
		EqualsIntTest equalsIntTest = new EqualsIntTest("Test two integers are equal");
		NotEqualsFloatTest notEqualsFloatTest = new NotEqualsFloatTest("Test two floats are different");
		EqualsFloatTest equalsFloatTest = new EqualsFloatTest("Test two floats are equal");
		NotEqualsBooleanTest notEqualsBooleanTest = new NotEqualsBooleanTest("Test two booleans are different");
		EqualsBooleanTest equalsBooleanTest = new EqualsBooleanTest("Test two booleans are equal");
		NotEqualsCharTest notEqualsCharTest = new NotEqualsCharTest("Test two chars are different");
		EqualsCharTest equalsCharTest = new EqualsCharTest("Test two chars are equal");
		
		try {
			testSuiteAffirm.addTest(equalsObjectTest);
			testSuiteAffirm.addTest(notEqualsObjectTest);
			testSuiteAffirm.addTest(notEqualsIntTest);
			testSuiteAffirm.addTest(equalsIntTest);
			testSuiteAffirm.addTest(notEqualsFloatTest);
			testSuiteAffirm.addTest(equalsFloatTest);
			testSuiteAffirm.addTest(notEqualsBooleanTest);
			testSuiteAffirm.addTest(equalsBooleanTest);
			testSuiteAffirm.addTest(notEqualsCharTest);
			testSuiteAffirm.addTest(equalsCharTest);
			
			testSuiteAll.addTest(testSuiteAffirm);
			testSuiteAll.addTest(testSuiteTest);
			
		}catch (TestExistsException e) {
			
		}
		
		testRunner.startTesting(testSuiteAll);

	}
}
