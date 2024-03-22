package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class glow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <style type=\"text/css\">\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Nunito:wght@900&display=swap');\n");
      out.write("*\n");
      out.write("{\n");
      out.write("    margin:0;\n");
      out.write("    padding:0;\n");
      out.write("    font-family: 'Nunito',sans-serif;\n");
      out.write("\n");
      out.write("}\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    display:flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    background: radial-gradient(#111,#000);\n");
      out.write("}\n");
      out.write("h6\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    font-size: 80px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    color: transparent;\n");
      out.write("    background:linear-gradient(to bottom,#222 0%,#222 50%,#111 50%,#111 100%);\n");
      out.write("    -webkit-background-clip: text;\n");
      out.write("\n");
      out.write("}\n");
      out.write("h6:before\n");
      out.write("{\n");
      out.write("    \n");
      out.write("    content:attr(data-text);\n");
      out.write("    position: absolute;\n");
      out.write("    top:4px;\n");
      out.write("    left:4px;\n");
      out.write("    z-index: -1;\n");
      out.write("    background:linear-gradient(45deg,#ff0,#0f0,#f00,#00f,#0f0);\n");
      out.write("    -webkit-background-clip: text;\n");
      out.write("    color: transparent;\n");
      out.write("}\n");
      out.write("h6:after\n");
      out.write("{\n");
      out.write("\n");
      out.write("    content:attr(data-text);\n");
      out.write("    position: absolute;\n");
      out.write("    top:30px;\n");
      out.write("    left:20px;\n");
      out.write("    z-index: -2;\n");
      out.write("    background:linear-gradient(45deg,#ff0,#0f0,#f00,#00f,#0f0);\n");
      out.write("    -webkit-background-clip: text;\n");
      out.write("    color: transparent;\n");
      out.write("    filter: blur(20px);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("<h6 data-text=\"E-notes-save your notes\">E-notes-save your notes*</h6>        \n");
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
