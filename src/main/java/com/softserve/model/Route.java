package com.softserve.model;

public class Route {
    
    private String nameOfRoute;
    private int k�lometrs;
    
    public Route(String nameOfRoute, int k�lometrs) {
	this.nameOfRoute = nameOfRoute;
	this.k�lometrs = k�lometrs;
    }

    /**
     * @return the nameOfRoute
     */
    public String getNameOfRoute() {
        return nameOfRoute;
    }

    /**
     * @param nameOfRoute the nameOfRoute to set
     */
    public void setNameOfRoute(String nameOfRoute) {
        this.nameOfRoute = nameOfRoute;
    }

    /**
     * @return the k�lometrs
     */
    public int getK�lometrs() {
        return k�lometrs;
    }

    /**
     * @param k�lometrs the k�lometrs to set
     */
    public void setK�lometrs(int k�lometrs) {
        this.k�lometrs = k�lometrs;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Route [nameOfRoute=" + nameOfRoute + ", k�lometrs=" + k�lometrs + "]";
    }
    
    
    
    

}
