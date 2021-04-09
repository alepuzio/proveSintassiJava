package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFileSystem {
	
	private static Logger logger = Logger.getLogger(net.alepuzio.provesintassi.lambda.informit.TestFileSystem.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        PropertyConfigurator.configure("log4j.properties");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Using the listFiles(FileFilter) and isDirectory methods of the
	 * java.io.File class, write a method that returns all subdirectories of a
	 * given directory. Use a lambda expression instead of a FileFilter object.
	 * Repeat with a method expression and an anonymous inner class.
	 */
	@Test
	public void testTenth() {
		VerifySubDir verifySubDir = new VerifySubDir(new File(".\\documentation\\"));
		File[] expected = verifySubDir.oldMode();
		File[] actual = verifySubDir.newMode();
		for (int i = 0; i < expected.length; i++) {
			logger.info(String.format("count [%s] ..", expected[i].getName()));
			assertEquals(expected[i], actual[i]);
		}
	}

	/**
	 * Using the list(FilenameFilter) method of the java.io.File class, write a
	 * method that returns all files in a given directory with a given
	 * extension. Use a lambda expression, not a FilenameFilter. Which variable
	 * from the enclosing scope does it capture?
	 */
	@Test
	public void testEleventh() {
		VerifyFiles verifySubDir = new VerifyFiles(new File(".\\documentation\\"));
		final File[] expected = verifySubDir.oldMode();
		final File[] actual = verifySubDir.newMode();
		for (int i = 0; i < expected.length; i++) {
			logger.info(String.format("count [%s] ..", expected[i].getName()));
			assertEquals(expected[i], actual[i]);
		}
	}

	/**
	 * Given an array of File objects, sort it so that directories come before
	 * files, and within each group, elements are sorted by path name. Use a
	 * lambda expression to specify the Comparator.
	 */
	@Test
	public void testTwelfth() {
		final File[] arrayFiles = { new File(".\\src\\net\\alepuzio\\provesintassi\\lambda\\informit\\VerifySubDir.java"),
				new File(".\\src\\net\\alepuzio\\provesintassi\\lambda\\method\\MainConstructorReference.java"),
				new File(".\\src\\net\\alepuzio\\provesintassi\\lambda\\informit\\Measurables.java") };

		final File[] expected = { arrayFiles[2], arrayFiles[0], arrayFiles[1] };
		logger.info(new File(".\\").getAbsolutePath());
		final File[] actual = new SortFiles(arrayFiles).files();
		for (int i = 0; i < expected.length; i++) {
			logger.info(String.format("%s == %s", expected[i], actual[i]));
			assertEquals(expected[i], actual[i]);
		}
	}

}
