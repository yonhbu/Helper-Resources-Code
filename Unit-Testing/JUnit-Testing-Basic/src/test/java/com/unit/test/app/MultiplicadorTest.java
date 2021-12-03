package com.unit.test.app;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiplicadorTest {
	
	private Multiplicador multi;
	
	
	@Before
	public void init () {
		multi = new Multiplicador();
		System.out.println("First Instance the Class");
	}
	
	@Test
	public void multiplicarNum () {
		System.out.println("Them Complete the test multi for the same Number");
	    int result = multi.multiplicar(3);
		assertEquals(9, result);
		
	}
	
	@Test
	public void multiplicarXcero () {
		   System.out.println("Testing with Cero");
		   int result = multi.multiplicar(0);
			assertEquals(0, result);
	}
	
	
	@After
	public void closeOperation () {
		   System.out.println("Finish All the Test");
	}

  
}
