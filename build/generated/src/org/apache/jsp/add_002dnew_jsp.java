package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Thêm mới sản phẩm</title>\n");
      out.write("        <link href=\"lib/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/top-bar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/content.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/add-new.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top-bar.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-add-new.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!--phần form thêm mới-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"add-product\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Tên sản phẩm: </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Tên sản phẩm\" name=\"ProductName\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Giá tiền: </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Giá tiền\" name=\"ProductPrice\">\n");
      out.write("                </div>\n");
      out.write("                <!--\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Chi tiết sản phẩm: </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Mô tả 1\" name=\"ProductDescription_1\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Mô tả 2\" name=\"ProductDescription_2\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Mô tả 3\" name=\"ProductDescription_3\">\n");
      out.write("                </div>\n");
      out.write("                -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Hình ảnh: </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Đường dẫn link ảnh\" name=\"ProductImage\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button type=\"submit\">Lưu</button>\n");
      out.write("                <button><a href=\"index.jsp\" style=\"color: #000\">Trở lại</a></button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
