package main.java;

public class Affirm {

	public static boolean checkEquals(Object a, Object b) {		
		return a.equals(b);
	}

	public static boolean checkNotEquals(Object a, Object b) {
		return !a.equals(b);
	}
	
	public static boolean checkNotEquals(int a, int b) {
		return a != b;
	}

	public static boolean checkEquals(int a, int b) {
		return a == b;
	}

	public static boolean checkEquals(boolean a, boolean b) {
		return a == b;
	}

	public static boolean checkNotEquals(boolean a, boolean b) {
		return a != b;
	}

	public static boolean checkEquals(char a, char b) {
		return a == b;
	}

	public static boolean checkNotEquals(char a, char b) {
		return a != b;
	}
	
	public static boolean checkEquals(float a, float b) {
		return a == b;
	}

	public static boolean checkNotEquals(float a, float b) {
		return a != b;
	}	
}
