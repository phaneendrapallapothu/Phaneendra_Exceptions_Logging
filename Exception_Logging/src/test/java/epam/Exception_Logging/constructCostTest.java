package epam.Exception_Logging;

import static org.junit.Assert.*;

import org.junit.Test;

public class constructCostTest {

	constructCost cost=new constructCost();
	@Test
	public void testCalculateCost() {
		assertEquals(2178000.0,cost.calculateCost(3, 871.2, true),0);
		assertEquals(150000.0,cost.calculateCost(1, 125, false),0);
		assertEquals(250000.0,cost.calculateCost(3, 100, true),0);
	}
}
