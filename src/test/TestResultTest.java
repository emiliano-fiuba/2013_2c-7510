package test;

import org.junit.Test;
import unitTest.TestResult;

public class TestResultTest {

	@Test
	public void testInitAndInformBadResult() {
		TestResult tr = new TestResult("Metodo", false);
		tr.informResult();
	}

	@Test
	public void testInitAndInformGoodResult() {
		TestResult tr = new TestResult("Metodo", true);
		tr.informResult();
	}
	
}
