
package com.dgr.behavior;

/**
 *
 * @author jerome.lombard
 */
public class GoodBuy implements Paid{
    public int remuneration;


    @Override
    public String pay(int amount){
        this.remuneration = amount;
        return "\nLe montant de la rénumération est de " 
                            + this.remuneration + " € en bon d'achat";
    } 
    
    @Override
    public int getRenumeration(){
        return this.remuneration;
    }
    
}
