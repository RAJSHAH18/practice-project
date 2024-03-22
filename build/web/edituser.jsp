<%-- 
    Document   : edituser
    Created on : Oct 13, 2022, 9:48:08 AM
    Author     : RAJ SHAH
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UserEdit Page</title>
        <style>
            .input1
            {
                border:0;
                width:80%;
                
            }
            .heading
            {
                margin:30px;
                text-align:center;
            }
            table
            {
                justify-content: center;
                align-items: center;
            }
            td{
                padding-left: 10px;
            }
            th{
                text-align: center;
            }
        </style>
        <%@include file="allcontent/allcss.jsp" %>

    </head>
    <body>
        <%
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
            
            if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
        %>
        <%@include file="allcontent/navbar.jsp"%>

        <h1 class="heading">USER DETAILS</h1>
        <form action="" method="post" autocomplete="off"> 
    <center>
    <table border="2px" width="80%" cellspacing="0" cellpadding="10px">
        
        <tr>
            <th width="4%">ID</th>
            <th width="5%">NAME</th>
            <th width="10%">EMAIL</th>
            <th width="10%">PASSWORD</th>
            <th width="5%">ROLE</th>
            <th width="4%">NO.OF NOTES</th>
            <th width="5%">OPERATION</th>

        </tr>
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
       int id=Integer.parseInt(request.getParameter("id"));
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM user WHERE id="+id);
        String select="";
        while(rs.next())
        {
            
        
        %>
        <tr>
            <td><%=rs.getInt("id")%> </td>
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("email")%></td>
            <td><input class="input1" type="password" value="<%=rs.getString("password")%>"></td>
            <td>
                <select name="roles">
                    <%
                        if(rs.getString("role").equals("user"))
                        {
                           select="SELECTED"; 
                    %>
                                <option <%= select %>value="<%= rs.getString("role")%>"><%= rs.getString("role").toUpperCase() %></option>

                    <%
                        }   
                        if(rs.getString("role").equals("admin"))
                        {
                            select="SELECTED";
                    %>
                            <option <%= select %>value="<%= rs.getString("role")%>"><%= rs.getString("role").toUpperCase() %></option>

                    <%
                        }
                       if(!(rs.getString("role").equals("admin")))
                        {
                            select="";
                    %>
                            <option <%= select %>value="admin"><%= "admin".toUpperCase() %></option>

                    <%
                        } 
                       if(!(rs.getString("role").equals("user")))
                        {
                            select="";
                    %>
                            <option <%= select %>value="user"><%= "user".toUpperCase() %></option>

                    <%
                        } 

                    %>
                    <!--<option value="<%= rs.getString("role")%>"><%= rs.getString("role").toUpperCase() %></option>-->
                </select>
                </td>
            <%
                    Statement stm=con.createStatement();
                
                   ResultSet cnt=stm.executeQuery("SELECT count(*) AS total FROM post WHERE uid="+rs.getInt("id"));
                   if(cnt.next())
                   {
            %>
                   
                    <td><%= cnt.getInt("total")%></td>

            <%
                   }
   
            %>
            
            <!--<td> <a href="updateuser?id=<%= rs.getInt("id")%>" class="btn btn-primary px-4" ><strong>EDIT</strong></a></td>-->
        </tr>


        <%
            
            }
        %>
        </table>
          <div class="container text-center mt-4 mb-5">
                  
                <button type="submit" class="btn btn-primary"><strong>UPDATE</strong></button>
                            
        </div>
    </center>
    </form>
    <%
        boolean f=false;
        String rl=request.getParameter("roles");
        if(rl!=null)
        {
                   String query="UPDATE user SET role=?  WHERE id=?";
//                   out.println(query);
//                   out.println(title);

                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,rl);
                ps.setInt(2,id);
                int i= ps.executeUpdate();
                
                if(i==1)
                {
                    f=true;
                }
    
                if(f)
                {
                    session.setAttribute("update", "Role Updated SuccessFully");
//                    session.removeAttribute("back");
                    response.sendRedirect("users.jsp");
                    
                }
                else
                {
                    session.setAttribute("notupdate","Not Update" );
                    response.sendRedirect("edituser.jsp");
    
                }

        }
    %>
    </body>
    
</html>
