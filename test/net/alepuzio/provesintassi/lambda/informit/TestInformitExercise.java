/**
 * 
 */
package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

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
		logger.setLevel(Level.FINEST);
		
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

	/**
	 * Implement a static of method of the IntSequence class that yields a sequence with the arguments.
	 * For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values.
	 * Extra credit if you return an instance of an anonymous inner class.
	 * NB: I don't use static in my code, different
	 * */
	@Test
	public void testFourth() {
		int one = 3, two = 1, three = 4, four = 4, five = 5 , six = 9;
		List<Integer> actual = new IntSequence(one, two, three, four, five, six).list();
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(one);
		expected.add(two);
		expected.add(three);
		expected.add(four);
		expected.add(five);
		expected.add(six);
		assertEquals(expected,  actual);
	}

	/**
	 * Implement a static constant method of the IntSequence class that yields an infinite constant sequence. 
	 * For example, IntSequence.constant(1) yields values 1 1 1 . . . , ad infinitum.
	 *  Extra credit if you do this with a lambda expression.
	 *  N.B. I don't use static code
	 * */
	@Test
	public void testFive() {
		final int size = 101;
		List<Integer> actual = new IntSequence(size).infiniteList();
		List<Integer> expected = new ArrayList<Integer>();
		for(int i = 0; i < size; i++){
			expected.add(i);
		}
		assertEquals(expected,  actual);
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
		logger.warning("Secondary: difference between Java 7 and 8");
		assertTrue(true);
	}
	
	/**
	 * Implement the method 
	 * <i>void luckySort(ArrayList<String> strings, Comparator<String> comp)</i> 
	 * that keeps calling Collections.shuffle on the array list until the elements are in increasing order,
	 *  as determined by the comparator.
	 * */
	@Test
	public void testSeven(){
		final String[] expectedOrder = {"a", "b", "c", "d", "e", "f", "z"};
		String[] toModify = {expectedOrder[0], expectedOrder[1], expectedOrder[2], expectedOrder[3], expectedOrder[4], expectedOrder[5]};

		final List<String> input = Arrays.asList(toModify);
		Collections.shuffle(input);
		
		final List<String> actual = new StringSequence(input).luckySort( (a,b)-> a.compareTo(b)	 );
		assertEquals(expectedOrder[0],  actual.get(0));
		assertEquals(expectedOrder[1],  actual.get(1));
		assertEquals(expectedOrder[2],  actual.get(2));
		assertEquals(expectedOrder[3],  actual.get(3));
		assertEquals(expectedOrder[4],  actual.get(4));
		assertEquals(expectedOrder[5],  actual.get(5));		
	} 
	
	/**
	 * Implement a class Greeter that implements Runnable and whose run method prints n copies of "Hello, " + target, where n and target are set in the constructor. Construct two instances with different messages and execute them concurrently in two threads.
	 * */
	@Test
	public void testEighth(){
		logger.warning("Secondary: thread");
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
		logger.warning("Secondary: thread");
		assertTrue(true);
	}
	
	
	/**
	 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
	 *  write a method that returns all subdirectories of a given directory. 
	 *  Use a lambda expression instead of a FileFilter object. 
	 *  Repeat with a method expression and an anonymous inner class.
	 * */
	@Test
	public void testTenth(){
		File directory = new File(".\\documentation\\");
		VerifySubDir verifySubDir = new VerifySubDir(directory);
		File[] expected = verifySubDir.oldMode();
		File[] actual = verifySubDir.newMode();
		for ( int i = 0 ; i < expected.length; i++){
			logger.info(String.format("count [%s] ..", expected[i].getName()));
			assertEquals(expected[i], actual[i]);
		}
	}	
}


