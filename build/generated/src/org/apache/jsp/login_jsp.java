package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/allcontent/allcss.jsp");
    _jspx_dependants.add("/allcontent/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"> \n");
      out.write("<!--css link from bootstrap4 -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"> \n");
      out.write("<!-- fontawesome link from W3Schools -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<!--this is all css file from folder css in that style.css -->\n");
      out.write("\n");
      out.write("<!-- This Is Javascript Link From Bootstrap4-->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\">   \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"> \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\">    \n");
      out.write("</script>");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("        *\n");
      out.write("        {\n");
      out.write("            margin:0;\n");
      out.write("            font-family:'Gill Sans','Gills Snas MT',Calibri,'Trebuchet MS',sans-serif;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            background:linear-gradient(#141e30,#243b55);\n");
      out.write("            height:100vh;\n");
      out.write("            width:100%;\n");
      out.write("        }\n");
      out.write("        form\n");
      out.write("        {\n");
      out.write("            border:1px solid white;\n");
      out.write("            width:400px;\n");
      out.write("            height:430px;\n");
      out.write("            margin-left: 36%;\n");
      out.write("            margin-top:15vh;\n");
      out.write("            position:absoulte;\n");
      out.write("            border-radius:10px;\n");
      out.write("            background:rgba(0,0,0,.5);\n");
      out.write("            box-shadow: 0 15px 20px #8e24aa;\n");
      out.write("        }\n");
      out.write("        h1\n");
      out.write("        {\n");
      out.write("            color:#03e9f4;\n");
      out.write("            margin-left:150px;\n");
      out.write("            margin-top:20px;\n");
      out.write("        }\n");
      out.write("        .email input\n");
      out.write("        {\n");
      out.write("            margin-left:15px;\n");
      out.write("            margin-top:90px;\n");
      out.write("            width:90%;\n");
      out.write("            outline:none;\n");
      out.write("            border:none;\n");
      out.write("            border-bottom: 2px solid #03e9f4;\n");
      out.write("            background:transparent;\n");
      out.write("            color:#03e9f4;\n");
      out.write("            font-size:22px;\n");
      out.write("        }\n");
      out.write("        .email ::placeholder\n");
      out.write("        {\n");
      out.write("            color:#8f8f8f;\n");
      out.write("            font-size:22px;\n");
      out.write("            margin-left:8px;\n");
      out.write("            position: absolute;\n");
      out.write("            margin-top:-8px;\n");
      out.write("        }\n");
      out.write("        .password input\n");
      out.write("        {\n");
      out.write("            width:90%;\n");
      out.write("            margin-left: 15px;\n");
      out.write("            margin-top:60px;\n");
      out.write("            outline:none;\n");
      out.write("            border:none;\n");
      out.write("            border-bottom: 2px solid #03e9f4;\n");
      out.write("            background:transparent;\n");
      out.write("            color:#03e9f4;\n");
      out.write("            font-size:22px;\n");
      out.write("        }\n");
      out.write("        .password ::placeholder\n");
      out.write("        {\n");
      out.write("            margin-left:8px;\n");
      out.write("            position: absolute;\n");
      out.write("            color:#8f8f8f;\n");
      out.write("            font-size:22px;\n");
      out.write("\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .btn2\n");
      out.write("        {\n");
      out.write("            margin-top:50px;\n");
      out.write("            margin-left:140px;\n");
      out.write("            width:130px;\n");
      out.write("            height:40px;\n");
      out.write("            border-radius:10px;\n");
      out.write("            border: 2px solid #8e24aa;\n");
      out.write("            background:transparent;\n");
      out.write("            color:#03e9f4;\n");
      out.write("            font-size:23px;\n");
      out.write("            letter-spacing: 2px;\n");
      out.write("            box-shadow: 0 0 15px #8e24aa;\n");
      out.write("            border:none;\n");
      out.write("        }\n");
      out.write("        .btn2:hover\n");
      out.write("        {\n");
      out.write("            box-shadow: 0 0 5px #8e24aa,\n");
      out.write("            0 0 25px #8e24aa,\n");
      out.write("            0 0 50px #8e24aa,\n");
      out.write("            0 0 100px #8e24aa;\n");
      out.write("            background-color:#8e24aa;\n");
      out.write("            color:white;\n");
      out.write("            transition: all 0.8s ease-in-out;\n");
      out.write("            cursor:pointer;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Cache-control", "no-cache");
            response.setHeader("Cache-control", "no-store");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expire","0");
            
            String nm=(String)session.getAttribute("name");
            if(nm!=null)
            {
                response.sendRedirect("home.jsp");
            }
        
      out.write("\n");
      out.write("            ");
      out.write("<!--<style>\n");
      out.write("   .bg-custom\n");
      out.write("    {\n");
      out.write("        background:#03e9f4;\n");
      out.write("    }\n");
      out.write("</style>-->\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom navbar-custom\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><i class=\"fa fa-graduation-cap\" aria-hidden=\"true\"></i><strong>E</strong>Notes</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      ");

        String user=(String)session.getAttribute("name");
        String role=(String)session.getAttribute("role");
        if(role!=null)
        {
            if(role.equals("user"))
            {
      
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <!-- Icons Are Taken From Fontawesome 4-->\n");
      out.write("          <a class=\"nav-link\" href=\"home.jsp\"></i><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"addnotes.jsp\"><i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i>\n");
      out.write("        Add Notes</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"shownotes.jsp\"><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i> Show Notes</a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("          \n");
      out.write("      \n");
      out.write("    <div style=\"display:-webkit-inline-box;\">\n");
      out.write("      <!--<a href=\"#\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i> </a>-->\n");
      out.write("<h3 style=\"margin-right:20px;margin-top:4px;  font-weight:900\"> WELCOME ");
      out.print( user );
      out.write("</h3> \n");
      out.write("      <a href=\"logout\"class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>Logout</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      ");

          
        }
        else if(role.equals("admin"))
        {
      
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                <!-- Icons Are Taken From Fontawesome 4-->\n");
      out.write("                <a class=\"nav-link\" href=\"home.jsp\"></i><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"users.jsp\"><i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i>\n");
      out.write("                USERS</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link \" href=\"review.jsp\"><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i> REVIEWS</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div style=\"display:-webkit-inline-box;\">\n");
      out.write("                <!--<a href=\"#\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i> </a>-->\n");
      out.write("                <h3 style=\"margin-right:20px;margin-top:4px;  font-weight:900\"> WELCOME ");
      out.print( user );
      out.write("</h3> \n");
      out.write("                <a href=\"logout\"class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>Logout</a>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("      ");
  
        }
    }   
       else

        {

      
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <!-- Icons Are Taken From Fontawesome 4-->\n");
      out.write("          <a class=\"nav-link\" href=\"index.jsp\"></i><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("<!--      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i>\n");
      out.write("        Add Notes</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"#\"><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i> Show Notes</a>\n");
      out.write("      </li>-->\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("      <a href=\"login.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>Login</a>\n");
      out.write("      <a href=\"register.jsp\"class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i>Register</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("      ");
  
        }
       
      out.write("\n");
      out.write(" \n");
      out.write("      \n");
      out.write("</nav>\n");
      out.write(" ");
      out.write("\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        <form action=\"login\" method=\"post\" autocomplete=\"off\">\n");
      out.write("            <h1>LOGIN</h1>\n");
      out.write("                         <!--SESSION FOR LOGOUT SUCCESSFULLY  -->\n");

    
         
        String logout=(String)session.getAttribute("logout");
        if(logout!=null)
        {
    
      out.write("\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">");
      out.print(logout);
      out.write("</div>\n");
      out.write("           <style>\n");
      out.write("                 .email input\n");
      out.write("                 {\n");
      out.write("                     margin-top:25px;\n");
      out.write("                 }\n");
      out.write("             </style> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("    ");
   
            session.removeAttribute("logout");
//            session.invalidate();
        }

    
      out.write("\n");
      out.write("\n");
      out.write("<!--SESSION FOR ACCESSING PAGES DIRECTLY WITHOUT LOGIN-->\n");
      out.write("\n");
      out.write("     ");

         
        String error=(String)session.getAttribute("error");
        if(error!=null)
        {
    
      out.write("\n");
      out.write("            <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(error);
      out.write("</div>\n");
      out.write("            <style>\n");
      out.write("                 .email input\n");
      out.write("                 {\n");
      out.write("                     margin-top:25px;\n");
      out.write("                 }\n");
      out.write("             </style> \n");
      out.write("            \n");
      out.write("    ");
   
            session.removeAttribute("error");

        }

    
      out.write("\n");
      out.write("\n");
      out.write("<!--SESSION FOR INVALID EMAIL ID AND PASSWORD-->\n");
      out.write("\n");
      out.write("     ");

         
        String loginfailed=(String)session.getAttribute("login-failed");
        if(loginfailed!=null)
        {
    
      out.write("\n");
      out.write("            <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(loginfailed);
      out.write("</div>\n");
      out.write("            <style>\n");
      out.write("                 .email input\n");
      out.write("                 {\n");
      out.write("                     margin-top:25px;\n");
      out.write("                 }\n");
      out.write("             </style>    \n");
      out.write("    ");
   
            session.removeAttribute("login-failed");

        }

    
      out.write("\n");
      out.write("<!--SESSION FOR SERVER ERROR-->    \n");
      out.write("    ");

        String failedmsg=(String)session.getAttribute("failed");
        if(failedmsg!=null)
        {
    
      out.write("\n");
      out.write("            <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(failedmsg);
      out.write("</div>   \n");
      out.write("             <style>\n");
      out.write("                 .email input\n");
      out.write("                 {\n");
      out.write("                     margin-top:25px;\n");
      out.write("                 }\n");
      out.write("             </style> \n");
      out.write("    ");

            session.removeAttribute("failed");
            
        }
                        

    
      out.write("\n");
      out.write("            <div class=\"email\"> \n");
      out.write("                 <input type=\"email\" placeholder=\"Email\" name=\"myemail\" required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"password\"> \n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\" Enter Password\" required>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn2\">SUBMIT</button>\n");
      out.write("            <p>Dont't Have An Account?<a href='register.jsp'>Register Now</a>\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
