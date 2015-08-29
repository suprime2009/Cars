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
<<<<<<< HEAD
    private double benzinPer100Km;
    private int averSpeed;
    private final int ROUNDING = 100;
    
    public Car(String model, double engine, double benzinPer100Km, int averSpeed) {
	this.model = model;
	this.engine = engine;
	this.benzinPer100Km = benzinPer100Km;
	this.averSpeed = averSpeed;
    }
=======
	private double benzinPer100Km;
	private final int ROUNDING = 100;

	abstract double needOfFuel (double klm);
    

	public Car(String model, double engine, double benzinPer100Km) {
		this.model = model;
		this.engine = engine;
		this.benzinPer100Km = benzinPer100Km;
	}
    
	public double valueOfFuelForTrip(Route route) {
		return (route.getK³lometrs() * benzinPer100Km) / ROUNDING;
		
	}
>>>>>>> 30861910be427e08882b513b002a9d75377ec443

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
	double hours = (route.getK³lometrs() * benzinPer100Km) / ROUNDING;
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
	/*
	 * method shows a number of fuel for needed kilemetres
	 */


}
