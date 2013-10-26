package unitTest;

public class Affirm {

	public static boolean equals(Object a, Object b) {		
		return a.equals(b);
	}

	public static boolean notEquals(Object a, Object b) {
		return !a.equals(b);
	}
	
	public static boolean notEquals(int a, int b) {
		return a != b;
	}

	public static boolean equals(int a, int b) {
		return a == b;
	}

	public static boolean equals(boolean a, boolean b) {
		return a == b;
	}

	public static boolean notEquals(boolean a, boolean b) {
		return a != b;
	}

	public static boolean equals(char a, char b) {
		return a == b;
	}

	public static boolean notEquals(char a, char b) {
		return a != b;
	}
	
	public static boolean equals(float a, char b) {
		return a == b;
	}

	public static boolean notEquals(float a, char b) {
		return a != b;
	}	
}
