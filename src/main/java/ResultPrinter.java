package main.java;

import java.util.ArrayList;

public class ResultPrinter {

	private String SEPARATOR = "­­­­­­­­­­­­­­­­­­­­­­­­----------------";
	private String DOUBLE_SEPARATOR = "================";
	private static ResultPrinter instance = null;
	private String suiteName;
	private ArrayList<String> buffer;
	
	private ResultPrinter() {
		suiteName = "";
	}
	
	public static ResultPrinter getInstance() {
		if (instance == null){
			instance = new ResultPrinter();
		}
		return instance;
	}

	public void addTestResults(Test test) {
		buffer.add(test.getResult().print());
	}
	
	public void addSuite(String suiteName) {
		this.suiteName += "." + suiteName;
		buffer.add(this.suiteName);
		buffer.add(SEPARATOR);
	}
	
	public void removeSuite(String suiteName) {
		this.suiteName.substring(0, this.suiteName.lastIndexOf("."));
	}
	
	public void print() { 
		//calcular totales antes de imprimir
		for (String s: buffer) {
			System.out.println(s);
		}
	}
}
