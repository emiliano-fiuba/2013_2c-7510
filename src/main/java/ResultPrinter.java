package main.java;

public class ResultPrinter {
	private static ResultPrinter instance = null;
	
	private ResultPrinter() {

	}
	
	public static ResultPrinter getInstance() {
		if (instance == null){
			instance = new ResultPrinter();
		}
		return instance;
	}

}
