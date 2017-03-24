
import com.dgr.attributes.*;
import com.dgr.dao.*;
import com.dgr.members.*;
import com.dgr.swing.*;

public class Reseau_social {
    public static void main(String[] args) {
        
        GroupPerson listCustomers = new GroupPerson();
        GroupPerson listEmployee = new GroupPerson();
            
        FenConnexion fenConnexion = new FenConnexion(listEmployee, listCustomers);
        fenConnexion.setVisible(true);
        
        DAO<Person> personDAO = new PersonDAO(ResSocConnexion.getInstance());

        for(Person person : personDAO.findAll()){
            System.out.println(person.getName());
        }

    }
}

