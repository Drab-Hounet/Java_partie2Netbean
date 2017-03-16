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
                this.listUsers.getEachUser();
                if(!this.listUsers.getListUsers().isEmpty()){      
                    try{
                        userToDeleteMessage = this.listUsers.getListUsers().get(this.pointerToDelete("Sélectionner l'utilisateur :"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");   
                        break;
                    }
                if(userToDeleteMessage.showMessage()){
                    try{
                        userToDeleteMessage.deleteMessage(this.pointerToDelete("Quel message souhaitez vous effacer ?"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");
                    }
                }
                break;
            }
        }
    }
}
