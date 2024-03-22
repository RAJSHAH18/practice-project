package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        #menu{\n");
      out.write("            display: flex;\n");
      out.write("            list-style: none;\n");
      out.write("            justify-content: center;  \n");
      out.write("            align-items: center;\n");
      out.write("            gap: 50px;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-item{\n");
      out.write("            color: white;\n");
      out.write("            font-family: var(--primary-font);\n");
      out.write("            font-size: 18px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            position: relative; \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-item::after{\n");
      out.write("            content: '';\n");
      out.write("            position: absolute;\n");
      out.write("            left: 0;    \n");
      out.write("            bottom: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 1px;\n");
      out.write("            background-color: white;\n");
      out.write("            \n");
      out.write("            transform: scaleX(0);\n");
      out.write("            transform-origin: right;\n");
      out.write("            transition: transform 300ms ease-in-out;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-item:hover{\n");
      out.write("            color: var(--quaternary-clr);\n");
      out.write("            font-family: var(--primary-font);\n");
      out.write("            font-size: 18px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"nav-bar\">\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("            <li> \n");
      out.write("                <a href=\"index.jsp\" class=\"nav-item\" style=\"color: var(--quaternary-clr);\">Home</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"menu.jsp\" class=\"nav-item\">Menu</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"login.jsp\" class=\"nav-item\">Login</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>    \n");
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
