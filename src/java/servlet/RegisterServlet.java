/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
     
/**
 *
 * @author RAJ SHAH
 */
public class RegisterServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h2>WELCOME TO REGISTER SERVLET</h2>");
        String name=request.getParameter("myname");
        String email=request.getParameter("myemail");
        String password=request.getParameter("mypassword");
        String gender=request.getParameter("mygender");
        String course=request.getParameter("mycourse");
        String condition=request.getParameter("condition");
        
//        if(condition.equals("checked"))
          out.println(condition);
        if(condition !=null)
        {
            if(condition.equals("checked"))
            {
                out.println("<h2>Name : "+name+"</h2>");
                out.println("<h2>Email : "+email+"</h2>");
                out.println("<h2>Password : "+password+"</h2>");
                out.println("<h2Gender : "+gender+"</h2>");
                out.println("<h2>Course : "+course+"</h2>");
                
//                RequestDispatcher rd=request.getRequestDispatcher("succes");
//                rd.forward(request, response);
            }
            else
            {
                out.println("<h2>YOU HAVE NOT ACCEPT TERMS AND CONDITIONS</h2>");
                
            }
        }
        
        else
        {
            out.println("<h2>YOU HAVE NOT ACCEPT TERMS AND CONDITIONS</h2>");

            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request,response);

        }
            
    } 
}
