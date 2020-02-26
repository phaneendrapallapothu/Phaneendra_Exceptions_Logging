package epam.Exception_Logging;
import org.junit.*;

import junit.framework.TestCase;
public class calculate_SI_CITest extends TestCase {
	
	calculate_SI_CI calculate=new calculate_SI_CI();
	@Test
	public void testSimpleIntrest(){
		assertEquals(100.0, calculate.simpleIntrest(100, 1, 0));
		assertEquals(1060.0,calculate.simpleIntrest(1000.0,3.0,2.0),0);
	}

	public void testCompoundIntrest() {
		assertEquals(24.0, calculate.compoundIntrest(1200, 1, 2));
	}

}
