package unitTest;





public class TestResult {
	private static final String RED = "red";
	private static final String GREEN = "green";
	
	private String methodName;
	private boolean result;
	private String color;
	
	public TestResult(String methodName, boolean result){
		this.methodName = methodName;
		this.result = result;
		
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
