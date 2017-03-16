
package com.dgr.behavior;

import com.dgr.members.*;
import java.util.ArrayList;

/**
 *
 * @author jerome.lombard
 */
public class AddNoOne implements AddContact{
    
    @Override
    public ArrayList<Person> addSomeBody(Person person , ArrayList<Person> listContact){
        System.out.println(person + " n'est pas ajouté -> oréation impossible");
        return listContact;
    }

}
