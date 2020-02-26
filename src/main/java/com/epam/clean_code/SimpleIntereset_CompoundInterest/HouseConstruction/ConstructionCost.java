package com.epam.clean_code.SimpleIntereset_CompoundInterest.HouseConstruction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConstructionCost {
    private int material;
    private double areaOfHouse;
    private boolean isAutomated;
    private double estimatedCost;
    private static final Logger LOGGER=LogManager.getLogger(ConstructionCost.class);
    public ConstructionCost(int material,double areaOfHouse,boolean isAutomated)
    {
        this.material = material;
        this.areaOfHouse = areaOfHouse;
        this.isAutomated = isAutomated;
        switch(this.material)
        {
            case 0: //LOGGER.error("Estimated cost is: 1200\n");
            		this.estimatedCost = 1200;
                    break;
            case 1: //LOGGER.error("Estimated cost is: 1500\n");
            		this.estimatedCost = 1500;
                    break;
            case 2: //LOGGER.error("Estimated cost is:1800\n");
            		this.estimatedCost = 1800;
                    break;
            default : LOGGER.error("NO such material");
        }
        if(this.isAutomated)
        {
            this.estimatedCost += 700;
        }
        LOGGER.error("Estimated cost is:"+this.estimatedCost+"\n");
    }
    public double Estimate()
    {
    	LOGGER.info("Estimated total cost is:"+this.estimatedCost*this.areaOfHouse+"\n");
        return this.estimatedCost * this.areaOfHouse;
    }
}
