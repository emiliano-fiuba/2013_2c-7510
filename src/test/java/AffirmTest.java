package test.java;

import static org.junit.Assert.*;
import main.java.Affirm;

import org.junit.Test;

public class AffirmTest {

	@Test
	public void equalsObjectTest() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "ByeBye";
		
		assertEquals(true, Affirm.checkEquals(str1, str2));
		assertEquals(false, Affirm.checkEquals(str1, str3));
	}

	@Test
	public void notEqualsObjectTest() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "ByeBye";
				
		assertEquals(true, Affirm.checkNotEquals(str1, str3));
		assertEquals(false, Affirm.checkNotEquals(str1, str2));
	}
	
	@Test
	public void notEqualsIntTest() {
		assertEquals(true, Affirm.checkNotEquals(1, 2));
		assertEquals(false, Affirm.checkNotEquals(1, 1));
	}

	@Test
	public void equalsIntTest() {
		assertEquals(true, Affirm.checkEquals(1, 1));
		assertEquals(false, Affirm.checkEquals(1, 2));		
	}

	@Test
	public void equalsBooleanTest() {
		assertEquals(true, Affirm.checkEquals(true, true));
		assertEquals(false, Affirm.checkEquals(true, false));
	}

	@Test
	public void notEqualsBooleanTest() {
		assertEquals(true, Affirm.checkNotEquals(true, false));
		assertEquals(false, Affirm.checkNotEquals(true, true));
	}

	@Test
	public void equalsCharTest() {
		assertEquals(true, Affirm.checkEquals('a', 'a'));
		assertEquals(false, Affirm.checkEquals('a', 'b'));
	}

	@Test
	public void notEqualsCharTest() {
		assertEquals(true, Affirm.checkNotEquals('a', 'b'));
		assertEquals(false, Affirm.checkNotEquals('a', 'a'));
	}
	
	@Test
	public void equalsFloatTest() {
		assertEquals(true, Affirm.checkEquals(1.1, 1.1));
		assertEquals(false, Affirm.checkEquals(1.1, 1.2));
	}

	@Test
	public void notEqualsFloatTest() {
		assertEquals(true, Affirm.checkNotEquals(1.1, 1.2));
		assertEquals(false, Affirm.checkNotEquals(1.1, 1.1));
	}	
}
