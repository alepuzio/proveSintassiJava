/**
 * 
 */
package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


/**
 * @author apuzielli, from https://www.informit.com/articles/article.aspx?p=2303960&seqNum=10
 */
public class TestInformitExercise {

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
	 * Write a call to Arrays.sort that sorts employees by salary, breaking ties by name.
	 *  Use Comparator.thenComparing. Then do this in reverse order.
	 * */
	@Test
	@Ignore (value = "error java.lang.NoSuchMethodError: net.alepuzio.provesintassi.lambda.informit.ListEmployee.sortBySalary()Ljava/util/List;\\n	at net.alepuzio.provesintassi.lambda.informit.TestInformitExercise.testFourtheen(TestInformitExercise.java:142)")
	public void testFourtheen(){
		Employee[] measures = {new Employee("John",4d), new Employee("Smith",6d), new Employee("Anthony",6d)};
		List<Employee> actualDescentingOrder = new DescentingSalary ( new ListEmployee(measures) ).execute();
		Employee[] finalListDescentingOrder = {new Employee("Anthony",6d), new Employee("Smith",6d), new Employee("John",4d)};
		List<Employee> expectedDescentingOrder = Arrays.asList(finalListDescentingOrder);
		assertEquals(expectedDescentingOrder, actualDescentingOrder);

		List<Employee> actualAscentingOrder = new AscendingSalary( new ListEmployee(measures) ).execute();
		Employee[] finalListAscentingOrder = {new Employee("John",4d), new Employee("Smith",6d),new Employee("Anthony",6d)};
		List<Employee> expectedAscentingOrder = Arrays.asList(finalListAscentingOrder);
		assertEquals(expectedAscentingOrder, actualAscentingOrder);

	}
}
