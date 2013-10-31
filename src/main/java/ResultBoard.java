package main.java;

public class ResultBoard {
	
	public void ShowResult(String methodName, boolean testPassed) {
		
		if (testPassed)
			System.out.println(methodName + ": OK");
		else {
			System.err.println(methodName + ": FAIL");
		}
		
	}

}
