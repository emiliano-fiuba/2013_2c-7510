package test.java;

import main.java.Affirm;
import main.java.Test;

public class AffirmTestFwk extends Test {

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
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "ByeBye";
		
		assertEquals("equalsObjectTest", true, Affirm.checkEquals(str1, str2));
		assertEquals("equalsObjectTest", false, Affirm.checkEquals(str1, str3));
	}
	
	public static void notEqualsObjectTest() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "ByeBye";
				
		assertEquals("notEqualsObjectTest", true, Affirm.checkNotEquals(str1, str3));
		assertEquals("notEqualsObjectTest", false, Affirm.checkNotEquals(str1, str2));
	}
		
	public static void notEqualsIntTest() {
		assertEquals("notEqualsIntTest", true, Affirm.checkNotEquals(1, 2));
		assertEquals("notEqualsIntTest", false, Affirm.checkNotEquals(1, 1));
	}
	
	public static void equalsIntTest() {
		assertEquals("equalsIntTest", true, Affirm.checkEquals(1, 1));
		assertEquals("equalsIntTest" ,false, Affirm.checkEquals(1, 2));		
	}
	
	public static void equalsBooleanTest() {
		assertEquals("equalsBooleanTest", true, Affirm.checkEquals(true, true));
		assertEquals("equalsBooleanTest", false, Affirm.checkEquals(true, false));
	}
	
	public static void notEqualsBooleanTest() {
		assertEquals("notEqualsBooleanTest", true, Affirm.checkNotEquals(true, false));
		assertEquals("notEqualsBooleanTest", false, Affirm.checkNotEquals(true, true));
	}
	
	public static void equalsCharTest() {
		assertEquals("equalsCharTest", true, Affirm.checkEquals('a', 'a'));
		assertEquals("equalsCharTest", false, Affirm.checkEquals('a', 'b'));
	}

	public static void notEqualsCharTest() {
		assertEquals("notEqualsCharTest", true, Affirm.checkNotEquals('a', 'b'));
		assertEquals("notEqualsCharTest", false, Affirm.checkNotEquals('a', 'a'));
	}
	
	public static void equalsFloatTest() {
		assertEquals("equalsFloatTest", true, Affirm.checkEquals(1.1, 1.1));
		assertEquals("equalsFloatTest", false, Affirm.checkEquals(1.1, 1.2));
	}

	public static void notEqualsFloatTest() {
		assertEquals("notEqualsFloatTest", true, Affirm.checkNotEquals(1.1, 1.2));
		assertEquals("notEqualsFloatTest", false, Affirm.checkNotEquals(1.1, 1.1));
	}	
}
