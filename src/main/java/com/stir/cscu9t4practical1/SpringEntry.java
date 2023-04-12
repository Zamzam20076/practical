package com.stir.cscu9t4practical1;

public class SpringEntry extends Entry //to connect between classes 
{


    private int repetitions;
    private int recovery;
    /**
     * Constructor for objects of class Cycling
     */
public SpringEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep,int rec )
{

super(n, d, m, y, h, min, s, dist);
this.repetitions= rep; 
this.recovery= rec; 

}
// get and set method
public int getrepetitions() {
return repetitions;
} 
public void setrepetitions(int rep) {
	  this.repetitions= rep;
	} 

public int getrecovery() {
return recovery;
} 
public void setrecovery(int rec) {
	  this.recovery= rec;
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
        +getDay()+"/"+getMonth()+"/"+getYear()+"\n" +getrepetitions() +":"+ getrecovery() ;
return result;
}
}
