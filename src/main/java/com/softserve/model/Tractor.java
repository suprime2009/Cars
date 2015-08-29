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
	    int id2, String name2) {
	super(model, engine, benzinPer100Km, averSpeed);
	this.cargo = new Cargo(id2, name2);
    }
}