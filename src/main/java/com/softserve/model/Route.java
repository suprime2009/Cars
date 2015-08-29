package com.softserve.model;

public class Route {
    
    private String nameOfRoute;
    private int kilometrs;
    
    public Route(String nameOfRoute, int kilometrs) {
	this.nameOfRoute = nameOfRoute;
	this.kilometrs = kilometrs;
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
     * @return the k³lometrs
     */
    public int getKilometrs() {
        return kilometrs;
    }

    /**
     * @param k³lometrs the k³lometrs to set
     */
    public void setKilometrs(int kilometrs) {
        this.kilometrs = kilometrs;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Route [nameOfRoute=" + nameOfRoute + ", kilometrs=" + kilometrs + "]";
    }
    
    
    
    

}
