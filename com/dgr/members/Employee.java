package com.dgr.members;

import com.dgr.behavior.*;

/**
 *
 * @author jerome.lombard
 */
public class Employee extends Person{
    
    public Employee(){
        this.paid = new Salary();
    }
    
    public Employee(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.paid = new Salary();
    }
    
    
}
