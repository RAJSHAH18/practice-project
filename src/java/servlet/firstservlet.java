/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;

/**
 *
 * @author RAJ SHAH
 */
public class firstservlet implements Servlet 
{
    ServletConfig  conf;
    public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("Creating Servlet object...");
    }
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Servicing.....");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("This Is My First Servlet");
        out.println("<h1>Today Date And Time Is "+new Date().toString() +"</h1>");
    }
    public void destroy()
    {
        System.out.println("Goinfg To Destroy Servlet Object");
    }
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    public String getServletInfo()
    {
        return "This Servlet Is Created By RAJ SHAH";
    }

//    @Override
//    public void  init(ServletConfig sc) throws ServletException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
