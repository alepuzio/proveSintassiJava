/**
 * 
 */
package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.istack.internal.logging.Logger;

/**
 * @author apuzielli, from https://www.informit.com/articles/article.aspx?p=2303960&seqNum=10
 *
 */
public class TestInformitExercise {

	private Logger logger = Logger.getLogger(this.getClass());
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	/**
	 * Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
	 *  Make Employee implement Measurable. 
	 *  Provide a method double average(Measurable[] objects) that computes the average measure. 
	 *  Use it to compute the average salary of an array of employees.
	 * */
	
	public void testFirst() {
		Measurable[] measures = {new Employee("John",4d), new Employee("Smith",6d)};
		double actual = new ListMeasurable(measures).avg();
		final double expected = 5000.0d;
		assertEquals(expected, actual,0.01);				
	}

	/**
	 * Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects). 
	 * Use it to find the name of the employee with the largest salary. 
	 * Why do you need a cast?*/
	@Test
	public void testSecond() {
		Measurable[] measures = {new Employee("John",4d), new Employee("Smith",6d)};
		String actual = ((Employee) new ListMeasurable(measures).largest()).name();
		String expected = "Smith";
		assertEquals(expected, actual);
	}

	
	/**
	 * What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note that each type is its own supertype. 
	 * A class or interface without declared supertype has supertype Object.
	 * */
	@Test
	public void testThird() {
		logger.info("Required no code");
		assertTrue(true);
	}

}
