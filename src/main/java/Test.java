package main.java;

/**
 * This class provides the public interface which can be used for the
 * client's test.
 * Using the class TestResult, it informs the result of the test.
 * 
 * @author Miguenz, Rodriguez, Suárez
 *
 */
public abstract class Test {
	
	protected String name;
	
	public Test (String newName) {
		name = newName;
	}
	
	public abstract void run ();
	
	public void setUp () { };
	
	public void tearDown () { };
	
	public String getName() {
		return name;
	}
    
	public void setName(String newName) {
		name = newName;
	}
	
    /**
     * @param methodName test's method name
     * @param a int value to be compare with b
     * @param b int value to be compare with a
     */
    public static void assertEquals(String methodName, int a, int b) {
        boolean result = Affirm.checkEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a int value to be compare with b
     * @param b int value to be compare with a
     */
    public static void assertNotEquals(String methodName, int a, int b) {
        boolean result = Affirm.checkNotEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a char value to be compare with b
     * @param b char value to be compare with a
     */
    public static void assertEquals(String methodName, char a, char b) {
        boolean result = Affirm.checkEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a char value to be compare with b
     * @param b char value to be compare with a
     */
    public static void assertNotEquals(String methodName, char a, char b) {
        boolean result = Affirm.checkNotEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a boolean value to be compare with b
     * @param b boolean value to be compare with a
     */
    public static void assertEquals(String methodName, boolean a, boolean b) {
        boolean result = Affirm.checkEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a boolean value to be compare with b
     * @param b boolean value to be compare with a
     */
    public static void assertNotEquals(String methodName, boolean a, boolean b) {
        boolean result = Affirm.checkNotEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a Object to be compare with b
     * @param b Object to be compare with a
     */
    public static void assertEquals(String methodName, Object a, Object b) {
        boolean result = Affirm.checkEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a Object to be compare with b
     * @param b Object to be compare with a
     */
    public static void assertNotEquals(String methodName, Object a, Object b) {
        boolean result = Affirm.checkNotEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a float value to be compare with b
     * @param b float value to be compare with a
     */
    public static void assertEquals(String methodName, float a, float b) {
        boolean result = Affirm.checkNotEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
    
    /**
     * @param methodName test's method name
     * @param a float value to be compare with b
     * @param b float value to be compare with a
     */
    public static void assertNotEquals(String methodName, float a, float b) {
        boolean result = Affirm.checkNotEquals(a, b);
        TestResult testResult = new TestResult(methodName, result);
        testResult.informResult();
    }
}
