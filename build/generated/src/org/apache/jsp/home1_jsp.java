package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>E-notes</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/remixicon@3.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
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
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                overflow: hidden;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            html,\n");
      out.write("            body {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #main {\n");
      out.write("                width: 100vw;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #card {\n");
      out.write("                width: 100vw;\n");
      out.write("                height: 80vh;\n");
      out.write("                display:flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-evenly;\n");
      out.write("                /* margin-top: -120px; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #card1 {\n");
      out.write("                height: 50vh;\n");
      out.write("                width: 30vw;\n");
      out.write("                /* background-color: black; */\n");
      out.write("                border: 5px solid purple;\n");
      out.write("                padding-top: 60px;\n");
      out.write("            }\n");
      out.write("            #card1 .icon1 i{\n");
      out.write("                font-size: 90px;\n");
      out.write("                margin-left: 180px;\n");
      out.write("\n");
      out.write("                padding-top: 400px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #card1 .icon1 h1{\n");
      out.write("                font-size: 45px;\n");
      out.write("                margin-left: 120px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #card2 {\n");
      out.write("                height: 50vh;\n");
      out.write("                width: 30vw;\n");
      out.write("                padding-top: 60px;\n");
      out.write("                /* background-color: red; */\n");
      out.write("                border: 5px solid purple;\n");
      out.write("            }\n");
      out.write("            #card2 .icon2 i{\n");
      out.write("                font-size: 90px;\n");
      out.write("                margin-left: 180px;\n");
      out.write("\n");
      out.write("                padding-top: 400px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #card2 .icon2 h1{\n");
      out.write("                font-size: 45px;\n");
      out.write("                margin-left: 120px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 15vw;\n");
      out.write("                height: 7vh;\n");
      out.write("                padding: 3px 3px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                margin-left: 635px;\n");
      out.write("                margin-top:-90px ;\n");
      out.write("                border: 3px solid purple;\n");
      out.write("                border-radius: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #foot\n");
      out.write("            {\n");
      out.write("                margin-top: 126px;\n");
      out.write("                background-color:black;\n");
      out.write("                color:white;\n");
      out.write("                font-weight:900;\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("            }\n");
      out.write("            #foot:hover\n");
      out.write("            {\n");
      out.write("                color:#F54952;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");

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
        
            
    

      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("<!--<style>\n");
      out.write("   .bg-custom\n");
      out.write("    {\n");
      out.write("        background:#03e9f4;\n");
      out.write("    }\n");
      out.write("</style>-->\n");
      out.write("\n");
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
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"chatGPT.html\"><i class=\"fa fa-address-chat-o\" aria-hidden=\"true\"></i> ChatGPT</a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("          \n");
      out.write("      \n");
      out.write("    <div style=\"display:-webkit-inline-box;\">\n");
      out.write("      <!--<a href=\"#\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i> </a>-->\n");
      out.write("<h3 style=\"margin-right:20px;margin-top:4px;  font-weight:900;color: white\"> WELCOME ");
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
      out.write("                <a class=\"nav-link\" href=\"home1.jsp\"></i><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"users.jsp\"><i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i>\n");
      out.write("                USERS</a>\n");
      out.write("<!--                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link \" href=\"review.jsp\"><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i> REVIEWS</a>\n");
      out.write("                </li>-->\n");
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
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"card\">\n");
      out.write("                <div id=\"card1\">\n");
      out.write("                    <div class=\"icon1\"><i class=\"ri-user-3-line\"></i>\n");
      out.write("                        <h1>Total Users</h1>\n");
      out.write("                        ");

                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("SELECT COUNT(*) as total user WHERE role NOT LIKE 'admin'");
                            while(rs.next())
                            {
                        
      out.write("\n");
      out.write("                                <center> <h3 style=\"color:red;font-weight: bolder\">");
      out.print(rs.getInt("total"));
      out.write("</h3></center>\n");
      out.write("\n");
      out.write("                        ");

                            }
                            
                            
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"card2\">\n");
      out.write("                    <div class=\"icon2\"><i class=\"ri-book-read-line\"></i>\n");
      out.write("                        <h1>Total Notes</h1>\n");
      out.write("                         ");

                            
                            rs = st.executeQuery("SELECT COUNT(uid) as total FROM post");
                            while(rs.next())
                            {
                        
      out.write("\n");
      out.write("                                <center> <h3 style=\"color:red;font-weight: bolder\">");
      out.print(rs.getInt("total"));
      out.write("</h3></center>\n");
      out.write("\n");
      out.write("                        ");

                            }
                            
                            
                            
                        
      out.write("\n");
      out.write("                        <center> <h3 style=\"color:red;font-weight: bolder\">200</h3></center>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button>ALL USERS</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid \" id=\"foot\">\n");
      out.write("            <p class=\"text-center \"> Note: Any Errors Occur Then Contact Codewithxyz@gmail.com. Designed And Developed By xyz </p>\n");
      out.write("            <p class=\"text-center \">All Rights Reversed @Codewith-2022-23</p>\n");
      out.write("        </div>\n");
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
