
package com.dgr.behavior;

import com.dgr.members.*;
import java.util.ArrayList;

/**
 *
 * @author jerome.lombard
 */
public class AddFriend implements AddContact {
    
    @Override
    public ArrayList<Person> addSomeBody(Person person, ArrayList<Person> listContact){
        listContact.add(person);
        System.out.println(person + "a été ajouté en tant qu'amis");
        return listContact;
    }
}
