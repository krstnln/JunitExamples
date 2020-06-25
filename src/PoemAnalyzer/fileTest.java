package PoemAnalyzer;

import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

public class fileTest {

	@Test
	public void test() {
		
		
		PoemAnalyzer test = new PoemAnalyzer();
		ArrayList<Map.Entry<String, Integer>> testArray = new ArrayList<>();
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("one", 1));
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("two", 2));
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("three", 3));

		String testString = "C:\\Users\\Kristen\\Desktop\\test.txt";
		ArrayList<Map.Entry<String, Integer>> outputArray = new ArrayList<>();
		outputArray = test.openFile(testString);

		assertEquals(testArray, outputArray);
	}

}
