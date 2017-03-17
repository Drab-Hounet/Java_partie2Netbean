
package com.dgr.menu;

import com.dgr.attributes.*;
import com.dgr.members.Person;
import java.util.Scanner;

/**
 *
 * @author jerome.lombard
 */
public class Connexion {
    
    public GroupPerson groupEmployees = new GroupPerson();
    public GroupPerson groupCustomers = new GroupPerson();
    public Person personToConnect;
    
    static final Scanner input = new Scanner(System.in); 
    
    public Connexion(GroupPerson groupEmployees, GroupPerson groupCustomers){
        this.groupCustomers = groupCustomers;
        this.groupEmployees = groupEmployees;
    }
    
    public void display(){
        
        int item;
        boolean carryOn = true;
        while(carryOn){
            System.out.println("Vous voulez vous connecter?");
            System.out.println("1. CONNEXION");
            System.out.println("2. INSCRIPTION");
            item = input.nextInt();
        
            if (item == 1){
                carryOn = this.displayLogin();
            }else if(item == 0){
                carryOn = this.displayRegister();
            }
        }
        input.nextLine();
    }
    public boolean displayLogin(){
        
        System.out.println("Renseigner vos identiants");
        System.out.println("Votre nom?");
        String name = input.nextLine();
        
        System.out.println("Votre prénom?");
        String first_name = input.nextLine();
        
        this.verifyIfExist(name, first_name);
        if(this.personToConnect != null){
            //à faire -> ajouter le test de class entre employee et customers
            this.personToConnect.toLoopMenu(groupEmployees);
            return false;
        }
        return true;
    }
    
    public boolean displayRegister(){
        //à faire
        return false;
    }
    
    public void verifyIfExist(String name, String first_name){
        
        //check in customers
        for (Person person : this.groupCustomers.getListUsers()){
            if (person.getFirst_name().equals(name) && person.getFirst_name().equals(first_name)){
                this.personToConnect = person; 
            }
        }
        
        //check in employees
        for (Person person : this.groupEmployees.getListUsers()){
            if (person.getFirst_name().equals(name) && person.getFirst_name().equals(first_name)){
                this.personToConnect = person;
            }
        }
    }
}
