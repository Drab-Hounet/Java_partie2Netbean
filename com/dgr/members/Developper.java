package com.dgr.members;

/**
 *
 * @author drab
 */
public class Developper extends Employee{
    
    public Developper(){
        super();      
    }
    
    public Developper(String pName, String pFirst_name, int pBirthYear, int salary){
        super(pName, pFirst_name, pBirthYear);
        this.renumeration = salary;
       
    }
}
