package net.alepuzio.provesintassi.lambda;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSevenMinutesLambda {

	private SevenMinutesLambda instance ;
	
	
	@BeforeClass
	public static void setUpTests(){
		System.out.println("Pronta l'infrastruttura di test");
	}
	
	@Before
	public void setUp(){
		this.instance = new SevenMinutesLambda();
		System.out.println("Pronta l'istanza da testare");
	}
	
	@Test
	public void testVisualization() {
		List result = this.instance.visualization();
		List expected =  Arrays.asList("Lambda ", "expressions ", "are ", "cool");
		assertEquals(expected, result);
	}

}
