package com.dgr.attributes;

import com.dgr.members.*;
import java.util.ArrayList;

/**
 *
 * @author jerome.lombard
 */
public class GroupUser {
    private ArrayList<Person> listUsers = new ArrayList<>();
    
    /**
     *
     * @return
     */
    public ArrayList<Person> getListUsers(){
        return this.listUsers;
    }
    
    public boolean getEachUser() {
        if(!this.listUsers.isEmpty()){
            for (int i = 0 ; i < this.listUsers.size(); i++){
                System.out.println( (i+1) + ". " 
                                    + listUsers.get(i).displayProfil());	
            }
            return true;
        }else {
            System.out.println("-------> aucun utilisateur");
        }
        return false;
    }
    
    public void setListUsers(ArrayList<Person> listUsers){
        this.listUsers = listUsers;
    }
    
    
    
    
    
}
