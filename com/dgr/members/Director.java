package com.dgr.members;

import com.dgr.behavior.*;

/**
 *
 * @author jerome.lombard
 */
public class Director extends Employee {
    public Director(){
        super();
        this.addContact = new AddEmployee();
        
    }
    public Director(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.addContact = new AddEmployee();
    }
}
