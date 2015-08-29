package com.softserve.model;

/**
 * Tractor class
 * 
 * @author UserMaryana
 *
 */
public class Tractor extends Car {
    public Cargo cargo;

    public Tractor(String model, double engine, double benzinPer100Km, int averSpeed, 
	    int id, String name) {
	super(model, engine, benzinPer100Km, averSpeed);
	this.cargo = new Cargo (id, name);
    }
}