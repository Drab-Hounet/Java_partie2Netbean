package com.dgr.menu;

import com.dgr.members.Person;

/**
 *
 * @author jerome.lombard
 */
public class MenuModerator2 extends MenuModerator1 {
    
    @Override
    public void display(){
        super.display();
        System.out.println("10. 	Effacer un message (mode modérateur)"); 
    }
    
    @Override
    public void controlMenu(Person user){
        super.controlMenu(user);
        switch(this.menuItem){
            case 10: 
                System.out.println("10 à faire");
                break;
        }
    }
}
