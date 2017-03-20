
package com.dgr.menu;

import com.dgr.attributes.*;
import com.dgr.members.*;
import java.util.Scanner;

/**
 *
 * @author jerome.lombard
 */
public class Connexion {
    
    public GroupPerson groupEmployees = new GroupPerson();
    public GroupPerson groupCustomers = new GroupPerson();
    protected Person personToConnect;
    static Scanner input = new Scanner(System.in); 

    public Person getPersonToConnect() {
        return personToConnect;
    }

    public void setPersonToConnect(Person personToConnect) {
        this.personToConnect = personToConnect;
    }

    public Connexion(GroupPerson groupEmployees, GroupPerson groupCustomers){
        this.groupCustomers = groupCustomers;
        this.groupEmployees = groupEmployees;
    }
    
    public void display(){
        
        int item;
        boolean carryOn = true;
        while(carryOn){
            System.out.println("\nVous voulez vous connecter?");
            System.out.println("1.  CONNEXION");
            System.out.println("2.  INSCRIPTION");
            System.out.println("3.  VOIR LA LISTES DES UTILISATEURS");
            try{
                item = input.nextInt();
            }catch(Exception e){
                item = -1;
                input.nextLine();
            }
        
            switch (item) {
                case 1:
                    input.nextLine();
                    this.displayLogin();
                    break;
                case 2:
                    this.displayRegister();
                    break;
                case 3:
                    this.displayListUsers();
                    break;
                default:
                    break;
                case 0:
                    carryOn = false;
                    break;
            }
        }
    }
    public void displayLogin(){
        //display and check login access
        System.out.println("Renseigner vos identiants");
        System.out.println("Votre nom?");
        String name = input.nextLine();
        
        System.out.println("Votre prénom?");
        String first_name = input.nextLine();
        
        this.verifyIfExist(name, first_name);
        System.out.println(this.personToConnect);
        if(this.personToConnect != null){
            if(personToConnect.getClass().getSuperclass().getSimpleName().equals("Employee")){
                System.out.println("\nVous êtes bien connecté !\n");
                this.personToConnect.toLoopMenu(groupEmployees);
            }else{
                System.out.println("\nVous êtes bien connecté !\n");
                this.personToConnect.toLoopMenu(groupCustomers);
            }
        }
    }
    
    public void displayRegister(){
        //à faire
        Customer userToCreate = new User();
        MenuGeneral menu = new MenuUser();
        
        menu.setProfil(userToCreate);
        this.groupCustomers.getListUsers().add(userToCreate);
    }
    
    public void displayListUsers(){
        //display all users(employees and customers)
        System.out.println("-----> liste des Utilisateurs");
        this.groupCustomers.getEachUser();
        System.out.println("\n-----> liste des Employés");
        this.groupEmployees.getEachUser();
    }
    
    public void verifyIfExist(String name, String first_name){
        
        //check in customers
        for (Person person : this.groupCustomers.getListUsers()){
            if (person.getFirst_name().equals(first_name) && person.getName().equals(name)){     
                this.personToConnect = person;
            }
        }
        //check in employees
        for (Person person : this.groupEmployees.getListUsers()){
            if (person.getFirst_name().equals(first_name) && person.getName().equals(name)){
                this.personToConnect = person;
            }
        }
    }
}
