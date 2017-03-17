package com.dgr.members;

import com.dgr.behavior.*;
import com.dgr.menu.*;

/**
 *
 * @author jerome.lombard
 */
public class Director extends Employee {
    public Director(){
        super();
        this.addContact = new AddEmployee();
        this.menu = new MenuDirector();
    }
    
    public Director(String pName, String pFirst_name, int pBirthYear, int salary){
        super(pName, pFirst_name, pBirthYear);
        this.addContact = new AddEmployee();
        this.menu = new MenuDirector();
        this.renumeration = salary;
    }
    
    
}
