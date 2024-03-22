 <%-- 
    Document   : index.jsp
    Created on : Sep 24, 2022, 12:10:22 PM
    Author     : RAJ SHAH
--%>
 
<%@page import="java.sql.Connection"%>
<%@page import="com.DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <%@include file="allcontent/allcss.jsp"%> 
        <style type="text/css">
            body{
                overflow: hidden;
            }
            .back-img
            {
                background: url("img/1.jpg");
                background-repeat: no-repeat;
                width:100%;
                height:80vh;
                background-size: cover;
            }
                .back-video
                {
                    position: absolute;
                    right:0;
                    bottom:0;
                    z-index:-1;
                }
                @media(min-aspect-ratio:16/9)
                {
                    .back-video
                    {
                        width:100%;
                        height:auto;       
                    }
                }
                 @media(max-aspect-ratio:16/9)
                {
                    .back-video
                    {
                        width:auto;
                        height:100%;       
                    }
                }
                .container-fluid
                {
                    margin-top:450px  ;
                    margin-bottom:unset; 
                }
                h1
                {
                    font-size:60px;
                    margin-top:250px;
                    font-weight:900;
                    /*color:white;*/
                    background: linear-gradient(
                    to right, #f32170, #ff6b08,
                    #cf23cf, #eedd44);
                -webkit-text-fill-color: transparent;
                -webkit-background-clip: text;
                }
               
                
        </style>
        <script>
            history.forward();
        </script>
   </head>
    <body>
        <% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");%>
       <%@include file="allcontent/navbar.jsp"%>
             <!--<div class="container-fluid back-img">-->
                <video autoplay loop muted plays-inline class="back-video">
                    <source src="video1.mp4" type="video/mp4">
                </video>

<!--           <div class="text-center text-white mt-4" id="heading">

                     <a href="login.jsp" class="btn btn-light mt-4"><i class="fa fa-user-circle" aria-hidden="true"></i>Login</a>
                <a href="register.jsp" class="btn btn-light mt-4"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a>  
           </div>     -->
    <center><h1><i class="fa fa-book" aria-hidden="true"></i>E Notes-Save Your Notes</h1></center>
<!--          
             
    <%@include file="allcontent/footer.jsp"%>    

  
    </body>

</html>
