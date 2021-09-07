import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class FixturesExample {
	protected int value1, value2;
	
	@Before
	public void setUp() throws Exception {
		value1 = 3;
		value2 = 3;
	}

	@Test
	public void test() {
		double result = value1 + value2;
		assertTrue(result == 6);
		
	}

}
