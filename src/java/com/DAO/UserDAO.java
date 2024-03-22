/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;
import com.User.UserDetails;
import java.sql.*;

/**
 *
 * @author RAJ SHAH
 */
public class UserDAO 
{
    private Connection conn;

    public UserDAO(Connection conn) 
    {
        super();
        this.conn = conn;
    }

    public UserDAO() 
    {
         //To change body of generated methods, choose Tools | Templates.
    }
    public boolean adduser(UserDetails us)
    {
        boolean f=false;
        try
        {
       
            String query="INSERT INTO user(name,email,password) VALUES (?,?,?)";
        
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPassword());
            int i= ps.executeUpdate();
            
            if(i==1)
            {
                f=true;
            }
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f; 
    }
}
