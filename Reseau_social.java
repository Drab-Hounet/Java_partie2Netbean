
import com.dgr.attributes.*;
import com.dgr.members.*;
import com.dgr.menu.*;

public class Reseau_social {
    public static void main(String[] args) {
                
        Message message = new Message();
        GroupPerson listCustomers = new GroupPerson();
        GroupPerson listEmployee = new GroupPerson();
        
        Person drab = new Director("drab", "hounet", 1983, 4000);
        listEmployee.getListUsers().add(drab);
        
        Person ben = new User("ben", "oncle", 1979);
        listCustomers.getListUsers().add(ben);
        ben.addMessage(message);
        Person adri = new Moderator_level1("adri", "taptap", 1986, 50);
        listCustomers.getListUsers().add(adri);
        Person jojo = new Moderator_level2("jojo", "la terreur", 1988, 100);
        listCustomers.getListUsers().add(jojo);
        
        
        Connexion connexion = new Connexion(listEmployee, listCustomers);
        connexion.display();
        
    }
}

