/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlet;

/**
 *
 * @author RAJ SHAH
 */

import com.DAO.UserDAO;
import com.DB.DBConnect;
import com.User.UserDetails;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out=response.getWriter();
        String name=request.getParameter("fname");
        String email=request.getParameter("myemail");
        String password=request.getParameter("password");
        
        UserDetails us=new UserDetails();
        us.setName(name);
        us.setEmail(email);
        us.setPassword(password);
        
        UserDAO d=new UserDAO(DBConnect.getConn());
        boolean f=d.adduser(us);
        
        HttpSession session;
        if(f)
        {
            session=request.getSession();
            session.setAttribute("reg-sucess", "Registration Sucessfully..");
            response.sendRedirect("register.jsp");
        }
        else
        {
            session=request.getSession();
            session.setAttribute("failed-msg", "Somethinng Went Wrong In Server");
            response.sendRedirect("register.jsp");
        }
    }
}
