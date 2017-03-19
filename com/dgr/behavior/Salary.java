package com.dgr.behavior;

/**
 *
 * @author jerome.lombard
 */
public class Salary implements Paid {
    public int remuneration;
    
    /**
     *
     * @param amount
     * @return 
     */
    @Override
    public String pay(int amount){
        this.remuneration = amount;
        return "\nLe montant de la rénumération est de " 
                            + this.remuneration + " € par mois";
    }
    
    @Override
    public int getRenumeration(){
        return this.remuneration;        
    }
}
