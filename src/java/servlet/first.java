/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
/**
 *
 * @author RAJ SHAH
 */
public class first implements Servlet 
{
    //Life Cycle Methods
    ServletConfig conf;
    public void init(ServletConfig conf)//Server Used This Method To Intialiaze The Servelet Object
    {
        
        System.out.println("Creating Object.....");
        this.conf=conf;
    }
    public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
//    Server Used This TO Process Any Request ..
    {    
        System.out.println("Servicing....");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>This  Is  My Output From Servlet Method</h1>");
        out.println("<h1>Today's Date And Time Is : "+ new Date().toString()+"</h1>");
    }
    public void destroy()
//    Server Used This Method To Destroy Servlet Object
    {
        System.out.println("Going To Destroy Servlet Object...");
    }
    //Non Life Cycle Methods
    public ServletConfig getServletConfig()
    {
        return this.conf;
   
    }
    
    public String getServletInfo()
    {
        return"This Servlet Is created By Raj Shah";
    }
        
}
