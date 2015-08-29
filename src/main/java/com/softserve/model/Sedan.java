package com.softserve.model;

public class Sedan {
	private String color;
	private int weight;
	private String transmision;

	/*
	 * method shows a number of fuel for needed kilemetres
	 */
	public double needOfFuel (double klm){
		return klm*7;
	}
}
