package com.dgr.members;

import com.dgr.attributes.*;
import com.dgr.behavior.*;
import com.dgr.menu.*;

import java.util.Calendar;

/**
 *
 * @author jerome.lombard
 */
public abstract class Person {
    
    protected Paid paid = new Volunteer(); 
    protected AddContact addContact = new AddNoOne();
    protected GroupPerson listContact = new GroupPerson();
    protected int renumeration;
    protected Menu menu = new MenuUser();
    
    protected String name = new String();
    protected String first_name = new String();
    protected int birthYear;
    
    //-------------------------Constructors-------------------------------------
    
    public Person(){
    }
    
    public Person(String pName, String pFirst_name, int pBirthYear){
        this.name = pName;
        this.first_name = pFirst_name;
        this.birthYear = pBirthYear;
    }
    
    //--------------------------------------------------------------------------
    

    public String toPay(int amount){
        return paid.pay(amount);
    }
    
    public int toGetRenumeration(){
        return this.paid.getRenumeration();
    }
    
    public void toSetRenumeration(int amount){
        this.renumeration = amount;
    }
        
    /**
     *
     * @param person
     */
    public void toAddSomeOne(Person person){
        this.listContact.setListUsers(addContact.addSomeBody(person, this.listContact.getListUsers()));
        //this.listContact = addContact.addSomeBody(person, this.listContact);
    }
    
    public void toLoopMenu(GroupPerson group){
        this.menu.loopMenu(this , group);
    }
    

    public String getName() {
        return name;
    }

    public String getFirst_name() {
        return first_name;
    }
    
    public int getBirthYear() {
        return birthYear;
    }
    
    public GroupPerson getGroupContacts(){
        return this.listContact;
    }
    
    public String displayProfil(){
        return  this.getClass().getSimpleName() + " : " + this.getName() + " " + this.getFirst_name() 
                + " année de naissance : " + this.getBirthYear();
    }
    
    public void setToPay(Paid paid){
        //in order to modify the behavior of paiement
        this.paid = paid;
    }
    
    public void setToAddContact(AddContact addContact){
        //in order to modify the behavior of adding contact
        this.addContact = addContact;
    }
        
    public void setName(String name) {
        this.name = name;
    }
    
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    public void addMessage(Message message){
        System.out.println("opération impossible !");
    }
    
    public boolean showMessage(){
        System.out.println("opération impossible !");
        return false;
    }
    
    public void deleteMessage(int pointer){
        System.out.println("opération impossible !");
    }
    
    


    
        
        
        
        
        

    
}
