
package com.dgr.members;
import com.dgr.attributes.*;
import com.dgr.behavior.*;

/**
 *
 * @author jerome.lombard
 */
public class Customer extends Person{
        
    public Customer(){
        this.addContact = new AddFriend();
    }
    
    public Customer(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.addContact = new AddFriend();
    }
   
    
    
    
}
