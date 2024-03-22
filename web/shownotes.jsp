<%-- 
    Document   : shownotes
    Created on : Oct 10, 2022, 2:10:00 AM
    Author     : RAJ SHAH
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Notes</title>
        <%@include file="allcontent/allcss.jsp" %>

    </head>
    <body>
        <%
//            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
             if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
            String notupdate=(String)session.getAttribute("notupdate");

             if(notupdate!=null)
            {
                out.println("<script>alert('"+notupdate+"')</script>");
                session.removeAttribute("notupdate");

            }
            String update=(String)session.getAttribute("update");

                
        %>
        
    <%@include file="allcontent/navbar.jsp"%>
    <%
        Connection con=null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/enotes","root","");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            out.println("<script>alert('Something went Wrong On Server')</script>");

        }
//        if(con!=null)
//        {
//            out.println("Connected");
//        }

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM post WHERE uid="+session.getAttribute("id")+" order by id DESC");
    
         if(update!=null)
            {
//                out.println("<script>alert('"+notupdate+"')</script>");
    %>
                    <div class="alert alert-success" role="alert"><%=update%></div>

    <%
                session.removeAttribute("update");
            }

    %>
    <%
            String delete=(String)session.getAttribute("delete");

             if(delete!=null)
            {
                out.println("<script>alert('"+delete+"')</script>");
                session.removeAttribute("delete");
//                out.println("<script>alert('"+notupdate+"')</script>");
            }
    %>
                                
    
    <div clas="container">
        <h1 class="text-center" style="font-weight:900;color: #F54952">ALL NOTES</h1>
        <div class="row">
            <div class="col-md-12">
    <%
        int count = 0;
        while(rs.next())
        {
            
            count++;
                
    %>
                
                <div class="card mt-3">
                    <img src="img/note.jpg" alt="enotes" class="card-img-top mt-3 mx-auto" style="max-width:100px">
                    <div class="card-body">
                        <h5 class="card-title"><%=rs.getString("title")%></h5>
                        <p><%=rs.getString("content")%></p>
                        <p>
                            <strong class="text-success">Published By : <%= session.getAttribute("name")%></strong><br>
                            <strong class="text-primary"></strong>
                        </p>
                        <p>
                            <strong class="text-success">Published Date: <%= rs.getDate("date") %></strong><br>
                            <strong class="text-primary"></strong>
                        </p>
                        <div class="container text-center mt-2">
                            
                            <a href="delete?id=<%= rs.getInt("id")%>" class="btn btn-danger" onclick="return con()"><strong>DELETE</strong></a>
                            <a href="edit.jsp?id=<%= rs.getInt("id")%>" class="btn btn-primary" ><strong>EDIT</strong></a>
                            
                        </div>
                    </div>
                </div>
<%
    
        }
        if(count == 0){
%>
<center>
<div style="display: inline-block; border:3px solid black;background-color: black;color:red;margin-top:200px;border-radius: 10px">
        <h1> NO NOTES</h1>
</div>
</center>

<%
        }
                    
%>
            </div>
        </div>
        
    </div>
            <script>
                  function con()
                    {
                       return confirm("Do You Want To Delete This ?");
                    }
            </script>
                
    </body>
</html>
