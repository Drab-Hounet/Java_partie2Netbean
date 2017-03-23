
package com.dgr.menu;

import com.dgr.attributes.*;
import com.dgr.members.*;
import java.util.Scanner;

/**
 *
 * @author jerome.lombard
 */
public class MenuConnexion {
    
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

    public MenuConnexion(GroupPerson groupEmployees, GroupPerson groupCustomers){
        this.groupCustomers = groupCustomers;
        this.groupEmployees = groupEmployees;
    }

    public void SaveRegister(){
        //à faire
        Customer userToCreate = new User();
        //MenuGeneral menu = new MenuUser();

        //menu.setProfil(userToCreate);
        this.groupCustomers.getListUsers().add(userToCreate);
    }
    
    public void displayListUsers(){
        //display all users(employees and customers)
        System.out.println("-----> liste des Utilisateurs");
        this.groupCustomers.getEachUser();
        System.out.println("\n-----> liste des Employés");
        this.groupEmployees.getEachUser();
    }
    
    public boolean verifyIfExist(String name, String first_name){
        
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
        
        System.out.println(this.personToConnect);
        
        if(this.personToConnect != null){
            if(personToConnect.getClass().getSuperclass().getSimpleName().equals("Employee")){
                System.out.println("\nVous êtes bien connecté !\n");
                return true;
            }else{
                System.out.println("\nVous êtes bien connecté !\n");

                return true;
            }
        }
        return false;
    }
}
