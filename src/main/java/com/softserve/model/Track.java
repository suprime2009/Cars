package com.softserve.model;

public class Track extends Car {
	
	double lenghttrl;
	
	public Track(String model,double engine, double benzinPer100Km){
		super(model,engine,benzinPer100Km);
	}
	public void getVoice(){
		System.out.println("Duu - duu!!!");
	}
	
	/*
	 * method shows a number of fuel for needed kilemetres
	 */
	public double needOfFuel (double klm){
		return klm*14;
	}

}
