package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestDifferenceJavaVersion {

	private Logger logger = Logger.getLogger(this.getClass());

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {	}

	@Before
	public void setUp() throws Exception {
		logger.setLevel(Level.DEBUG);
	}

	@After
	public void tearDown() throws Exception { }

	/**
	 * What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note that each type is its own supertype. 
	 * A class or interface without declared supertype has supertype Object.
	 * */
	@Test
	public void testThird() {
		logger.info("Required no code");
		assertTrue(true);
	}
	/**
	 * In this exercise, you will try out what happens when a method is added to an interface. 
	 * In Java 7, implement a class DigitSequence that implements Iterator<Integer>, not IntSequence. 
	 * Provide methods hasNext, next, and a do-nothing remove.
	 * Write a program that prints the elements of an instance. 
	 * In Java 8, the Iterator class gained another method, forEachRemaining.
	 *  Does your code still compile when you switch to Java 8? 
	 *  If you put your Java 7 class in a JAR file and don’t recompile, does it work in Java 8? 
	 *  What if you call the forEachRemaining method? 
	 *  Also, the remove method has become a default method in Java 8, throwing an UnsupportedOperationException. 
	 * What happens when remove is called on an instance of your class?
	 * */
	@Test
	public void testSix(){
		logger.warn("Secondary: difference between Java 7 and 8");
		assertTrue(true);
	}

}
