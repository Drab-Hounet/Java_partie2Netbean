
package com.dgr.behavior;

/**
 *
 * @author jerome.lombard
 */
public class GoodBuy implements Paid{
    public int remuneration;

    /**
     *
     * @param amount
     */
    @Override
    public void pay(int amount){
        this.remuneration = amount;
        System.out.println("Le montant de votre rénumération est de " 
                            + this.remuneration + " € en bon d'achat");
    } 
}
