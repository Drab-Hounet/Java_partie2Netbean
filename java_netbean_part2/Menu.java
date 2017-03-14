package java_netbean_part2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author drab
 *
 */

public final class Menu {
	
    private static Scanner input = new Scanner(System.in); 
	
    public static User menuSetModOrNot(){
        String menuItem;
        System.out.println("Etes vous moderateur ? (Y/N)");

        menuItem = input.nextLine();

        if (menuItem.equals("Y")){
            Moderator mod = new Moderator();
            System.out.println("Création du modérateur");
            return mod;
        }else{
            User user = new User();
            System.out.println("Création de l'utilisateur");
            return user;
        }
    }	
	
    public static int menuGeneral(User user){
        //display the general menu	
        Class<? extends User> classe = user.getClass();
        int menuItem;

        System.out.println("Choisissez :");
        System.out.println("1. 	Afficher votre profil");
        System.out.println("2. 	Modifier votre profil");
        System.out.println("3. 	Ecrire un message");
        System.out.println("4. 	Afficher tous les messages");
        System.out.println("5. 	Ajouter un ami");
        System.out.println("6. 	Afficher mes amis");
        System.out.println("7. 	Lister tous les utilisateurs");
        System.out.println("8. 	Effacer un message");
        if(classe.getSimpleName().equals("Moderator")){
            System.out.println("9. 	Effacer un utilisateur(mode modérateur)");
            System.out.println("10. 	Effacer un message (mode modérateur)");
        }
        System.out.println("20. 	Quitter");
        try {
            menuItem = input.nextInt();
        }catch(Exception e){
            menuItem = 100;
        }
        input.nextLine(); // to enable to save another user after the menu
        return menuItem;
    }
        
    public static void menuSetUser(User user){

        if(user.getName().isEmpty()){
            System.out.println("Renseigner votre nom : ");
        }else{
            System.out.println("Modifier votre nom " + user.getName() + " ?");
        }
        user.setName(input.nextLine());
        if(user.getFirst_name().isEmpty()){
            System.out.println("Renseigner votre prénom : ");
        }else{
            System.out.println("Modifier votre prénom " + user.getFirst_name() + " ?");
        }
        user.setFirst_name(input.nextLine());
        if(user.getBirthYear() > 0){
            System.out.println("Modifier votre année de naissance de " + user.getBirthYear() + " ans ?");
        }else{
            System.out.println("Renseigner votre année de naissance : ");
        }
        try{
            user.setBirthYear(input.nextInt());	
        }catch(Exception e){
            user.setBirthYear(1983);
            System.out.println("année par défaut mis à 1983 par défaut !");
            input.nextLine();
        }
    }
	
    public static void menuSetMod(Moderator moderator) {
        // TODO Auto-generated method stub
        
        //name
        if(moderator.getName().isEmpty()){
            System.out.println("Renseigner votre nom : ");
        }else{
            System.out.println("Modifier votre nom " + moderator.getName() + " ?");
        }
        moderator.setName(input.nextLine());
    
        //first_name
        if(moderator.getFirst_name().isEmpty()){
            System.out.println("Renseigner votre prénom : ");
        }else{
            System.out.println("Modifier votre prénom " + moderator.getFirst_name() + " ?");
        }
        moderator.setFirst_name(input.nextLine());
		
        //age
        if(moderator.getBirthYear() > 0){
            System.out.println("Modifier votre année de naissance de " + moderator.getBirthYear() + " ans ?");
        }else{
            System.out.println("Renseigner votre année de naissance : ");
        }
		
        try{
            moderator.setBirthYear(input.nextInt());	
        }catch(Exception e){
            moderator.setBirthYear(1983);
            System.out.println("année par défaut mis à 1983 par défaut !");
            input.nextLine();
        }
		
        //level's moderation
        if(moderator.getLevel_moderator() > 0){
            System.out.println("Modifier votre niveau de modération (" + moderator.getLevel_moderator() + ")");
        }else{
            System.out.println("Renseigner votre niveau de modération : ");
        }
        moderator.setLevel_moderator(input.nextInt());	
		
    }
		
    public static void saveFriends(GroupUser group, User user){
        //display the list of users
        String choice ;

        for(User userOne : group.getListUsers()){
            if (!user.getListFriends().contains(userOne)){
                System.out.println(userOne.getName());	
            }
        }
		
        System.out.println("Choisissez votre ami (nom) :");
        choice = input.nextLine();
        for (User userOne : group.getListUsers()){
            if (choice.equals(userOne.getName())){
                user.addPerson(userOne);
                System.out.println("Utilisateur trouvé et enregistré!");
                break;
            }
        }
        System.out.println("Utilisateur non trouvé !");	
    }
	
    public static int menuDeleteMessage(ArrayList<Message> listMessage, String message){
        int item;
    
        System.out.println(message);
        try {
            item = input.nextInt();
        }catch(Exception e){
            item = 0;
        }
        return item;
    }
	
    public static int menuSelectUser(GroupUser listUser, String message){
        int item = listUser.getListUsers().size() + 1 ;
    
        while(item > listUser.getListUsers().size()){
            System.out.println(message);
			
            try {
                item = input.nextInt();
            }catch(Exception e){
                item = listUser.getListUsers().size() + 1 ;
            }
            input.nextLine();
        }		
        return item;
    }
	
    public static boolean checkAccessAuthorized(int levelUser, int levelAccess ){
        if (levelUser >= levelAccess){
            return true;
        }
            
        return false;
    }	
}