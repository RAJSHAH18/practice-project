<%-- 
    Document   : edit
    Created on : Oct 10, 2022, 3:27:58 AM
    Author     : RAJ SHAH
--%>
<%@page import="java.sql.*"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
        <%@include file="allcontent/allcss.jsp" %>

    </head>
    <body>
        
         <%
//            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
            
            if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
    
        %>
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
        int id=Integer.parseInt(request.getParameter("id"));
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT *  FROM post WHERE id="+id);
        while(rs.next())
        {
    %>
        <div class="container-fluid p-0">
            <%@include file="allcontent/navbar.jsp"%>
             <h1 class="text-center">EDIT YOUR NOTES</h1>
             <div class="container">
                <div class="row">
                    <div class="col-md-12">
                    
                        <form  action="#" method="POST" autocomplete="off">
                    
                            <div class="form-group">
                                    <label for="title">TITLE </label>
                                    <input type="text" class="form-control" id="title" name="title" value="<%= rs.getString("title")%>">
                            </div>
                        
                             <div class="form-group">
                                <label for="content">CONTENT</label>
                                <textarea rows="9" cols="" name="content" id="content" class="form-control" ><%= rs.getString("content")%></textarea>
                            </div>     
                        
                            <div class="container text-center mt-4 mb-5">
                        
                                <button type="submit" class="btn btn-primary"><strong>UPDATE NOTES</strong></button>
                            
                            </div>
                        </form>
                        
                </div>
                
            </div>
                 
        </div>
            
        </div>

<%
       }
       
       String title=request.getParameter("title");
       String content=request.getParameter("content");
        boolean f=false;
        if(title!=null && content!=null)
        {
                   String query="UPDATE post SET title=? , content=? WHERE id=?";
                   out.println(query);
                   out.println(title);
                   out.println(content);

                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,title );
                ps.setString(2,content);
                ps.setInt(3,id);
                int i= ps.executeUpdate();
                
                if(i==1)
                {
                    f=true;
                }
    
                if(f)
                {
                    session.setAttribute("update", "Notes Updated SuccessFully");
                    response.sendRedirect("shownotes.jsp");
                    
                }
                else
                {
                    session.setAttribute("notupdate","Not Update" );
                    response.sendRedirect("edit.jsp");
    
                }

        }
%> 
            
        <%@include file="allcontent/footer.jsp" %>        
    </body>
</html>
