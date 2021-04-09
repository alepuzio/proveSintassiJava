package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author apuzielli, from https://www.informit.com/articles/article.aspx?p=2303960&seqNum=10
 */
public class TestThread {
	/**
	 * Implement a class Greeter that implements Runnable and whose run method prints n copies of "Hello, " + target, where n and target are set in the constructor. Construct two instances with different messages and execute them concurrently in two threads.
	 * */
	@Test
	public void testEighth(){
		logger.warn("Secondary: thread");
		assertTrue(true);
	}	
	/**
	 * Implement methods
	 * public static void runTogether(Runnable... tasks)
	 * public static void runInOrder(Runnable... tasks)
	 * The first method should run each task in a separate thread and then return. 
	 * The second method should run all methods in the current thread and return when the last one has completed.
	 * */
	@Test
	public void testNinth(){
		logger.warn("Secondary: thread");
		assertTrue(true);
	}
	/**
	 * Write a method that takes an array of Runnable instances 
	 * and returns a Runnable whose run method executes them in order. 
	 * Return a lambda expression
	 * */
	@Test
	public void testThirteen(){
		logger.warn("Secondary: thread");
		assertTrue(true);
	}
	private Logger logger = Logger.getLogger(this.getClass());

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    PropertyConfigurator.configure(".\\log4j.properties");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {	}

	@Before
	public void setUp() throws Exception {
		logger.setLevel(Level.DEBUG);
	}

	@After
	public void tearDown() throws Exception { }


}
