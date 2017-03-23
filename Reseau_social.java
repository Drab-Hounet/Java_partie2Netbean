
import com.dgr.attributes.*;
import com.dgr.dao.*;
import com.dgr.members.*;
import com.dgr.swing.*;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reseau_social {
    public static void main(String[] args) {
        
        GroupPerson listCustomers = new GroupPerson();
        GroupPerson listEmployee = new GroupPerson();
        
        Person drab = new Director("drab", "hounet", 1983, 4000);
        listEmployee.getListUsers().add(drab);
        
        Person adri = new Moderator_level1("adri", "taptap", 1986, 50);
        listCustomers.getListUsers().add(adri);
        
        Person ben = new User("ben", "oncle", 1979);
        listCustomers.getListUsers().add(ben);
        
        Message message = new Message("coucou!!!", ben, adri);
        ben.addMessage(message);
        adri.addMessage(message);

        Person jojo = new Moderator_level2("jojo", "la terreur", 1988, 100);
        listCustomers.getListUsers().add(jojo);
            
            //FenConnexion fenConnexion = new FenConnexion(listEmployee, listCustomers);
            //fenConnexion.setVisible(true);
        try {
            //Création d'un objet Statement
            Statement state = ResSocConnexion.getInstance().createStatement();
            
            ResultSet result = state.executeQuery("SELECT * FROM persons");
            
//            while(result.next()){   
//                System.out.println(result.getString("name"));
//                System.out.println(result.getString("first_name"));
//                System.out.println(result.getString("birth_year"));
//                System.out.println(result.getString("role"));
//                System.out.println(result.getString("salary"));
//            }   
            
        } catch (Exception ex) {
            Logger.getLogger(Reseau_social.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DAO<Person> personDAO = new PersonDAO(ResSocConnexion.getInstance());
        
        Person person = personDAO.find(1);
        System.out.println( person.getName()+ "  - " + person.getFirst_name()+ " " + person.getBirthYear());

    }
}

