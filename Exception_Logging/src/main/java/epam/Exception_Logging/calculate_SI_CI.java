package epam.Exception_Logging;

import org.apache.logging.log4j.LogManager;

public class calculate_SI_CI {
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(calculate_SI_CI.class);
	public double simpleIntrest(double principle,double time,double annualRate)
	{
		double amount=(double)((principle*time*annualRate)/100);
		LOGGER.info(amount+principle);
		LOGGER.error("Error Occurred");
		LOGGER.warn("Wrong Code");
		LOGGER.fatal("Case Abort");
		return amount+principle;
	}
	public double compoundIntrest(double principle,double time,double annualRate)
	{
		double amount=(double)(principle*(Math.pow((1+(annualRate/100)), time)));
		amount=amount-principle;
		LOGGER.info(amount);
		LOGGER.error("Error Occurred");
		LOGGER.warn("Wrong Code");
		LOGGER.fatal("Case Abort");
		return amount;
	}
}
