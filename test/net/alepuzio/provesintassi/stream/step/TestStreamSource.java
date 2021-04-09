package net.alepuzio.provesintassi.stream.step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestStreamSource {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}

	@Test
	public void testExampleIntegerNumericStream() {
		IntStream intStream = new StreamSource().exampleIntegerNumericStream(1,4);
		OptionalDouble result = intStream.average();
		OptionalDouble expected = OptionalDouble.of(2.0d);
		assertEquals(expected.getAsDouble(), result.getAsDouble(),0.1d);
	}

	@Test
	public void testExampleIntegerNumericStreamExtrems() {
		IntStream intStream = new StreamSource().exampleIntegerNumericStreamExtrems(1,3);
		OptionalDouble result = intStream.average();
		OptionalDouble expected = OptionalDouble.of(2.0d);
		assertEquals(expected.getAsDouble(), result.getAsDouble(),0.1d);
	}

	@Test
	public void testExampleIntSummaryStatistics() {
		IntSummaryStatistics intSummaryStatisticStream = new StreamSource().exampleIntSummaryStatistics(1, 3);
		double result =  intSummaryStatisticStream.getAverage();
		double expected = 2.0d;
		assertEquals(expected, result,0.1d);
	}

	@Test
	@Ignore("it's random")
	public void testExampleDoubleNumericStream() {
	}

	@Test
	@Ignore
	public void testExamplePathStream() {
		
	}

}
