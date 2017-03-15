package com.dgr.members;

import com.dgr.behavior.*;

/**
 *
 * @author jerome.lombard
 */
public class Moderator_level1 extends Customer {
    //moderator with basic right 
    
    public Moderator_level1(){
        this.paid = new GoodBuy();
        this.deleteAnyMessage = new DeleteMessUser();
    }
    
    public Moderator_level1(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.paid = new GoodBuy();
        this.deleteAnyMessage = new DeleteMessUser();
    }
}
