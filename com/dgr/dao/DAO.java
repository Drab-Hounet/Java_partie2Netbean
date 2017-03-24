
package com.dgr.dao;

import com.dgr.members.*;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jerome.LOMBARD
 * @param <T>
 */
public abstract class DAO<T> {
    protected Connection connection = null;
    
    public DAO(Connection connection){
        this.connection = connection;
    }
    
    public abstract T find(String name, String first_name);
    public abstract ArrayList<Person> findAll();
    public abstract boolean create(String name, String first_name, int birth_year, String role, int salary);
}
