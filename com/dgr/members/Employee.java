package com.dgr.members;

import com.dgr.behavior.*;
import com.dgr.menu.*;

/**
 *
 * @author jerome.lombard
 */
public class Employee extends Person{
    
    public Employee(){
        this.paid = new Salary();
        this.menu = new MenuEmployee();
    }
    
    public Employee(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.paid = new Salary();
        this.menu = new MenuEmployee();
    }
    
    @Override
    public String displayProfil(){
        return super.displayProfil() + this.toPay(this.renumeration);
    }
}
