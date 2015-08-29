package com.softserve.model;

/**
 * Tractor class
 * @author UserMaryana
 *
 */
public class Tractor extends Car {

	public Tractor(String model, double engine, double benzinPer100Km) {
		super(model, engine, benzinPer100Km);
	}

	public Cargo cargo; 
	
}