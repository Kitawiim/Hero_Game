package jpu2016.craft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpu2016.hero.Human;
import jpu2016.hit.Hit;
import jpu2016.hit.TypeHit;

public class WizardTest extends CraftTest{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.craft = new Wizard(new Human());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	 @Override 
	 @Test 
	 public void testGetHit() { 
	  super.testGetHit(); 
	  final int ExpectedStrength = 3; 
	  final int ExpectedRange = 5; 
	  final TypeHit ExpectedTypeHit = TypeHit.MAGIC; 
	  final Hit hit = this.craft.getHit(); 
	  assertEquals(ExpectedStrength, hit.getStrength()); 
	  assertEquals(ExpectedRange, hit.getRange()); 
	  assertEquals(ExpectedTypeHit, hit.getTypeHit()); 
	 } 
}
