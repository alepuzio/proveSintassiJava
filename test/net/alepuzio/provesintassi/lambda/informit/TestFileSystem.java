package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestFileSystem {
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
	 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
	 *  write a method that returns all subdirectories of a given directory. 
	 *  Use a lambda expression instead of a FileFilter object. 
	 *  Repeat with a method expression and an anonymous inner class.
	 * */
	@Test
	public void testTenth(){
		VerifySubDir verifySubDir = new VerifySubDir( new File(".\\documentation\\") );
		File[] expected = verifySubDir.oldMode();
		File[] actual = verifySubDir.newMode();
		for ( int i = 0 ; i < expected.length; i++){
			logger.info(String.format("count [%s] ..", expected[i].getName()));
			assertEquals(expected[i], actual[i]);
		}
	}	
	
	/**
	 * Using the list(FilenameFilter) method of the java.io.File class, 
	 * write a method that returns all files in a given directory with a given extension. 
	 * Use a lambda expression, not a FilenameFilter. Which variable from the enclosing scope does it capture?
	 * */
	@Test
	public void testEleventh(){
		VerifyFiles verifySubDir = new VerifyFiles(new File(".\\documentation\\"));
		final File[] expected = verifySubDir.oldMode();
		final File[] actual = verifySubDir.newMode();
		for ( int i = 0 ; i < expected.length; i++){
			logger.info(String.format("count [%s] ..", expected[i].getName()));
			assertEquals(expected[i], actual[i]);
		}
	}
	
}

