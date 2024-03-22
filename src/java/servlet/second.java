/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import java.io.*;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 *
 * @author RAJ SHAH
 */
public class second extends GenericServlet 
{
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("This Is My Second Servlet Using Generic Servlet");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("Servicing.....");
    }

    
    
        
}
