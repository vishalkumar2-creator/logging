package com.epam.clean_code.SimpleIntereset_CompoundInterest;
import org.apache.logging.log4j.*;

import com.epam.clean_code.SimpleIntereset_CompoundInterest.HouseConstruction.ConstructionCost;
import com.epam.clean_code.SimpleIntereset_CompoundInterest.interests.Interests;

import java.util.*;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	LOGGER.info("Enter the ztype of material:\n");
	int material = sc.nextInt();
	LOGGER.info("Enter the area of the house:\n");
	double areaofhouse = sc.nextDouble();
	LOGGER.info("Is the house automated");
	boolean isAutomated = sc.nextBoolean();
	ConstructionCost cc= new ConstructionCost(material,areaofhouse,isAutomated);
	double principle = cc.Estimate();
	LOGGER.info("enter the rate of interest:\n");
	double rateofinterest = sc.nextDouble();
	LOGGER.info("Enter the time period:\n");
	double timeperiod = sc.nextDouble();
	Interests i = new Interests(principle,rateofinterest,timeperiod);
	double si = i.SimpleInterest();
	LOGGER.info("Simple interest is: "+si+"\n");
	double ci = i.CompoundInterest();
	LOGGER.info("Compound Inetrest is: " + ci + "\n");
	sc.close();
	}
	//ConstructionCost cc = new ConstructionCost();
}
