package com.dgr.menu;

import com.dgr.members.*;

/**
 *
 * @author jerome.lombard
 */
public abstract class MenuGeneralEmployees extends MenuGeneral {
        
    @Override
    public void display(){
        
        System.out.println("Choisissez : (Pour quitter taper 0)");
        System.out.println("1.  Afficher votre profil");
        System.out.println("2.  Modifier votre profil");
    }
    @Override
    public void controlMenu(Person user) {
        this.display();
        this.returnDisplay();
        switch(this.menuItem){
        case 1:
            //display profile
            System.out.println(user.displayProfil());
            break;
        case 2:
            //modify an user
            this.setProfil(user);
            break;
        case 0:
                //end of program
                System.out.println("Programme terminé !");
                this.carryOn = false;
                break;
        default:
        }
            
    }
    
}
