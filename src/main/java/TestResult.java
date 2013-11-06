package main.java;

/**
 * This class collects the result of a test and shows the result
 * using ResultBoard class.
 * 
 * @author Miguenz, Rodriguez, Suárez
 *
 */
public class TestResult {

	protected String testName;
	private String methodName;
    private boolean testPassed;
    private ResultBoard resultBoard;
    
    public TestResult(String testName) {
    	this.testName = testName;
    }
    
    /**
     * @param methodName test's method name
     * @param testPassed indicates if the test ran OK
     */
    public TestResult(String methodName, boolean testPassed) {
        this.methodName = methodName;
        this.testPassed = testPassed;
        resultBoard = new ResultBoard();
    }

    public void informResult() {
        resultBoard.ShowResult(methodName, testPassed);
    }
    
    public String print() {
    	return "";
    }
}
