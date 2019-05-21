package jpu2016.hit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HitTest { 
		 private Hit hit;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before 
	public void setUp() throws Exception { 
	this.hit = new Hit(1, 10, TypeHit.NORMAL); 
	 }
	
	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void testGetStrength() { 
	final int expected = 1; 
	assertEquals(expected, this.hit.getStrength()); 
	 }

	@Test
	public void testGetRange() {
		final int expected = 10;
		assertEquals(expected, this.hit.getRange());
	}

	@Test
	public void testGetTypeHit() {
		final TypeHit expected = TypeHit.NORMAL;
		assertEquals(expected, this.hit.getTypeHit());
	}
	
	@Test
	public void testStrengthMinRange() {
		boolean expected = false;
		if((this.hit.getStrength() >= 0) ) {
			expected = true;
		}
		else {
			expected = false;
		}
		assertTrue(expected);
	}
	
	@Test
	public void testStrengthMaxRange() {
		boolean expected = false;
		if((this.hit.getStrength() <= 100)) {
			expected = true;
		}
		else {
			expected = false;
		}
		assertTrue(expected);
	}
	
	@Test 
	public void testRangeMinRange() {
		boolean expected = false;
		if((this.hit.getRange() >= 0) ) {
			expected = true;
		}
		else {
			expected = false;
		}
		assertTrue(expected);
	}
	
	@Test 
	public void testRangeMaxRange() {
		boolean expected = false;
		if((this.hit.getStrength() <= 10)) {
			expected = true;
		}
		else {
			expected = false;
		}
		assertTrue(expected);
	}

	@Test 
	 public void excepStrengthMinRange() { 
	  try { 
	   new Hit(0, 1, TypeHit.NORMAL); 
	  } catch (final Exception e) { 
	   final String expected = "Strength out of range"; 
	   assertEquals(expected, e.getMessage()); 
	  }
	  
	}
	
}

