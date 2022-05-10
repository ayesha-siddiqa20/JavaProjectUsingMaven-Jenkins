package maven.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class test_calculator {
	
	Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {	
		assertEquals(20, calculator.add(10, 10));
	}
	
	
	@Test
	public void testAdd2() {	
		assertEquals(25, calculator.add(10, 10, 5));
	}
	
	
	@Test
	public void testSub() {	
		assertEquals(1, calculator.subtract(3, 2));
	}
	
	
	@Test
	public void testSub2() {	
		assertEquals(0, calculator.subtract(3, 2, 1));
	}
	

}
