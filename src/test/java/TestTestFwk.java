package test.java;

import main.java.Test;

public class TestTestFwk extends Test {

    public static void main(String[] args) throws Exception {
		run();
	}

	public static void run() {
		equalsObjectTest();
		notEqualsObjectTest();
		notEqualsIntTest();
		equalsIntTest();
		equalsBooleanTest();
		notEqualsBooleanTest();
		equalsCharTest();
		notEqualsCharTest();
		equalsFloatTest();
		notEqualsFloatTest();
	}

	public static void equalsObjectTest() {
		assertEquals("equalsObjectTest", "Hello", "Hello");
	}

	public static void notEqualsObjectTest() {
		assertNotEquals("notEqualsObjectTest", "Hello", "ByeBye");
	}
	
	public static void notEqualsIntTest() {
		assertNotEquals("notEqualsIntTest", 1, 2);
	}

	public static void equalsIntTest() {
		assertEquals("equalsIntTest", 1, 1);
	}

	public static void equalsBooleanTest() {
		assertEquals("equalsBooleanTest", true, true);
	}

	public static void notEqualsBooleanTest() {
		assertNotEquals("notEqualsBooleanTest", true, false);
	}

	public static void equalsCharTest() {
		assertEquals("equalsCharTest", 'a', 'a');
	}

	public static void notEqualsCharTest() {
		assertNotEquals("notEqualsCharTest", 'a', 'b');
	}
	
	public static void equalsFloatTest() {
		assertEquals("equalsFloatTest", 1.1, 1.1);
	}

	public static void notEqualsFloatTest() {
		assertNotEquals("notEqualsFloatTest", 1.1, 1.2);
	}
}