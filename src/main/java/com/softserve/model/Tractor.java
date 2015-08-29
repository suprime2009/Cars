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
<<<<<<< HEAD
	/*
	 * method shows a number of fuel for needed kilemetres
	 */
	public double needOfFuel (double klm){
		return klm*10;
	}
}
=======

	public Cargo cargo; 

	
}
>>>>>>> 49fc5a6ef1c4ad216140b55911cab5a92e2a5e81
