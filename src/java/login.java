/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RAJ SHAH
 */
public class login extends HttpServlet {

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
        HttpSession session;
//        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

        try (PrintWriter out = response.getWriter()) 
        {
            try
            {
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/enotes","root","");
            
                //Checking Connection
//            if(con!=null)
//            {
//                out.println("Connected");
//            }
//            else
//            {
//                out.println("Not Connected");
//            }
                String name="",myemail="",mypassword="",role="";
                int id=0;
                boolean f=false;
                String email=request.getParameter("myemail");
                String password=request.getParameter("password");
                
                String query="SELECT * FROM user WHERE email=? AND password=?";

                  PreparedStatement ps=con.prepareStatement(query);

                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs=ps.executeQuery();
                    
                    if(rs.next())
                    {
                         id=rs.getInt("id");
                         name=rs.getString("name");
                         myemail=rs.getString("email");
                         mypassword=rs.getString("password");
                         role=rs.getString("role");
                         f=true;
                    }
                    
                    if(f)
                    {
                        session=request.getSession();
                        session.setAttribute("id",id);
                        session.setAttribute("name",name);
                        session.setAttribute("email",myemail);
                        session.setAttribute("password",mypassword);
                        session.setAttribute("role",role);
                        if(role.equals("admin")){
                                response.sendRedirect("home1.jsp");

                        }
                        else{
                                response.sendRedirect("home.jsp");

                        }
                    
                    }
                    else
                    {
                        session=request.getSession();
                        session.setAttribute("login-failed", "INVALID EMAIL AND PASSWORD");
                        response.sendRedirect("login.jsp");
                    }
                    
                    

                
            }
            catch(Exception e)
            {
                e.printStackTrace();
                session=request.getSession();
                session.setAttribute("failed","Something Went Wrong On Server" );
                response.sendRedirect("login.jsp");
            }
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
