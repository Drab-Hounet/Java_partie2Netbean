
import com.dgr.attributes.*;
import com.dgr.members.*;
import java.util.ArrayList;

public class Reseau_social {
    public static void main(String[] args) {
        
        //initialisation of users
        //InitUsers init = new InitUsers();
        //GroupUser group = init.getGroup();

        //NavGeneral nav = new NavGeneral();
        //nav.menu(group);
        
        Message message = new Message();
        GroupUser listUser = new GroupUser();
        
        Person drab = new Director("drab", "hounet", 1983);
        listUser.getListUsers().add(drab);
        Person ben = new User("ben", "bronsart", 1979);
        listUser.getListUsers().add(ben);
        Person adri = new Moderator_level1("adri", "taptap", 1986);
        listUser.getListUsers().add(adri);
        Person jojo = new Moderator_level2("jojo", "la terreur", 1988);
        listUser.getListUsers().add(jojo);
        
        
        for(int i = 0; i < listUser.getListUsers().size(); i++){
            System.out.println("---------------------------------------------\n"
            + listUser.getListUsers().get(i).getClass().getSimpleName() + " :");
            
            System.out.println(listUser.getListUsers().get(i).displayProfil());
            listUser.getListUsers().get(i).toPay(1500);
            listUser.getListUsers().get(i).toAddSomeOne(new Employee("Paul", "", 1983));
            listUser.getListUsers().get(i).toDeleteAnyOne(message);
        }	

        jojo.toLoopMenu(listUser);
    }
}

