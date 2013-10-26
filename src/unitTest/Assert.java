package unitTest;

public class Assert {

	public static boolean equals(String a, String b) {
		return a.equals(b);
	}

	public static boolean notEquals(String a, String b) {
		return !a.equals(b);
	}

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
}
