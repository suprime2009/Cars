package com.softserve.model;

public class Track extends Car {
	
	double lenghttrl;
	
	public Track(String model,double engine, double trailer){
		super(model,engine);
		lenghttrl = trailer;
	}
	public void getVoice(){
		System.out.println("Duu - duu!!!");
	}
	
	public double getlengthTrailer(){
		return lenghttrl;
	}
	/*
	 * method shows a number of fuel for needed kilemetres
	 */
	public double needOfFuel (double klm){
		return klm*14;
	}

}
