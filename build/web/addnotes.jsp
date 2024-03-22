<%-- 
    Document   : addnotes
    Created on : Oct 9, 2022, 4:07:20 PM
    Author     : RAJ SHAH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD NOTES</title>
        <%@include file="allcontent/allcss.jsp" %>
        <style>
            html,body{
                overflow: hidden;
            }
            footer{
                margin-top: 92px;
            }
            
            </style>
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
            String add=(String)session.getAttribute("add");
            if(add!=null)
            {
                out.println("<script>alert('"+add+"')</script>");
                session.removeAttribute("add");

            }       
            String fail=(String)session.getAttribute("fail");

             if(fail!=null)
            {
                out.println("<script>alert('"+fail+"')</script>");
                session.removeAttribute("fail");

            }
            String failed=(String)session.getAttribute("failed");
            if(failed!=null)
            {
                out.println("<script>alert('"+failed+"')</script>");
                session.removeAttribute("failed");

            }
        %>

        <div class="container-fluid p-0">
             <%@include file="allcontent/navbar.jsp"%>
             <h1 class="text-center" style="font-weight:900;color: #F54952">ADD YOUR NOTES</h1>
             <div class="container">
                  <div class="row">
                <div class="col-md-12">
                    
                    <form  action="post" method="POST" autocomplete="off">
                    
                        <div class="form-group">
                            <input type="hidden" name="uid" value="<%= session.getAttribute("id") %>">
                                   <label for="title">TITLE </label>
                            <input type="text" class="form-control" id="title" name="title" placeholder="Enter Title..." required>
                        </div>
                        
                        <div class="form-group"> 
                            <label for="content">CONTENT</label>
                            <textarea rows="9" cols="" name="content" id="content" class="form-control" placeholder="Enter Content...." required></textarea>
                        </div>     
                        
                        <div class="container text-center mt-4 mb-5">
                        
                            <button type="submit" class="btn btn-primary"><strong>ADD NOTES</strong></button>
                            
                        </div>
                    </form>
                        
                </div>
                
            </div>
                 
             </div>
            
        </div>
        <footer>
                <%@include file="allcontent/footer.jsp" %>        
        </footer>

    </body>
</html>
