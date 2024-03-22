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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RAJ SHAH
 */
public class update extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
           try 
            {
                HttpSession session;
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student result system","root","");
//                    if(con!=null)
//                    {
//                        out.println("Connected");
//                    }
                     int sid=Integer.parseInt(request.getParameter("rollno"));
                     String name=request.getParameter("name");
                     double cgpa=Double.parseDouble(request.getParameter("cgpa"));
                     int dept=Integer.parseInt(request.getParameter("dept"));
                     
                     String query="UPDATE FROM student_results  SET s_name=?,s_cgpa=?,d_id=? WHERE s_id="+sid;
                     PreparedStatement ps=con.prepareStatement(query);
                     
                     ps.setString(1, name);
                     ps.setDouble(2, cgpa);
                     ps.setInt(3,dept );
                     
                     int i=ps.executeUpdate();
                     
                     if(i>0)
                     {
                        session=request.getSession();
                        session.setAttribute("UPDATED", "UPDATED SUCCESSFULLY");
                        response.sendRedirect("home.jsp");
                     }
                     else
                     {
                        session=request.getSession();
                        session.setAttribute("failed", "UPDATED FAILED");
                        response.sendRedirect("home.jsp");
                     }
            
            
            
            }   
            catch (Exception e) 
            {
                out.println(e.getMessage());
               
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
