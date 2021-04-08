import static org.junit.Assert.*;

import org.junit.Test;


public class InsuranceTest 
{

	@Test
	public void test() 
	{
		Insurance TestCase1 = new Insurance(66, false, true);
		Insurance TestCase2 = new Insurance(66, false, false);
		Insurance TestCase3 = new Insurance(33, true, true);
		Insurance TestCase4 = new Insurance(33, true, false);
		Insurance TestCase5 = new Insurance(33, false, true);
		Insurance TestCase6 = new Insurance(33, false, false);

		assertEquals(270.00, TestCase1.Premium(), 0.00);
		assertEquals( 300.00, TestCase2.Premium(), 0.00);
		assertEquals(20.00, TestCase3.Premium(), 0.00);
		assertEquals(50.00, TestCase4.Premium(), 0.00);
		assertEquals(-30.00, TestCase5.Premium(), 0.00);
		assertEquals(0.00, TestCase6.Premium(), 0.00);

	}

}
