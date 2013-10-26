package unitTest;

public class TestResult {
	private static final String RED = "red";
	private static final String GREEN = "green";
	
	private String methodName;
	private String color;
	
	public TestResult(String methodName, boolean result){
		this.methodName = methodName;
		
		if (result == true){
			color = GREEN;
		}
		else {
			color = RED;
		}
	}
	
	public void informResult(){
		System.out.println(methodName + ": " + color);
	}

}
