<%-- 
    Document   : users
    Created on : Oct 13, 2022, 1:51:55 AM
    Author     : RAJ SHAH
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
        <%@include file="allcontent/allcss.jsp" %>
        <style>
            .input1
            {
                border:0;
                width:80%;
                
            }
            h1{
                margin: 30px;
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
/*            .btn2
        {
            margin-top:50px;
            margin-left:140px;
            width:110px;
            height:40px;
            border-radius:10px;
            border: 2px solid #FD1C03;
            background: #111;
            color:#FD1C03;
            font-size:23px;
            box-shadow: 0 0 15px #FD1C03;
            border:none;
        }
        .btn2:hover
        {
            box-shadow: 0 0 5px #FD1C03,
            0 0 25px #FD1C03,
            0 0 20px #FD1C03,
            0 0 10px #FD1C03;
            background-color:#FD1C03;
            color:white;
            transition: all 0.8s ease-in-out;
            cursor:pointer;
        }
        .btn3
        {
            margin-top:50px;
            margin-left:140px;
            width:100px;
            height:100px;
            border-radius:10px;
            border: 2px solid #39FF14;
            background: #111;
            color:#39FF14;
            font-size:23px;
            box-shadow: 0 0 15px #39FF14;
            border:none;
        }
        .btn3:hover
        {
            box-shadow: 0 0 5px #39FF14,
            0 0 25px #39FF14,
            0 0 20px #39FF14,
            0 0 10px #39FF14;
            background-color:#39FF14;
            color:white;
            transition: all 0.8s ease-in-out;
            cursor:pointer;
        }
        a 
        {
            width:100px;
        }
#bt:hover
{
        color: white;

}*/
        </style>
    </head>
    <body>
            <%@include file="allcontent/navbar.jsp"%>
        <%
//            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
             if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
//             if(session.getAttribute("back")==null)
//            {
////                session.setAttribute("error","Please Login First");
//                response.sendRedirect("users.jsp");
//                
//                
//            }
             
             
            String notupdate=(String)session.getAttribute("notupdate");

             if(notupdate!=null)
            {
                out.println("<script>alert('"+notupdate+"')</script>");
                session.removeAttribute("notupdate");

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
            
            String update=(String)session.getAttribute("update");
            if(update!=null)
            {
//                out.println("<script>alert('"+notupdate+"')</script>");
    %>
                    <div class="alert alert-success" role="alert"><%=update%></div>

    <%
                session.removeAttribute("update");
            }
    %>
        <h1>USER DETAILS</h1>
    <center>
    
    <table border="2px" width="80%" cellspacing="0" cellpadding="10px">
        
        <tr>
            <th width="4%">ID</th>
            <th width="5%">NAME</th>
            <th width="10%">EMAIL</th>
            <th width="10%">PASSWORD</th>
            <th width="5%">ROLE</th>
            <th width="4%">NO.OF NOTES</th>
            <th width="8%" colspan="2">OPERATION</th>
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
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM user WHERE name not LIKE 'admin'");
        
        while(rs.next())
        {
            
        
        %>
        <tr>
            <td><%=rs.getInt("id")%> </td>
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("email")%></td>
            <td><input class="input1" type="password" value="<%=rs.getString("password")%>" readonly></td>
       
            <td><%=rs.getString("role")%></td>
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
            <td align="center"> <a href="deleteuser?id=<%= rs.getInt("id")%>" class="btn btn-danger" onclick="return con()"><strong>DELETE</strong></a></td>
                <!--<a href="edituser.jsp?id=" class="btn btn-primary px-4" ><strong>EDIT</strong></a></td>-->
                         
        </tr>
        
        <%
            
            }
        %>
        </table>
    </center>
          <script>
                  function con()
                    {
                       return confirm("Do You Want To Delete This ?");
                    }
            </script>
    </body>
</html>
