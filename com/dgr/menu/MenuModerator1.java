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
                //to remove an user
                this.listContacts.getEachUser();
                if(!this.listContacts.getListUsers().isEmpty()){      
                    try{
                        this.listContacts.getListUsers().remove(this.pointerToSelect("Quel "
                            + "utilisateur voulez vous effacer?"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");                   
                    }
                break;
            }
        } 
    }    
}
