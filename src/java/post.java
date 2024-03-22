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
public class post extends HttpServlet {

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
        HttpSession session=request.getSession();
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

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
                boolean f=false;
                  int uid=Integer.parseInt(request.getParameter("uid"));
                  String title=request.getParameter("title");
                  String content=request.getParameter("content");

                String query="INSERT INTO post(title,content,uid) VALUES (?,?,?)";

                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1, title);
                ps.setString(2, content);
                ps.setInt(3, uid);
                int i= ps.executeUpdate();

                if(i==1)
                {
                    f=true;
                }
                
                if(f)
                {
//                    out.println("<script>");
//                    out.println("alert('Notes Added Successfully');");
//                    out.println("location.replace('addnotes.jsp');");
                    session.setAttribute("add", "Notes Added Successfully");
                     response.sendRedirect("addnotes.jsp");
//                    out.println("</script>");
                }
                else
                {
                    session.setAttribute("fail", "Notes Failed TO Add");
                    response.sendRedirect("addnotes.jsp");
                }
                        
            
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
                session.setAttribute("failed", "Something Went Wrong On Server");
                response.sendRedirect("addnotes.jsp");
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
