package com.dgr.menu;

import com.dgr.attributes.*;
import com.dgr.members.*;
import java.util.Scanner;

/**
 *
 * @author jerome.lombard
 */
public abstract class MenuGeneral implements Menu {
    
    protected GroupPerson listContacts = new GroupPerson();
    static final Scanner input = new Scanner(System.in); 
    public int menuItem;
    public boolean carryOn = true;
    
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
    public void loopMenu(Person user, GroupPerson list){
        //loop the menu
        this.listContacts = list;
        this.carryOn = true;
        while(carryOn){
            this.controlMenu(user);
        }
    }
    
    @Override
    public int pointerToSelect(String message){
        //ask to give one message to delete
        System.out.println(message);
        int pointer= -1;
        try{
            pointer = input.nextInt();
        }catch(Exception e){
        }
        input.nextLine();
        return pointer-1;
    }

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
}
