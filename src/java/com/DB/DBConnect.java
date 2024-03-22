/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RAJ SHAH
 */
public class DBConnect 
{
    private static Connection conn;
    public static Connection getConn()
    {
        try
        {
            if(conn==null)
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost/enotes","root","");
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
}
