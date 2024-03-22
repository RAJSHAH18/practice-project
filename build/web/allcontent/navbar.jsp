<!--<style>
   .bg-custom
    {
        background:#03e9f4;
    }
</style>-->

<nav class="navbar navbar-expand-lg navbar-dark bg-custom navbar-custom">
    <a class="navbar-brand" href="#"><i class="fa fa-graduation-cap" aria-hidden="true"></i><strong>E</strong>Notes</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

      
      <%
        String user=(String)session.getAttribute("name");
        String role=(String)session.getAttribute("role");
        if(role!=null)
        {
            if(role.equals("user"))
            {
      %>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <!-- Icons Are Taken From Fontawesome 4-->
          <a class="nav-link" href="home.jsp"></i><i class="fa fa-home" aria-hidden="true"></i>Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="addnotes.jsp"><i class="fa fa-plus-circle" aria-hidden="true"></i>
        Add Notes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="shownotes.jsp"><i class="fa fa-address-book-o" aria-hidden="true"></i> Show Notes</a>
      </li>
       <li class="nav-item">
        <a class="nav-link " href="chatGPT.html"><i class="fa fa-address-chat-o" aria-hidden="true"></i> ChatGPT</a>
      </li>

     
    </ul>
          
      
    <div style="display:-webkit-inline-box;">
      <!--<a href="#" class="btn btn-light my-2 my-sm-0 mr-2" type="submit"><i class="fa fa-user-circle" aria-hidden="true"></i> </a>-->
<h3 style="margin-right:20px;margin-top:4px;  font-weight:900;color: white"> WELCOME <%= user %></h3> 
      <a href="logout"class="btn btn-light my-2 my-sm-0" type="submit"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a>
  </div>
</div>
      <%
          
        }
        else if(role.equals("admin"))
        {
      %>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                <!-- Icons Are Taken From Fontawesome 4-->
                <a class="nav-link" href="home1.jsp"></i><i class="fa fa-home" aria-hidden="true"></i>Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="users.jsp"><i class="fa fa-plus-circle" aria-hidden="true"></i>
                USERS</a>
<!--                </li>
                <li class="nav-item">
                <a class="nav-link " href="review.jsp"><i class="fa fa-address-book-o" aria-hidden="true"></i> REVIEWS</a>
                </li>-->

                </ul>


                <div style="display:-webkit-inline-box;">
                <!--<a href="#" class="btn btn-light my-2 my-sm-0 mr-2" type="submit"><i class="fa fa-user-circle" aria-hidden="true"></i> </a>-->
                <h3 style="margin-right:20px;margin-top:4px;  font-weight:900"> WELCOME <%= user %></h3> 
                <a href="logout"class="btn btn-light my-2 my-sm-0" type="submit"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a>
                </div>
                </div>
      <%  
        }
    }   
       else

        {

      %>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <!-- Icons Are Taken From Fontawesome 4-->
          <a class="nav-link" href="index.jsp"></i><i class="fa fa-home" aria-hidden="true"></i>Home <span class="sr-only">(current)</span></a>
      </li>
<!--      <li class="nav-item">
        <a class="nav-link" href="#"><i class="fa fa-plus-circle" aria-hidden="true"></i>
        Add Notes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="#"><i class="fa fa-address-book-o" aria-hidden="true"></i> Show Notes</a>
      </li>-->
    </ul>

    <div>
      <a href="login.jsp" class="btn btn-light my-2 my-sm-0 mr-2" type="submit"><i class="fa fa-user-circle" aria-hidden="true"></i>Login</a>
      <a href="register.jsp"class="btn btn-light my-2 my-sm-0" type="submit"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a>
  </div>
</div>
 
      <%  
        }
       %>
 
      
</nav>
 