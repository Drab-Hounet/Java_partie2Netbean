
package com.dgr.behavior;

import com.dgr.members.*;
import java.util.ArrayList;

/**
 *
 * @author jerome.lombard
 */
public class AddEmployee implements AddContact {
    
    @Override
    public ArrayList<Person> addSomeBody(Person person, ArrayList<Person> listContact){
        listContact.add(person);
        System.out.println(person.getName() + " a été ajouté en tant qu'employé");
        return listContact;
    }
}
