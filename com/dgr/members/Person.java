package com.dgr.members;

import com.dgr.attributes.*;
import com.dgr.behavior.*;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author jerome.lombard
 */
public abstract class Person {
    
    protected Paid paid = new Volunteer(); 
    protected AddContact addContact = new AddNoOne();
    protected ArrayList<Person> listContact = new ArrayList();
    protected DeleteAnyMessage deleteAnyMessage = new DeleteNoMessUser();
    
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
    
    /**
     *
     * @param amount
     */
    public void toPay(int amount){
        paid.pay(amount);
    }
    
    public void toDeleteAnyOne(Message message){
        deleteAnyMessage.deleteMess(message);
    }
    
    /**
     *
     * @param person
     */
    public void toAddSomeOne(Person person){
        this.listContact = addContact.addSomeBody(person, this.listContact);
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
    
    public String displayProfil(){
        return  this.getName() + " " + this.getFirst_name() 
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
    
    public void setToDeleteAnyOne(DeleteAnyMessage deleteAnyMessage){
        //in order to modify the behavior of adding contact
        this.deleteAnyMessage = deleteAnyMessage;
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


    
        
        
        
        
        

    
}
