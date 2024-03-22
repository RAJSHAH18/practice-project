<%-- 
    Document   : login.jsp
    Created on : Sep 24, 2022, 12:11:31 PM
    Author     : RAJ SHAH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    
        <%@include file="allcontent/allcss.jsp" %>
        <style>
               *{
                   padding: 0;
                   margin: 0;
                   box-sizing: border-box;
                }
                body
                {
                    overflow: hidden;
                }
                
                .register 
                {
                   font-family: sans-serif;
                   justify-content: center;
                   min-height: 100vh;
                   background: #0c0116;
                   align-items: center;
                   
                }
                .container-fluid
                {
                    margin-top:68px  ;
                    margin-bottom:unset; 
                }


                .form 
                {

                   margin:auto;
                   margin-top:65px;
                   margin-left:auto;
                   margin-right:auto;
                   margin-bottom:53px;
                   position: relative;
                   background: #0c0116;
                   overflow: hidden;
                   box-shadow: 0px 0px 10px 0px rgb(116, 119, 114);
                   border-radius: 5px;
                   padding: 50px 30px;
                   width: 400px;
                   height:410px;

                }

                .form-inner {

                   background: #0c0116;
                   
                   height: 98%;
                   width: 98%;

                }

                .content {
                   width: 100%;
                   padding: 15px;
                   height: 100%;

                }
                .form-inner h2 {

                   text-align: center;
                   padding-top: 5px;
                   font-size: 25px;
                   color: #d7a3d7;
                }
                .input 
                {
                   display: block;
                   padding: 12px 15px;
                   border: 1.5px solid rgb(109, 87, 121);
                   outline: none;
                   background: #19052c;
                   color: white;
                   width: 100%;
                   left: 50%;
                   border-radius: 10px;
                   margin-top: 20px;
                }
                .btn1 {
                   margin-top: 40px;    
                   width: 100%;
                   cursor: pointer;
                   color: white;
                   border: none;
                   font-size: 18px;
                   border-radius: 10px;
                   transition: 0.4s;
                   padding: 12px;
                   outline: none;
                   background: #800080;
                }
                .btn1:hover {
                   background: #c907c9;
                }

                .form span {
                   height: 50%;
                   width: 50%;
                   position: absolute;
                }

                .form span:nth-child(1) {
                   background: #ffda05;
                   animation: 5s span1 infinite linear;
                   animation-delay: 1s;
                   top: 0;
                   left: -48%;
                }
                .form span:nth-child(2) {
                   background: #00a800;
                   bottom: 0;
                   right: -48%;
                   animation: 5s span2 infinite linear;
                }
                .form span:nth-child(3) {
                   background: #800080;
                   top: 0px;
                   animation: 5s span3 infinite linear;
                   right: -48%;
                }
                .form span:nth-child(4) {
                   animation: 5s span4 infinite linear;
                   animation-delay: 1s;
                   background: #ff0000;
                   bottom: 0;
                   right: -48%;
                }

                @keyframes span1 {
                0% {
                 top: -48%;
                 left: -48%;
                }
                25% {
                 top: -48%;
                 left: 98%;
                }
                50% {
                 top: 98%;
                 left: 98%;
                }
                 75% {
                  top: 98%;
                  left: -48%;
                }
                100% {
                  top: -48%;
                  left: -48%;
                }
                }
                @keyframes span2 {
                0% {
                  bottom: -48%;
                  right: -48%;
                }
                25% {
                  bottom: -48%;
                  right: 98%;
                }
                50% {
                  bottom: 98%;
                  right: 98%;
                }
                75% {
                  bottom: 98%;
                  right: -48%;
                }
                100% {
                  bottom: -48%;
                  right: -48%;
                }
                }
                @keyframes span3 {
                0% {
                  top: -48%;
                  left: -48%;
                }
                25% {
                  top: -48%;
                  left: 98%;
                }
                50% {
                  top: 98%;
                  left: 98%;
                }
                75% {
                  top: 98%;
                  left: -48%;
                }
                100% {
                  top: -48%;
                  left: -48%;
                }
                }

                @keyframes span4 {
                0% {
                  bottom: -48%;
                  right: -48%;
                }
                25% {
                  bottom: -48%;
                  right: 98%;
                }
                50% {
                  bottom: 98%;
                  right: 98%;
                }
                75% {
                  bottom: 98%;
                  right: -48%;
                }
                100% {
                  bottom: -48%;
                  right: -48%;
                }
                }

</style>
    </head>
    <body>
        <%
//            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Cache-control", "no-cache");
            response.setHeader("Cache-control", "no-store");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expire","0");
            
            String nm=(String)session.getAttribute("name");
            if(nm!=null)
            {
                response.sendRedirect("home.jsp");
            }
        %>
        
        
        
                  <%@include file="allcontent/navbar.jsp"%>
<!--        <div class="container-fluid div-color">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card mt-4">
                        <div class="card-header text-center text-white bg-custom">
                            <i class="fa fa-user-plus fa-3x " aria-hidden="true"></i>
                            <h4>Login page</h4>
                        </div>
                        <div class="card-body">
                            <form>

                                <div class="form-group">
                                    <label for="exampleInputemail">Enter Email</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1"> Enter Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                </div>
                                    <button type="submit" class="btn btn-primary btn-primary badge-pill btn-block">Register</button>
                             </form>
                        </div>
                        
                    </div>
                  
                </div>
                
            </div>
        </div>-->
<form action="login" method="post" class="form" autocomplete="off">
   <span></span>
   <span></span>
   <span></span>
   <span></span>
 <div class="form-inner">
     <h2>LOGIN</h2>
     <!--SESSION FOR LOGOUT SUCCESSFULLY  -->
<%
         
        String logout=(String)session.getAttribute("logout");
        if(logout!=null)
        {
    %>
            <div class="alert alert-success" role="alert"><%=logout%></div>
            <style>
                .content 
                {
                    width: 100%;
                    padding: 2px;
                    height: 100%;
                }
                .btn1 
                {
                    margin-top: 30px;
                }
            </style>
    <%   
            session.removeAttribute("logout");
//            session.invalidate();
        }

    %>

<!--SESSION FOR ACCESSING PAGES DIRECTLY WITHOUT LOGIN-->

     <%
         
        String error=(String)session.getAttribute("error");
        if(error!=null)
        {
    %>
            <div class="alert alert-danger" role="alert"><%=error%></div>
            <style>
                .content 
                {
                    width: 100%;
                    padding: 2px;
                    height: 100%;
                }
                .btn1 
                {
                    margin-top: 30px;
                }
            </style>
    <%   
            session.removeAttribute("error");

        }

    %>

<!--SESSION FOR INVALID EMAIL ID AND PASSWORD-->

     <%
         
        String loginfailed=(String)session.getAttribute("login-failed");
        if(loginfailed!=null)
        {
    %>
            <div class="alert alert-danger" role="alert"><%=loginfailed%></div>
            <style>
                .content 
                {
                    width: 100%;
                    padding: 2px;
                    height: 100%;
                }
                .btn1 
                {
                    margin-top: 30px;
                }
            </style>
    <%   
            session.removeAttribute("login-failed");

        }

    %>
<!--SESSION FOR SERVER ERROR-->    
    <%
        String failedmsg=(String)session.getAttribute("failed");
        if(failedmsg!=null)
        {
    %>
            <div class="alert alert-danger" role="alert"><%=failedmsg%></div>   
             <style>
                .content 
                {
                    width: 100%;
                    padding: 2px;
                    height: 100%;
                }
                .btn1 
                {
                    margin-top: 30px;
                }
            </style> 
    <%
            session.removeAttribute("failed");
            
        }
                        

    %>

     <div class="content">
           <input class="input" type="email" placeholder="Email" name="myemail" required />
          <input class="input" type="password" placeholder="Password" name="password" required/>
          <button class="btn1">LOGIN</button>
    </div>
 </div>
</form>


    <%@include file="allcontent/footer.jsp"%>       
    




        
    </body>
</html>
