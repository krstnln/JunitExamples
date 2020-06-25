package PoemAnalyzer;

import static org.junit.Assert.*;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;

public class calculateTest {

	@Test
	public void test() {
		PoemAnalyzer test = new PoemAnalyzer();

		ArrayList<Map.Entry<String, Integer>> testArray = new ArrayList<>();
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("one", 1));
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("twelve", 12));
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("seven", 7));
		testArray.add(new AbstractMap.SimpleEntry<String, Integer>("twenty", 20));


		ArrayList<Map.Entry<String, Integer>> compArray = new ArrayList<>();
		compArray.add(new AbstractMap.SimpleEntry<String, Integer>("twenty", 20));
		compArray.add(new AbstractMap.SimpleEntry<String, Integer>("twelve", 12));
		compArray.add(new AbstractMap.SimpleEntry<String, Integer>("seven", 7));
		compArray.add(new AbstractMap.SimpleEntry<String, Integer>("one", 1));

		ArrayList<Map.Entry<String, Integer>> outputArray = new ArrayList<>();
		outputArray = test.calculate(testArray);


		assertEquals(compArray, outputArray);

	}

}
