package com.dgr.menu;

import com.dgr.members.*;

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
                //to remove a message from any user
                Person userToDeleteMessage = new Customer();
                this.listContacts.getEachUser();
                if(!this.listContacts.getListUsers().isEmpty()){      
                    try{
                        userToDeleteMessage = this.listContacts.getListUsers().get(this.pointerToSelect("Sélectionner l'utilisateur :"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");   
                        break;
                    }
                if(userToDeleteMessage.showMessage()){
                    try{
                        userToDeleteMessage.deleteMessage(this.pointerToSelect("Quel message souhaitez vous effacer ?"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");
                    }
                }
                break;
            }
        }
    }
}
