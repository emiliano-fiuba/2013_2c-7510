package test;

import static org.junit.Assert.*;
import org.junit.Test;
import unitTest.Affirm;

public class AffirmTest {

	@Test
	public void equalsObjectTest() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "ByeBye";
		
		assertEquals(true, Affirm.equals(str1, str2));
		assertEquals(false, Affirm.equals(str1, str3));
	}

	@Test
	public void notEqualsObjectTest() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "ByeBye";
				
		assertEquals(true, Affirm.notEquals(str1, str3));
		assertEquals(false, Affirm.notEquals(str1, str2));
	}
	
	@Test
	public void notEqualsIntTest() {
		assertEquals(true, Affirm.notEquals(1, 2));
		assertEquals(false, Affirm.notEquals(1, 1));
	}

	@Test
	public void equalsIntTest() {
		assertEquals(true, Affirm.equals(1, 1));
		assertEquals(false, Affirm.equals(1, 2));		
	}

	@Test
	public void equalsBooleanTest() {
		assertEquals(true, Affirm.equals(true, true));
		assertEquals(false, Affirm.equals(true, false));
	}

	@Test
	public void notEqualsBooleanTest() {
		assertEquals(true, Affirm.notEquals(true, false));
		assertEquals(false, Affirm.notEquals(true, true));
	}

	@Test
	public void equalsCharTest() {
		assertEquals(true, Affirm.equals('a', 'a'));
		assertEquals(false, Affirm.equals('a', 'b'));
	}

	@Test
	public void notEqualsCharTest() {
		assertEquals(true, Affirm.notEquals('a', 'b'));
		assertEquals(false, Affirm.notEquals('a', 'a'));
	}
	
	@Test
	public void equalsFloatTest() {
		assertEquals(true, Affirm.equals(1.1, 1.1));
		assertEquals(false, Affirm.equals(1.1, 1.2));
	}

	@Test
	public void notEqualsFloatTest() {
		assertEquals(true, Affirm.notEquals(1.1, 1.2));
		assertEquals(false, Affirm.notEquals(1.1, 1.1));
	}	
}
