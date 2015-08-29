package com.softserve.model;

/**
 * Tractor class
 * @author UserMaryana
 *
 */
public class Tractor extends Car {

	public Tractor(String model, double engine) {
		super(model, engine);
		
	}
	/*
	 * method shows a number of fuel for needed kilemetres
	 */
	public double needOfFuel (double klm){
		return klm*10;
	}
}
