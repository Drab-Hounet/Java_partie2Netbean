

/**
 *
 * @author jerome.lombard
 */

public class Reseau_social {
    public static void main(String[] args) {
        
        //initialisation of users
        InitUsers init = new InitUsers();
        GroupUser group = init.getGroup();

        NavGeneral nav = new NavGeneral();
        nav.menu(group);
    }

}

