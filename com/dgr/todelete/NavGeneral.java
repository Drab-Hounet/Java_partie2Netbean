package com.dgr.todelete;

import com.dgr.attributes.Message;



/**
 * @author drab
 *
 */

public class NavGeneral {
	
    public void menu(GroupUser group){

        boolean carryOnMenu = true;

        User firstUser = Menu.menuSetModOrNot(); 

        Class<? extends User> classe = firstUser.getClass();
        firstUser.setProfil();
        firstUser.connect();

        while(carryOnMenu){

            switch(Menu.menuGeneral(firstUser)){
                case 1:
                    //display profile 
                    System.out.println(firstUser.displayProfil());
                    break;

                case 2:
                    //modify an user
                    firstUser.setProfil();				
                    break;

                case 3:
                    //write a message
                    Message message = new Message();
                    message.setContent();
                    firstUser.addMessage(message);
                    break;

                case 4:
                    //display all messages
                    firstUser.getListMessage();
                    break;

                case 5:
                    //add a friend
                    if(firstUser.getListFriends().size() != group.getListUsers().size()){
                            Menu.saveFriends(group, firstUser);
                    }else{
                        System.out.println("demande d'ami impossible");
                    }
                    break;

                case 6:
                    //display all your friends
                    firstUser.displayFriends();
                    break;

                case 7:
                    //display all users
                    group.getEachUser();
                    break;

                case 8:
                    //delete a message from the user
                    firstUser.deleteMessage();
                    break;

                case 9:
                    //delete an user                                         
                    if((!classe.getSimpleName().equals("Moderator")) || (!Menu.checkAccessAuthorized(firstUser.getLevel_moderator(), 2))){
                        System.out.println("aucune autorisation");
                    }else{           
                        group.getEachUser();
                        group.deleteUser();
                    }
                    break;

                case 10:
                    //delete any message
                    if((!classe.getSimpleName().equals("Moderator")) || (!Menu.checkAccessAuthorized(firstUser.getLevel_moderator(), 1))){
                        System.out.println("aucune autorisation");
                    }else{
                        group.getEachUser();
                        User userToDeleteMessage  = group.getListUsers().get(Menu.menuSelectUser(group, "Quel utilisateur souhaitez vous?")-1);
                        userToDeleteMessage.deleteMessage();
                    }	
                    break;

                case 20:
                    //end of program
                    carryOnMenu = false;
                    System.out.println("Programme terminé !");
                    break;

                default:
                    System.out.println("Erreur !!");
            }	
        }

    }
}