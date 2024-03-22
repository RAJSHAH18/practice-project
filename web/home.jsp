<%-- 
    Document   : home
    Created on : Oct 9, 2022, 1:11:32 PM
    Author     : RAJ SHAH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <%@include file="allcontent/allcss.jsp" %>
        <style>
            bdoy,html{
                height: 100%;
                width:100%;
                overflow: hidden;
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
            response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
//            if(session.getAttribute("name")==null)
//            {
//                session.setAttribute("error","Please Login First");
//                response.sendRedirect("login.jsp");
//                
//                
//            }

//            HttpSession s=request.getSession(true);
//            s.setAttribute("success","true");
//            
%>
        <div class="container-fluid p-0">
            <%@include file="allcontent/navbar.jsp"%>
            <%            if (role.equals("admin")) {
            %>
            <div class="card  py-5">
                <div class="card-body text-center">
                    <img src="img/back.png" alt="notes image" class="img-fluid mx-auto" style="max-width:330px">
                    <h1 style="font-weight:900">START YOUR NOTES</h1>
                    <a href="users.jsp" class="btn btn-outline-primary">See Users</a>
                </div>

            </div>
            <%
            } else {
            %>
            <div class="card  py-5">
                <div class="card-body text-center">
                    <img src="img/back.png" alt="notes image" class="img-fluid mx-auto" style="max-width:330px">
                    <h1 style="font-weight:900">START YOUR NOTES</h1>
                    <a href="addnotes.jsp" class="btn btn-outline-primary">START WRITING</a>
                </div>

            </div>

        </div>

        <%
            }
        %>


        <%--<%@include file="allcontent/footer.jsp" %>--%>        




        <div class="container-fluid " id="foot">
            <p class="text-center "> Note: Any Errors Occur Then Contact Codewithxyz@gmail.com. Designed And Developed By xyz </p>
            <p class="text-center ">All Rights Reversed @Codewith-2022-23</p>
        </div>
    </body>
</html>
