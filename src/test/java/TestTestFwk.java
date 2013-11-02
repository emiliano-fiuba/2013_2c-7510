package test.java;

import main.java.Test;

/**
 * This class tests Test class using unitTestFWK-1.0-SNAPSHOT.jar file
 * 
 * @author Miguenz, Rodriguez, Suárez
 *
 */
public class TestTestFwk extends Test {

	public TestTestFwk(String newName) {
		super(newName);
	}
	
    public void run() {
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

    public void equalsObjectTest() {
        assertEquals("equalsObjectTest", "Hello", "Hello");
    }

    public void notEqualsObjectTest() {
        assertNotEquals("notEqualsObjectTest", "Hello", "ByeBye");
    }
    
    public void notEqualsIntTest() {
        assertNotEquals("notEqualsIntTest", 1, 2);
    }

    public void equalsIntTest() {
        assertEquals("equalsIntTest", 1, 1);
    }

    public void equalsBooleanTest() {
        assertEquals("equalsBooleanTest", true, true);
    }

    public void notEqualsBooleanTest() {
        assertNotEquals("notEqualsBooleanTest", true, false);
    }

    public void equalsCharTest() {
        assertEquals("equalsCharTest", 'a', 'a');
    }

    public void notEqualsCharTest() {
        assertNotEquals("notEqualsCharTest", 'a', 'b');
    }
    
    public void equalsFloatTest() {
        assertEquals("equalsFloatTest", 1.1, 1.1);
    }

    public void notEqualsFloatTest() {
        assertNotEquals("notEqualsFloatTest", 1.1, 1.2);
    }
}
