<%-- 
    Document   : navbar1.jsp
    Created on : Sep 25, 2022, 8:51:44 PM
    Author     : RAJ SHAH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>

        #menu{
            display: flex;
            list-style: none;
            justify-content: center;  
            align-items: center;
            gap: 50px;
            padding: 0;
        }
        
        .nav-item{
            color: black;
            font-family: var(--primary-font);
            font-size: 18px;    
            text-decoration: none;
            position: relative; 
        }
        
        .nav-item::after{
            content: '';
            position: absolute;
            left: 0;    
            bottom: 0;
            width: 100%;
            height: 2px;
            background-color: black;
            
            transform: scaleX(0);
            transform-origin: right;
            transition: transform 300ms ease-in-out;
        }
        
        .nav-item:hover{
            font-size: 18px;
            text-decoration: none;
        }
        </style>
    <body>
    <nav class="nav-bar">
        <ul id="menu">
            <li> 
                <a href="index.jsp" class="nav-item">Home</a>
            </li>
            <li>
                <a href="menu.jsp" class="nav-item">Menu</a>
            </li>
            <li>
                <a href="login.jsp" class="nav-item">Login</a>
            </li>
        </ul>
    </nav>    
    </body>
</html>
