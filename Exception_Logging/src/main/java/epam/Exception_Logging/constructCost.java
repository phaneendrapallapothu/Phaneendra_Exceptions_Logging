package epam.Exception_Logging;

import org.apache.logging.log4j.LogManager;

public class constructCost {
	private static final org.apache.logging.log4j.Logger LOGGER1 =LogManager.getLogger(constructCost.class);
	double calculateCost(int standard,double areaOfHouse,boolean automated)
	{
		double cost=0;
		if(standard==1)
		{
			cost+=(1200*areaOfHouse);
			LOGGER1.info(cost);
			LOGGER1.error("Error Occurred");
			LOGGER1.warn("Wrong Code");
			LOGGER1.fatal("Case Abort");
		}
		else if(standard==2)
		{
			cost+=(1500*areaOfHouse);
			LOGGER1.info(cost);
			LOGGER1.error("Error Occurred");
			LOGGER1.warn("Wrong Code");
			LOGGER1.fatal("Case Abort");
		}
		else if(standard==3 && !automated)
		{
			cost+=(1800*areaOfHouse);
			LOGGER1.info(cost);
			LOGGER1.error("Error Occurred");
			LOGGER1.warn("Wrong Code");
			LOGGER1.fatal("Case Abort");
		}
		else if(standard==3 && automated)
		{
			cost+=(2500*areaOfHouse);
			LOGGER1.info(cost);
			LOGGER1.error("Error Occurred");
			LOGGER1.warn("Wrong Code");
			LOGGER1.fatal("Case Abort");
		}		
		return(cost);	
	}
}
