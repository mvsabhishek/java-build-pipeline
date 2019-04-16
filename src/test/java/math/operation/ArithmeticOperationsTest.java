package math.operation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

	@Test
	public void testAdd()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testMultiply() 
	{
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual1 = operations.multiply(2, 6);
		Integer expected1 = 12;
		assertEquals(expected1, actual1);	
		actual1 = operations.multiply(0,1);
		expected1 = 0;
		assertEquals(expected1, actual1);
	}

}