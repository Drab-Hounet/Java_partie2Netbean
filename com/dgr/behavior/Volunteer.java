
package com.dgr.behavior;

/**
 *
 * @author jerome.lombard
 */
public class Volunteer implements Paid{
    //public int remuneration;
    
    @Override
    public String pay(int amount){
        return "Pas de renumération";
    }
    
    @Override
    public int getRenumeration(){
        return 0;
    }
}
