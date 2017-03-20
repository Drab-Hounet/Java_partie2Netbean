
package com.dgr.members;
import com.dgr.attributes.*;
import com.dgr.behavior.*;
import java.util.ArrayList;

/**
 *
 * @author jerome.lombard
 */
public class Customer extends Person{
    
    protected ArrayList<Message> listMessage =  new ArrayList<>();
    
    public Customer(){
        this.addContact = new AddFriend();
    }
    
    public Customer(String pName, String pFirst_name, int pBirthYear){
        super(pName, pFirst_name, pBirthYear);
        this.addContact = new AddFriend();
    }
    
    @Override
    public void addMessage(Message message){
        listMessage.add(message);
    }
    
    @Override
    public boolean showMessage(){
       if(!this.listMessage.isEmpty()){
            for(int i = 0 ; i < this.listMessage.size() ; i ++){
                Message messageIt = this.listMessage.get(i);
                System.out.println((i+1) + ". :       EXP :      " + messageIt.getSender().getName()
                                        + "\n           DEST :     " + messageIt.getReceiver().getName()
                                        + "\n           Content :  " +messageIt.displayMessage());
                //System.out.println((i+1) + ". : " + this.listMessage.get(i).displayMessage());
            }
            return true;
        }else{
            System.out.println("-------> aucun message");
            return false;
        }
    }  
    
    @Override
    public void deleteMessage(int pointer){
        listMessage.remove(pointer);
        System.out.println("Message supprimé ! ");
    }
    
    
}
