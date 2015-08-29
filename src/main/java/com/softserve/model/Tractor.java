package com.softserve.model;

/**
 * Tractor class
 * @author UserMaryana
 *
 */
public class Tractor extends Car {
	public Cargo cargo;

	public Tractor(String model, double engine, double benzinPer100Km) {
		super(model, engine, benzinPer100Km);
	}

	/*
	 * method shows a number of fuel for needed kilemetres
	 */
	public double needOfFuel (double klm){
		return klm*10;
	} 

	
}