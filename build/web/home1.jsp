
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%-- 
    Document   : home1
    Created on : Oct 20, 2023, 9:28:01 AM
    Author     : RAJ SHAH
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-notes</title>
        <link href="https://cdn.jsdelivr.net/npm/remixicon@3.5.0/fonts/remixicon.css" rel="stylesheet">
        <%@include file="allcontent/allcss.jsp" %>
        <style>
            * {
                overflow: hidden;
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }

            html,
            body {
                width: 100%;
                height: 100%;
            }

            #main {
                width: 100vw;
                height: 100vh;
            }

            #card {
                width: 100vw;
                height: 80vh;
                display:flex;
                align-items: center;
                justify-content: space-evenly;
                /* margin-top: -120px; */
            }

            #card1 {
                height: 50vh;
                width: 30vw;
                /* background-color: black; */
                border: 5px solid purple;
                padding-top: 60px;
            }
            #card1 .icon1 i{
                font-size: 90px;
                margin-left: 180px;

                padding-top: 400px;

            }
            #card1 .icon1 h1{
                font-size: 45px;
                margin-left: 120px;
                margin-top: 10px;
            }

            #card2 {
                height: 50vh;
                width: 30vw;
                padding-top: 60px;
                /* background-color: red; */
                border: 5px solid purple;
            }
            #card2 .icon2 i{
                font-size: 90px;
                margin-left: 180px;

                padding-top: 400px;

            }
            #card2 .icon2 h1{
                font-size: 45px;
                margin-left: 120px;
                margin-top: 10px;
            }
            button{
                width: 15vw;
                height: 7vh;
                padding: 3px 3px;
                font-size: 25px;
                font-weight: 500;
                margin-left: 635px;
                margin-top:-90px ;
                border: 3px solid purple;
                border-radius: 10px;

            }
            #foot
            {
                margin-top: 126px;
                background-color:black;
                color:white;
                font-weight:900;
                margin-bottom: 0px;
            }
            #foot:hover
            {
                color:#F54952;
            }
        </style>
    </head>
    <body>
<%
        if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
        Connection con = null;
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/enotes","root","");
                
             
            } catch (Exception e) {
                e.printStackTrace();
                out.println("<script>alert('Something went Wrong On Server')</script>");
            }
        
            
    
%>   
        
        
        <%@include file="allcontent/navbar.jsp"%>
        <div id="main">
            <div id="card">
                <div id="card1">
                    <div class="icon1"><i class="ri-user-3-line"></i>
                        <h1>Total Users</h1>
                        <%
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("SELECT COUNT(*) as total FROM user WHERE role NOT LIKE 'admin'");
                            while(rs.next())
                            {
                        %>
                                <center> <h3 style="color:red;font-weight: bolder"><%=rs.getInt("total")%></h3></center>

                        <%
                            }
                            
                            
                            
                        %>
                        
                    </div>

                </div>
                <div id="card2">
                    <div class="icon2"><i class="ri-book-read-line"></i>
                        <h1>Total Notes</h1>
                         <%
                            
                            rs = st.executeQuery("SELECT COUNT(uid) as total FROM post");
                            while(rs.next())
                            {
                        %>
                                <center> <h3 style="color:red;font-weight: bolder"><%=rs.getInt("total")%></h3></center>

                        <%
                            }
                            
                            
                            
                        %>
                    </div>
                </div>
            </div>
                        <a href="users.jsp" ><button style="cursor: pointer">ALL USERS</button></a>
        </div>
        <div class="container-fluid " id="foot">
            <p class="text-center "> Note: Any Errors Occur Then Contact Codewithxyz@gmail.com. Designed And Developed By xyz </p>
            <p class="text-center ">All Rights Reversed @Codewith-2022-23</p>
        </div>
    </body>
</html>
