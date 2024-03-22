<%-- 
    Document   : register1
    Created on : Oct 12, 2022, 6:55:14 PM
    Author     : RAJ SHAH
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <%@include file="allcontent/allcss.jsp" %>

        <style>
            *
            {
                margin:0;
                font-family:'Gill Sans','Gills Snas MT',Calibri,'Trebuchet MS',sans-serif;
            }
            body{
                background:linear-gradient(#141e30,#243b55);
                height:100vh;
                width:100%;
            }
            form
            {
                border:1px solid white;
                width:410px;
                height:470px;
                margin-left: 36%;
                margin-top:15vh;
                position:absoulte;
                border-radius:10px;
                background:rgba(0,0,0,.5);
                box-shadow: 0 15px 20px #8e24aa;
            }
            h1
            {
                color:#03e9f4;;
                margin-left:80px;
                margin-top:20px;
            }
            .username input
            {
                margin-left:15px;
                margin-top:30px;
                width:90%;
                outline:none;
                border:none;
                border-bottom: 2px solid #03e9f4;;
                background:transparent;
                color:#03e9f4;;
                font-size:22px;
            }
            .username ::placeholder
            {
                color:#8f8f8f;
                font-size:22px;
                margin-left:8px;
                position: absolute;
                margin-top:-8px;
            }

            .email input
            {
                margin-left:15px;
                margin-top:56px;
                width:90%;
                outline:none;
                border:none;
                border-bottom: 2px solid #03e9f4;;
                background:transparent;
                color:#03e9f4;;
                font-size:22px;
            }
            .email ::placeholder
            {
                color:#8f8f8f;
                font-size:22px;
                margin-left:8px;
                position: absolute;
                margin-top:-8px;
            }
            .password input
            {
                width:90%;
                margin-left: 15px;
                margin-top:60px;
                outline:none;
                border:none;
                border-bottom: 2px solid #03e9f4;;
                background:transparent;
                color:#03e9f4;
                font-size:22px;
            }
            .password ::placeholder
            {
                margin-left:8px;
                position: absolute;
                color:#8f8f8f;
                font-size:22px;


            }
            .password {
                position: relative;
            }

            .password input {
                width: 90%;
                margin-left: 15px;
                margin-top: 60px;
                outline: none;
                border: none;
                border-bottom: 2px solid #03e9f4;
                background: transparent;
                color: #03e9f4;
                font-size: 22px;
                padding-right: 30px; /* Add padding for the toggle icon */
            }
            .toggle-password {
                position: absolute;
                top: 60px; /* Adjust this value to vertically align the icon */
                right: 15px; /* Adjust this value to horizontally position the icon */
                cursor: pointer;
                color: #8f8f8f;
                font-size: 22px;
            }

            .btn2
            {
                margin-top:50px;
                margin-left:140px;
                width:130px;
                height:40px;
                border-radius:10px;
                border: 2px solid #8e24aa;
                background:transparent;
                color:#03e9f4;
                font-size:23px;
                letter-spacing: 2px;
                box-shadow: 0 0 15px #8e24aa;
                border:none;
            }
            .btn2:hover
            {
                box-shadow: 0 0 5px #8e24aa,
                    0 0 25px #8e24aa,
                    0 0 50px #8e24aa,
                    0 0 100px #8e24aa;
                background-color:#8e24aa;
                color:white;
                transition: all 0.8s ease-in-out;
                cursor:pointer;
            }
        </style>

    </head>
    <body>
        <%     response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");


        %> 
        <%@include file="allcontent/navbar.jsp"%>

        <form action="userinsert" method="post" autocomplete="off">
            <h1>REGISTRATION</h1>
            <%                String nm = (String) session.getAttribute("name");
                if (nm != null) {
                    response.sendRedirect("home.jsp");
                }

                String exist = (String) session.getAttribute("exist");
                if (exist != null) {

            %>
            <div class="alert alert-danger" role="alert"><%=exist%></div>
            <style>
                .username input
                {
                    margin-top: 15px;
                }
                .email input
                {
                    margin-top:44px;
                }
                .password input
                {
                    margin-top:38px;
                }
            </style>
            <%
                    session.removeAttribute("exist");

                }


            %>


            <%                String failedmsg = (String) session.getAttribute("failed-msg");
                if (failedmsg != null) {
            %>
            <div class="alert alert-danger" role="alert"><%=failedmsg%></div>
            <style>
                .username input
                {
                    margin-top: 15px;
                }   
                .email input
                {
                    margin-top:44px;
                }
                .password input
                {
                    margin-top:38px;
                }
            </style>
            <%
                    session.removeAttribute("failed-msg");

                }


            %>

            <%                String reqmsg = (String) session.getAttribute("reg-sucess");
                if (reqmsg != null) {
            %>
            <div class="alert alert-success" role="alert"><%=reqmsg%>Login <a href="login.jsp">Click</a></div>   
            <style>
                .username input
                {
                    margin-top: 15px;
                }
                .email input
                {
                    margin-top:44px;
                }
                .password input
                {
                    margin-top:38px;
                }
            </style>
            <%
                    session.removeAttribute("reg-sucess");
                }

            %>
            <div class="username"> 
                <input  type="text" placeholder="Username" name="fname" required />
            </div>
            <div class="email"> 
                <input type="email" placeholder="Email" name="myemail" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" required />
            </div>

            <div class="password"> 
                <input type="password" name="password" id="password" placeholder=" Enter Password" required>
                <span class="toggle-password" onclick="togglePasswordVisibility()">&#x1F441;</span>
            </div>
            <button type="submit" class="btn2">REGISTER</button>

        </form>
        <script>
            function togglePasswordVisibility() {
                var passwordInput = document.getElementById("password");
                var toggleIcon = document.querySelector(".toggle-password");

                if (passwordInput.type === "password") {
                    passwordInput.type = "text";
                    toggleIcon.innerHTML = "&#x1F440;"; // Show an "eye closed" icon
                } else {
                    passwordInput.type = "password";
                    toggleIcon.innerHTML = "&#x1F441;"; // Show an "eye" icon
                }
            }
        </script>
        
    </body>
</html>
