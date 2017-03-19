package com.dgr.menu;

import com.dgr.attributes.*;
import com.dgr.members.*;

/**
 *
 * @author jerome.lombard
 */
public abstract class MenuGeneralCustomers extends MenuGeneral{ 
   
    @Override
    public void display(){

        System.out.println("\nChoisissez : (Pour quitter taper 0)");
        System.out.println("1. 	Afficher votre profil");
        System.out.println("2. 	Modifier votre profil");
        System.out.println("3. 	Ecrire un message");
        System.out.println("4. 	Afficher tous les messages");
        System.out.println("5. 	Effacer un message");
        System.out.println("6. 	Ajouter un ami");
        System.out.println("7. 	Afficher mes amis");
        System.out.println("8. 	Lister tous les utilisateurs"); 
    }
    
    @Override
    public void controlMenu(Person user){
        //control the menu
        this.display();
        this.returnDisplay();
        switch(this.menuItem){
            case 1:
                //display profile
                System.out.println(user.displayProfil());
                break;
            case 2:
                //modify an user
                this.setProfil(user);
                break;
            case 3:
                //add a message
                Message message = new Message();
                message.setContent();
                user.addMessage(message);
                break;
            case 4:
                //show messages
                user.showMessage();
                break;
            case 5:
                //delete one of my messages
                if(user.showMessage()){
                    try{
                        user.deleteMessage(this.pointerToDelete("Quel message souhaitez vous effacer ?"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");
                    }
                }
                break;
                
            case 6:
                //add a friend
                if (this.listContacts.getEachUser()){
                    try{
                        Person userToAdd = listContacts.getListUsers().get(this.pointerToDelete("Quel utilisateur souhaitez vous ajouter?"));
                        user.toAddSomeOne(userToAdd);
                    }catch(Exception e){
                        System.out.println("Opération impossible");
                    }
                }
                break;
            case 7:
                //display all your friends
                user.getGroupContacts().getEachUser();

                break;

            case 8:
                //list of all users
                this.listContacts.getEachUser();
                break;
            case 0:
                //end of program
                System.out.println("Programme terminé !");
                this.carryOn = false;
                break;
            default:

        }
    }
 
}