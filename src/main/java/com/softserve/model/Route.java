package com.softserve.model;

public class Route {
    
    private String nameOfRoute;
    private int k³lometrs;
    
    public Route(String nameOfRoute, int k³lometrs) {
	this.nameOfRoute = nameOfRoute;
	this.k³lometrs = k³lometrs;
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
    public int getK³lometrs() {
        return k³lometrs;
    }

    /**
     * @param k³lometrs the k³lometrs to set
     */
    public void setK³lometrs(int k³lometrs) {
        this.k³lometrs = k³lometrs;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Route [nameOfRoute=" + nameOfRoute + ", k³lometrs=" + k³lometrs + "]";
    }
    
    
    
    

}
