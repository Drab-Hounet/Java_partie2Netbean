package com.dgr.todelete;

/**
 *
 * @author jerome.lombard
 */
public class Director extends Employee implements Relationship {
    
    public Director(){
        super();
    }
    
    public Director(String pName, String pFirst_name, int pBirthYear, int pSalary, int pContractDuration){
        super(pName, pFirst_name, pBirthYear, pSalary, pContractDuration);
    }
    
    @Override
    public String work(){
        return super.work() + " Directeur";
    }

    @Override
    public void addPerson(User friend) {
        this.listUsersConnected.add(friend);	
    }
}
