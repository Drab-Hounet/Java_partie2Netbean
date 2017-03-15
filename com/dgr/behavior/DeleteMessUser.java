package com.dgr.behavior;
import com.dgr.attributes.*;


/**
 *
 * @author jerome.lombard
 */
public class DeleteMessUser implements DeleteAnyMessage{
    
    @Override
    public void deleteMess(Message message){
         System.out.println("message : " + message + " effacé");
    }
}
