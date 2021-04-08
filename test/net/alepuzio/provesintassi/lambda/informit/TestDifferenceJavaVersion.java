package net.alepuzio.provesintassi.lambda.informit;

import static org.junit.Assert.*;

import java.util.logging.Level;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.istack.internal.logging.Logger;

public class TestDifferenceJavaVersion {

	private Logger logger = Logger.getLogger(this.getClass());

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {	}

	@Before
	public void setUp() throws Exception {
		logger.setLevel(Level.FINEST);
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

}
