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
		
		try {
			testSuiteTest.addTest(equalsObjectTest);
			testSuiteTest.addTest(notEqualsObjectTest);
			testSuiteTest.addTest(notEqualsIntTest);
			testSuiteTest.addTest(equalsIntTest);
			//Hqy que generar los tests de Affirm y agregarlos al suite, luego agregar el suite a testSuiteAll
			testSuiteAll.addTest(testSuiteTest);
			
		}catch (TestExistsException e) {
			
		}
		
		testRunner.startTesting(testSuiteAll);

	}
}
