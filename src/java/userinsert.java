/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RAJ SHAH
 */
public class userinsert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session;

        try 
        {
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/enotes","root","");
   
            //Checking Connection
            if(con!=null)
            {
                out.println("<script>console.log('Connected');</script>");
            }
            else
            {
                out.println("<script>console.log('notConnected');</script>");
            }
            boolean f=false;
            String name=request.getParameter("fname");
            String email=request.getParameter("myemail");
            String password=request.getParameter("password");
            String qry="SELECT * FROM user WHERE email=?";

            PreparedStatement ps1=con.prepareStatement(qry);
            ps1.setString(1, email);
            ResultSet rs=ps1.executeQuery();
            if(rs.next())
            {
                        session=request.getSession();
                        session.setAttribute("exist", "Email-ID Already Exists");
                        response.sendRedirect("register.jsp");

            }
            
            else
            {      
                        String query="INSERT INTO user(name,email,password) VALUES (?,?,?)";        
                        PreparedStatement ps=con.prepareStatement(query);
                        ps.setString(1, name);
                        ps.setString(2, email);
                        ps.setString(3, password);

                        int i= ps.executeUpdate();

                        if(i==1)
                        {
                            f=true;
                        }


                        if(f)
                    {
                        session=request.getSession();
                        session.setAttribute("reg-sucess", "Registration Sucessfully..");
                        response.sendRedirect("register.jsp");
                    }
            
            
            
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();

            session=request.getSession();
            session.setAttribute("failed-msg", "Something Went Wrong On Server");
            response.sendRedirect("register.jsp");
            out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
