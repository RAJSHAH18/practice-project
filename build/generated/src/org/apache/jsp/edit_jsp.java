package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.sql.DriverManager;
import java.sql.Connection;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/allcontent/allcss.jsp");
    _jspx_dependants.add("/allcontent/navbar.jsp");
    _jspx_dependants.add("/allcontent/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Page</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");

            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
             if(session.getAttribute("name")==null)
            {
                session.setAttribute("error","Please Login First");
                response.sendRedirect("login.jsp");
                
                
            }
    
        
      out.write("\n");
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
//        if(con!=null)
//        {
//            out.println("Connected");
//        }
        int id=Integer.parseInt(request.getParameter("id"));
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT *  FROM post WHERE id="+id);
        while(rs.next())
        {
    
      out.write("\n");
      out.write("        <div class=\"container-fluid p-0\">\n");
      out.write("            ");
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
        if(user!=null)
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
      out.write("    </ul>\n");
      out.write("          \n");
      out.write("      \n");
      out.write("    <div>\n");
      out.write("      <a href=\"#\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\n");
      out.print( user );
      out.write("</a>\n");
      out.write("      <a href=\"logout\"class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>Logout</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      ");

          
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
      out.write("             <h1 class=\"text-center\">EDIT YOUR NOTES</h1>\n");
      out.write("             <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                    \n");
      out.write("                        <form  action=\"#\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("                    \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                    <label for=\"title\">TITLE </label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"title\" name=\"title\" value=\"");
      out.print( rs.getString("title"));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                <label for=\"content\">CONTENT</label>\n");
      out.write("                                <textarea rows=\"9\" cols=\"\" name=\"content\" id=\"content\" class=\"form-control\" >");
      out.print( rs.getString("content"));
      out.write("</textarea>\n");
      out.write("                            </div>     \n");
      out.write("                        \n");
      out.write("                            <div class=\"container text-center mt-4 mb-5\">\n");
      out.write("                        \n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\"><strong>ADD NOTES</strong></button>\n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                 \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");

       }
       
       String title=request.getParameter("title");
       String content=request.getParameter("content");
       boolean f=false;
        String query="UPDATE user SET title=?,content=? WHERE id="+id;
        
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,title );
            ps.setString(2, content);
            int i= ps.executeUpdate();
            
            if(i==1)
            {
                f=true;
            }

            if(f)
            {
                response.sendRedirect("shownotes.jsp");
                
            }
            else
            {
                session.setAttribute("notupdate","Not Update" );
                response.sendRedirect("edit.jsp");

            }


      out.write("\n");
      out.write("            \n");
      out.write("            ");
      out.write("<div class=\"container-fluid bg-dark \">\n");
      out.write("    <p class=\"text-center text-white\"> Note: Any Errors Occur Then Contact Codewith. Designed And Developed By xyz </p>\n");
      out.write("    <p class=\"text-center text-white\">All Rights Reversed @Codewith-2020-21</p>\n");
      out.write("</div>\n");
      out.write("        \n");
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
