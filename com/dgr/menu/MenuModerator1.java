package com.dgr.menu;

import com.dgr.members.*;

/**
 *
 * @author jerome.lombard
 */
public class MenuModerator1 extends MenuGeneralCustomers {
   
    @Override
    public void display(){
        super.display();
        
        System.out.println("9. 	Effacer un utilisateur(mode modérateur)");  
    }
    
    @Override
    public void controlMenu(Person user){
        super.controlMenu(user);
        switch(this.menuItem){
            case 9: 
                System.out.println("9 à faire");
                
                //1 liste des users
                //2 selection d un ultilisateur
                //3 remove
                break;
        }
    }    
}
