package main.java;

/**
 * This class shows the test case's result.
 * 
 * @author Miguenz, Rodriguez, Suárez
 *
 */
public class ResultBoard {
    
    /**
     * @param methodName test's method name
     * @param testPassed indicates if the test ran OK
     */
    public void ShowResult(String methodName, boolean testPassed) {
        if (testPassed) {
            ShowResultOK(methodName);
        }
        else {
            ShowResultFail(methodName);
        }
    }
    
    public void ShowResultOK(String methodName) {
        System.out.println(methodName + ": OK");
    }
    
    public void ShowResultFail(String methodName) {
        System.err.println(methodName + ": FAIL");
    }
}
