
package com.dgr.dao;

import java.sql.Connection;

/**
 *
 * @author Jerome.LOMBARD
 */
public abstract class DAO<T> {
    protected Connection connection = null;
    
    public DAO(Connection connection){
        this.connection = connection;
    }
    
    public abstract T find(int id);
   
}
