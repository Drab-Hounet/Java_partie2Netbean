
package com.dgr.dao;

import com.dgr.members.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jerome.LOMBARD
 */
public class PersonDAO extends DAO{

    public PersonDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Person find(String pName , String pFirst_name){
        //find any user who exist in db
        Person person = null;
        
        String query =   "SELECT * FROM persons ";
        query += "WHERE name = ?";
        query += " AND first_name = ?";
            
        PreparedStatement prepare;
        try {
            prepare = connection.prepareStatement(query);
            prepare.setString(1, pName);
            prepare.setString(2, pFirst_name);
            ResultSet result = prepare.executeQuery();
            while(result.next()){
                switch(result.getString("role")){
                    case "USER":
                        person = new User(result.getString("name"),result.getString("first_name"), result.getInt("birth_year"));     
                        break;
                    case "MODERATOR_LEVEL1":
                        person = new Moderator_level1(result.getString("name"),result.getString("first_name"), result.getInt("birth_year"), result.getInt("salary"));     
                        break;
                    case "MODERATOR_LEVEL2":
                        person = new Moderator_level2(result.getString("name"),result.getString("first_name"), result.getInt("birth_year"), result.getInt("salary"));     
                        break;
                    case "DIRECTOR":
                        person = new Director(result.getString("name"),result.getString("first_name"), result.getInt("birth_year"), result.getInt("salary"));     
                        break;
                    default:
                }    
            }   
        }catch (Exception ex) {          
        }
        return person;
    }
    
    @Override
    public boolean create(String name, String first_name, int birth_year, String role, int salary){
        
        String query =   "INSERT INTO persons (name, first_name, birth_year, role, salary) VALUES( ?, ?, ?, ?, ?)";
        PreparedStatement prepare;
        try {
            prepare = connection.prepareStatement(query);
            prepare.setString(1, name);
            prepare.setString(2, first_name);
            prepare.setInt(3, birth_year);
            prepare.setString(4, role);
            prepare.setInt(5, salary);
            
            try{
                prepare.executeUpdate();
                return true;
            }catch(SQLIntegrityConstraintViolationException e){
                System.out.println("erreur");
                return false;
            }
        } catch (Exception ex){
            return false;
        }   
    }

    @Override
    public ArrayList findAll() {
        ArrayList<Person> listUsers = new ArrayList();
        String query =   "SELECT * FROM persons ";
        try {
            ResultSet result = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(query);
            while(result.next()){
                listUsers.add(this.find(result.getString("name"),result.getString("first_name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUsers;
    }   
}
