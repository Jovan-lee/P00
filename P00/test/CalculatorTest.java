import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a=1234;
		int b=8765;
		
		Calculator cal =new Calculator();
		int actual= cal.add(a, b);
		
		int expected=9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testAddZero() {
		//fail("Not yet implemented");
		int c=1235;
		int d=0000;
		
		Calculator cal =new Calculator();
		int act= cal.add(c, d);
		
		int expected=1235;
		assertEquals(expected,act);
	}
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		int a=9876;
		int b=4321;
		
		Calculator cal =new Calculator();
		int actual= cal.add(a, b);
		
		int expected=5555;
		assertEquals(actual,expected);
	}
	@Test
	public final void testMultiple() {
		//fail("Not yet implemented");
		int a=11;
		int b=7;
		
		Calculator cal =new Calculator();
		int actual= cal.multiple(a, b);
		
		int expected=77;
		assertEquals(actual,expected);
	}
	@Test
	public final void testdivide() {
		//fail("Not yet implemented");
		int a=88;
		int b=4;
		
		Calculator cal =new Calculator();
		int actual= cal.divide(a, b);
		
		int expected=22;
		assertEquals(actual,expected);
	}
	
	

}
