package PoemAnalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class formatTest {

	@Test
	public void test() {
		PoemAnalyzer test = new PoemAnalyzer();
		String outputString = test.format("hello, tHIs? is! a format— .test;");
		assertEquals("hello this is a format test",outputString);
	}

}
