package com.softserve.model;

/**
 * This class for route
 * 
 * @author Pavel
 *
 */
public abstract class Car {

	
    private String model;
    private double engine;
	private double benzinPer100Km;
	private final int ROUNDING = 100;

	abstract double needOfFuel (double klm);
    

	public Car(String model, double engine, double benzinPer100Km) {
		this.model = model;
		this.engine = engine;
		this.benzinPer100Km = benzinPer100Km;
	}
    
	public double valueOfFuelForTrip(Route route) {
		return (route.getK�lometrs() * benzinPer100Km) / ROUNDING;
		
	}

    /** jhgfjhfgjhfjhgfjhfjytfrjytfjy
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the engine
     */
    public double getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(double engine) {
        this.engine = engine;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Car [model=" + model + ", engine=" + engine + "]";
    }
	/*
	 * method shows a number of fuel for needed kilemetres
	 */


}
