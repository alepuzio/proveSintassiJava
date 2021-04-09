package net.alepuzio.provesintassi.stream.step;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStream {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testFilter(){
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		List<String> res = words.stream().filter( item -> item.startsWith("o") ).collect(Collectors.toList());
		List<String> expected = new ArrayList<>();
		expected.add("one");
		assertEquals(res, expected);
	}
	
	@Test
	public void testMap(){
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		List<String> res = words.stream().map( item -> item.toUpperCase() ).collect(Collectors.toList());
		List<String> expected = new ArrayList<>();
		expected.add("ONE");
		expected.add("TWO");
		expected.add("THREE");
		assertEquals(res, expected);
	}
	
	@Test
	public void testCollectMap() {
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		Map<String, String> res = words.stream()
				.map( item -> item.toUpperCase() )
				.collect(Collectors.toMap(String::toLowerCase, String::toUpperCase));
		Map<String, String>  expected = new HashMap<String, String> ();
		expected.put("one","ONE");
		expected.put("two", "TWO");
		expected.put("three", "THREE");
		assertEquals(res, expected);
	}
	@Test
	public void testMin() {
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("nine");
		words.add("three");
		String res = words.stream()
				.min(Comparator.comparing(item -> item.length() ))
				.get()
				;
		String  expected = "one";
		assertEquals(res, expected);
	}
	
	@Test
	public void testMax() {
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("nine");
		words.add("three");
		String res = words.stream()
				.max(Comparator.comparing(item -> item.length() ))
				.get()
				;
		String  expected = "three";
		assertEquals(res, expected);
	}
	
	@Test
	public void testCount() {
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("nine");
		words.add("three");
		long res = words.stream().filter( item -> item.contains("n") ).count();
		long expected = 2;
		assertEquals(res, expected);
	}
	
	@Test
	public void testReduce() {
		List<String> words = new ArrayList<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		words.add("four");
		words.add("five");
		words.add("six");
		words.add("seven");
		words.add("eigth");
		words.add("ten");
		String res = words.stream()
				.filter( item -> item.contains("e") )
				.reduce( (acc, item) -> acc + item )
				.get();
		String expected = "onethreefiveseveneigthten";
		assertEquals(res, expected);
	}

}
