package com.dgr.menu;

import com.dgr.attributes.*;
import java.util.Scanner;
import com.dgr.members.*;

/**
 *
 * @author jerome.lombard
 */
public abstract class MenuGeneralCustomers implements Menu{
    
    static final Scanner input = new Scanner(System.in); 
    public int menuItem;
    public boolean carryOn=true;
    protected GroupUser listUsers = new GroupUser();
    
    @Override
    public void display(){

        System.out.println("Choisissez : (Pour quitter taper 0)");
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
    public int returnDisplay(){
        //return the choice of the user
        try {
            this.menuItem = input.nextInt();
        }catch(Exception e){
            this.menuItem = 1000;
        }
        input.nextLine();
        return this.menuItem;
    }
    
    @Override
    public void loopMenu(Person user, GroupUser list){
        //loop the menu
        this.listUsers = list;
        while(carryOn){
            this.controlMenu(user);
        }
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
            case 7:
                //display all your friends
                user.getListContacts().getEachUser();

                break;
            case 6:
                //add a friend
                if (this.listUsers.getEachUser()){
                    Person userToAdd = listUsers.getListUsers().get(this.pointerToDelete("Quel utilisateur souhaitez vous ajouter?"));
                    user.toAddSomeOne(userToAdd);
                }
                break;
            
            case 8:
                //list of all users
                this.listUsers.getEachUser();
                break;
            case 0:
                //end of program
                System.out.println("Programme terminé !");
                this.carryOn = false;
                break;
            default:
            
            
        }
    }
    
    /**
     *
     * @param user
     */
    @Override
    public void setProfil(Person user) {
        
        if(user.getName().isEmpty()){
            System.out.println("Renseigner votre nom : ");
        }else{
            System.out.println("Modifier votre nom " + user.getName() + " ?");
        }
        user.setName(input.nextLine());
        if(user.getFirst_name().isEmpty()){
            System.out.println("Renseigner votre prénom : ");
        }else{
            System.out.println("Modifier votre prénom " + user.getFirst_name() + " ?");
        }
        user.setFirst_name(input.nextLine());
        if(user.getBirthYear() > 0){
            System.out.println("Modifier votre année de naissance de " + user.getBirthYear() + " ans ?");
        }else{
            System.out.println("Renseigner votre année de naissance : ");
        }
        try{
            user.setBirthYear(input.nextInt());	
        }catch(Exception e){
            user.setBirthYear(1983);
            System.out.println("année par défaut mis à 1983 par défaut !");
            input.nextLine();
        }
    }
    
    @Override
    public int pointerToDelete(String message){
        //ask to give one message to delete
        System.out.println(message);
        int pointer= -1;
        try{
            pointer = input.nextInt();
        }catch(Exception e){
        }
        input.nextLine();
        return pointer;
    }
    
    

}

