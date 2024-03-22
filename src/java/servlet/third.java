/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import java.util.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
/**
 *
 * @author RAJ SHAH
 */
public class third extends HttpServlet 
{
   protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {
       System.out.println("I AM In DoGet Method");
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("This Is My Third Servlet");
       out.println(new Date().toString());
   }
}
