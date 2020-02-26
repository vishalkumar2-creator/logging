package com.epam.clean_code.SimpleIntereset_CompoundInterest.interests;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
public class Interests {
	 private double principalAmount,rateOfInterest,timePeriod,CIamount;
	 //private static final Logger LOGGER=LogManager.getLogger(Interests.class);
	    public Interests(double principalAmount, double rateOfInterest, double timePeriod)
	    {
	        this.principalAmount = principalAmount;
	        this.rateOfInterest = rateOfInterest;
	        this.timePeriod = timePeriod;
	    }

	    public double SimpleInterest()
	    {
	    	//LOGGER.error("The Simple Interest is:\n");
	        return (principalAmount*rateOfInterest*timePeriod)/100;
	    }

	    public double CompoundInterest()
	    {
	        this.CIamount = principalAmount*(Math.pow(1+(rateOfInterest/100),timePeriod));
	        //LOGGER.error("The Compound Interest is:"+(CIamount-principalAmount) +"\n");
	        return this.CIamount-principalAmount;
	    }
}
