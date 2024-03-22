package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Page</title>\n");
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
      out.write("            .input1\n");
      out.write("            {\n");
      out.write("                border:0;\n");
      out.write("                width:80%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                margin: 30px;\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding-left: 10px;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("/*            .btn2\n");
      out.write("        {\n");
      out.write("            margin-top:50px;\n");
      out.write("            margin-left:140px;\n");
      out.write("            width:110px;\n");
      out.write("            height:40px;\n");
      out.write("            border-radius:10px;\n");
      out.write("            border: 2px solid #FD1C03;\n");
      out.write("            background: #111;\n");
      out.write("            color:#FD1C03;\n");
      out.write("            font-size:23px;\n");
      out.write("            box-shadow: 0 0 15px #FD1C03;\n");
      out.write("            border:none;\n");
      out.write("        }\n");
      out.write("        .btn2:hover\n");
      out.write("        {\n");
      out.write("            box-shadow: 0 0 5px #FD1C03,\n");
      out.write("            0 0 25px #FD1C03,\n");
      out.write("            0 0 20px #FD1C03,\n");
      out.write("            0 0 10px #FD1C03;\n");
      out.write("            background-color:#FD1C03;\n");
      out.write("            color:white;\n");
      out.write("            transition: all 0.8s ease-in-out;\n");
      out.write("            cursor:pointer;\n");
      out.write("        }\n");
      out.write("        .btn3\n");
      out.write("        {\n");
      out.write("            margin-top:50px;\n");
      out.write("            margin-left:140px;\n");
      out.write("            width:100px;\n");
      out.write("            height:100px;\n");
      out.write("            border-radius:10px;\n");
      out.write("            border: 2px solid #39FF14;\n");
      out.write("            background: #111;\n");
      out.write("            color:#39FF14;\n");
      out.write("            font-size:23px;\n");
      out.write("            box-shadow: 0 0 15px #39FF14;\n");
      out.write("            border:none;\n");
      out.write("        }\n");
      out.write("        .btn3:hover\n");
      out.write("        {\n");
      out.write("            box-shadow: 0 0 5px #39FF14,\n");
      out.write("            0 0 25px #39FF14,\n");
      out.write("            0 0 20px #39FF14,\n");
      out.write("            0 0 10px #39FF14;\n");
      out.write("            background-color:#39FF14;\n");
      out.write("            color:white;\n");
      out.write("            transition: all 0.8s ease-in-out;\n");
      out.write("            cursor:pointer;\n");
      out.write("        }\n");
      out.write("        a \n");
      out.write("        {\n");
      out.write("            width:100px;\n");
      out.write("        }\n");
      out.write("#bt:hover\n");
      out.write("{\n");
      out.write("        color: white;\n");
      out.write("\n");
      out.write("}*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            ");
      out.write("<style>\n");
      out.write("   .bg-custom\n");
      out.write("    {\n");
      out.write("        background:#03e9f4;\n");
      out.write("    }\n");
      out.write("</style>\n");
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
      out.write("        ");

//            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
             if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
//             if(session.getAttribute("back")==null)
//            {
////                session.setAttribute("error","Please Login First");
//                response.sendRedirect("users.jsp");
//                
//                
//            }
             
             
            String notupdate=(String)session.getAttribute("notupdate");

             if(notupdate!=null)
            {
                out.println("<script>alert('"+notupdate+"')</script>");
                session.removeAttribute("notupdate");

            }
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");

            String delete=(String)session.getAttribute("delete");

             if(delete!=null)
            {
                out.println("<script>alert('"+delete+"')</script>");
                session.removeAttribute("delete");
//                out.println("<script>alert('"+notupdate+"')</script>");
            }
            
            String update=(String)session.getAttribute("update");
            if(update!=null)
            {
//                out.println("<script>alert('"+notupdate+"')</script>");
    
      out.write("\n");
      out.write("                    <div class=\"alert alert-success\" role=\"alert\">");
      out.print(update);
      out.write("</div>\n");
      out.write("\n");
      out.write("    ");

                session.removeAttribute("update");
            }
    
      out.write("\n");
      out.write("        <h1>USER DETAILS</h1>\n");
      out.write("    <center>\n");
      out.write("    \n");
      out.write("    <table border=\"2px\" width=\"80%\" cellspacing=\"0\" cellpadding=\"10px\">\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <th width=\"4%\">ID</th>\n");
      out.write("            <th width=\"5%\">NAME</th>\n");
      out.write("            <th width=\"10%\">EMAIL</th>\n");
      out.write("            <th width=\"10%\">PASSWORD</th>\n");
      out.write("            <th width=\"5%\">ROLE</th>\n");
      out.write("            <th width=\"4%\">NO.OF NOTES</th>\n");
      out.write("            <th width=\"8%\" colspan=\"2\">OPERATION</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

        Connection con=null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/enotes","root","");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            out.println("<script>alert('Something went Wrong On Server')</script>");

        }
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM user WHERE name not LIKE 'admin'");
        
        while(rs.next())
        {
            
        
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getInt("id"));
      out.write(" </td>\n");
      out.write("            <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("            <td><input class=\"input1\" type=\"password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\"></td>\n");
      out.write("            <td>");
      out.print(rs.getString("role"));
      out.write("</td>\n");
      out.write("            ");

                    Statement stm=con.createStatement();
                
                   ResultSet cnt=stm.executeQuery("SELECT count(*) AS total FROM post WHERE uid="+rs.getInt("id"));
                   if(cnt.next())
                   {
            
      out.write("\n");
      out.write("                   \n");
      out.write("                    <td>");
      out.print( cnt.getInt("total"));
      out.write("</td>\n");
      out.write("\n");
      out.write("            ");

                   }
   
            
      out.write("\n");
      out.write("            <td align=\"center\"> <a href=\"deleteuser?id=");
      out.print( rs.getInt("id"));
      out.write("\" class=\"btn btn-danger\" onclick=\"return con()\"><strong>DELETE</strong></a></td>\n");
      out.write("                <!--<a href=\"edituser.jsp?id=\" class=\"btn btn-primary px-4\" ><strong>EDIT</strong></a></td>-->\n");
      out.write("                         \n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");

            
            }
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("          <script>\n");
      out.write("                  function con()\n");
      out.write("                    {\n");
      out.write("                       return confirm(\"Do You Want To Delete This ?\");\n");
      out.write("                    }\n");
      out.write("            </script>\n");
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
