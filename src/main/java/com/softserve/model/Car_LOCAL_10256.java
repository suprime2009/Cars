package com.softserve.model;

/**
 * This class for route
 * @author Pavel
 *
 */
public abstract class Car {

    private String model;
    private double engine;
    private double benzinPer100Km;
    private int averSpeed;
    private final int ROUNDING = 100;
    
    public Car(String model, double engine, double benzinPer100Km, int averSpeed) {
	this.model = model;
	this.engine = engine;
	this.benzinPer100Km = benzinPer100Km;
	this.averSpeed = averSpeed;
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
    
    public double getSpendedHoursForRounte(Route route) {
	double hours = (route.getK�lometrs() * benzinPer100Km) / ROUNDING;
	return hours;
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
    

}