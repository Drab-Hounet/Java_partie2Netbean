
package com.dgr.behavior;

/**
 *
 * @author jerome.lombard
 */
public class Volunteer implements Paid{
    //public int remuneration;
    
    /**
     *
     * @param amount
     */
    @Override
    public void pay(int amount){
        System.out.println("Pas de renumération");
    }
}
