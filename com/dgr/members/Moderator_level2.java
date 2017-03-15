package com.dgr.members;

import com.dgr.behavior.*;

/**
 *
 * @author jerome.lombard
 */
public class Moderator_level2 extends Customer  {
    //moderator with basic right 
    
    public Moderator_level2(){
        this.paid = new GoodBuy();
        this.deleteAnyMessage = new DeleteMessUser();
    }
    
    public Moderator_level2(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.paid = new GoodBuy();
        this.deleteAnyMessage = new DeleteMessUser();
        
    }
}
