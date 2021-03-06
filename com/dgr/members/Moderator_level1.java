package com.dgr.members;

import com.dgr.behavior.*;
import com.dgr.menu.*;

/**
 *
 * @author jerome.lombard
 */
public class Moderator_level1 extends Customer {
    //moderator with basic right 
    
    public Moderator_level1(){
        this.paid = new GoodBuy();
        this.menu = new MenuModerator1();
    }
    
    public Moderator_level1(String pName, String pFirst_name, int pBirthYear, int salary){
        super(pName, pFirst_name, pBirthYear);
        this.paid = new GoodBuy();
        this.menu = new MenuModerator1();
        this.renumeration = salary;
    }
    
    @Override
    public String displayProfil(){
        return super.displayProfil() + this.toPay(this.renumeration);
    }
}
