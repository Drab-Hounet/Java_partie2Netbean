package com.dgr.behavior;
import com.dgr.attributes.*;

/**
 *
 * @author jerome.lombard
 */
public class DeleteNoMessUser implements DeleteAnyMessage{
    
    @Override
    public void deleteMess(Message message){
        System.out.println("effacement des autres message impossible");
    }
}
