
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
        
        ArrayList<Person> pers = new ArrayList();
        pers.add(new Director("drab", "hounet", 1983));
        pers.add(new User("ben", "bronsart", 1979));
        pers.add(new Moderator_level1("adri", "taptap", 1986));
        pers.add(new Moderator_level2("jojo", "la terreur", 1988));
		
        for(int i = 0; i < pers.size(); i++){
            System.out.println("---------------------------------------------\n"
                               + pers.get(i).getClass().getSimpleName() + " :");
            System.out.println(pers.get(i).displayProfil());
            pers.get(i).toPay(1500);
            pers.get(i).toAddSomeOne(new Employee("Paul", "", 1983));
            pers.get(i).toDeleteAnyOne(message);
        }		 
    }
}

