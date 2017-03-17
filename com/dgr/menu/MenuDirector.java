package com.dgr.menu;

import com.dgr.members.*;

/**
 *
 * @author jerome.lombard
 */
public class MenuDirector extends MenuGeneralEmployees {
    
    @Override
    public void display(){
        super.display();
        System.out.println("3.  Afficher les employés embauchés");  
        System.out.println("4.  Embauche d'un employé");
        System.out.println("5.  Création d'un employé");
        System.out.println("6.  Liste de tous les employés");
        System.out.println("7.  Licencié un employés");
        System.out.println("8.  Supprimer un employé de la base");
    }
    
    @Override
    public void controlMenu(Person user) {
        super.controlMenu(user);
        switch(this.menuItem){
            case 3:
                //show employees hired
                user.getGroupContacts().getEachUser();
                break;
                
            case 4:
                //hire an employee
                if (this.listContacts.getEachUser()){
                    try{
                        Person employeeToAdd = listContacts.getListUsers().get(this.pointerToDelete("Quel employé souhaitez vous ajouter?"));
                        user.toAddSomeOne(employeeToAdd);
                    }catch(Exception e){
                        System.out.println("Opération impossible");
                    }
                }
                break;
                
            case 5:
                //create a new employee
                Person employeeToCreate = new Employee();
                this.setProfil(employeeToCreate);
                this.listContacts.getListUsers().add(employeeToCreate);
                break;
                
            case 6:
                //display all employees
                this.listContacts.getEachUser();
                break;
                
            case 7:
                //fired an employee
                user.getGroupContacts().getEachUser();
                if(!user.getGroupContacts().getListUsers().isEmpty()){
                    try{
                        user.getGroupContacts().getListUsers().remove(this.pointerToDelete("Quel employé souhaitez vous licensier?"));
                        System.out.println("Employé licencié");
                    }catch(Exception e){
                        System.out.println("Opération impossible");
                    }
                }
                break;
            
            case 8:
                //delete an employee definitely
                this.listContacts.getEachUser();
                if(!this.listContacts.getListUsers().isEmpty()){     
                    try{
                        this.listContacts.getListUsers().remove(this.pointerToDelete("Quel "
                            + "employé voulez vous effacer?"));
                    }catch(Exception e){
                        System.out.println("Opération Impossible");                   
                    }
                }
                break;
        }
    }    
}
