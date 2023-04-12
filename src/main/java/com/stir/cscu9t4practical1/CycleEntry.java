package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {

	         private String terrain;
	         private String tempo;
	         /**
	          * Constructor for objects of class Cycling
	          */
	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tem)
   {
		
		super(n, d, m, y, h, min, s, dist);
		this.terrain= ter; 
		this.tempo= tem; 
		
	}
	//get and set methods
      public String getterrain() {
      return terrain;
	}
      public void setterrain(String ter) {
    	  this.tempo= ter;
    } 
      
	public String gettempo() {
	return tempo;
	}
	public void settempo(String tem) {
  	  this.tempo= tem;
  	} 
	/**
	 * An example of a method - replace this comment 
	 * 
	 * @param y a sample parameter for a method 
	 * @return the sum of x and y 
	 */

	  public String getEntry () {
	   String result = getName()+" ran " + getDistance() + " km in "
	             +getHour()+":"+getMin()+":"+ getSec() + " on "
	             +getDay()+"/"+getMonth()+"/"+getYear()+"\n" +getterrain() +":"+ gettempo() ;
	   return result;
    }
}
