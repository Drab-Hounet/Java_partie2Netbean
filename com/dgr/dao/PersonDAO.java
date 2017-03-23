
package com.dgr.dao;

import com.dgr.members.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jerome.LOMBARD
 */
public class PersonDAO extends DAO{

    public PersonDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Person find(int id) {
        Person person = null;

        try {
            ResultSet result = this.connection.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM persons WHERE id = " + id);
            if(result.first()){
                person = new User(result.getString("name"),result.getString("first_name"), result.getInt("birth_year"));         
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }



    
}
