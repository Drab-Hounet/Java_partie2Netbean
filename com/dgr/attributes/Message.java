package com.dgr.attributes;

import com.dgr.members.*;
import java.util.Scanner;

public class Message {

    private String content;
    private Person sender;
    private Person receiver;
    private final Scanner input = new Scanner(System.in);
    
    public Message(String content, Person sender, Person receiver){
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }
   
    /**
    * @return the content of the message
    */
    public String getContent() {
        return content;
    }
   
    /**
     * set the message with Scanner
     * @param message
     */
    public void setContent(String message) {		
        this.content = message;       
    }	
    
    /**
     *
     * @return
     */
    public Person getSender() {
        return sender;
    }

    /**
     *
     * @param sender
     */
    public void setSender(Customer sender) {
        this.sender = sender;
    }

    /**
     *
     * @return
     */
    public Person getReceiver() {
        return receiver;
    }

    /**
     *
     * @param receiver
     */
    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }
    
    public String displayMessage(){
        return this.getContent();
    }
	
}
