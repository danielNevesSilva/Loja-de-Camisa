/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-04-26 23:26:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"index.css\">\r\n");
      out.write("    <title>Cadrastro</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"top\">\r\n");
      out.write("\r\n");
      out.write("    <a href=\"\">logo</a>\r\n");
      out.write("    <div class=\"menu\">\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"\">PromoÃ§Ãµes</a></P>\r\n");
      out.write("        <a href=\"\">Camisas</a> </p>\r\n");
      out.write("        <a href=\"./index.jsp\">Cadastre-se</a>\r\n");
      out.write("        <a href=\"./login.html\">Contato</a>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <a href=\"./login.html\"><img src=\"/Loja-de-Camisa/src/imagens/foto-login.webp\" alt=\"foto-login\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"principal\">\r\n");
      out.write("        <div class=\"cadastro\">\r\n");
      out.write("\r\n");
      out.write("            <form action=\"/create-account\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                <!--FORMULÃRIO DE CADASTRO-->\r\n");
      out.write("\r\n");
      out.write("                <form method=\"post\" action=\"\">\r\n");
      out.write("                    <h1>Cadastro</h1>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"nome_cad\">Nome</label>\r\n");
      out.write("                        <input id=\"nome_cad\" name=\"nome_cad\" required=\"required\" type=\"text\" placeholder=\"  nome\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"nome_cad\">Sobrenome</label>\r\n");
      out.write("                        <input id=\"sobrenome_cad\" name=\"sobrenome_cad\" required=\"required\" type=\"text\"\r\n");
      out.write("                            placeholder=\"  sobrenome\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.sobrenome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"email_cad\">E-mail</label>\r\n");
      out.write("                        <input id=\"email_cad\" name=\"email_cad\" required=\"required\" type=\"email\"\r\n");
      out.write("                            placeholder=\"  contato@htmlecsspro.com\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"senha_cad\">Senha</label>\r\n");
      out.write("                        <input id=\"senha_cad\" name=\"senha_cad\" required=\"required\" type=\"password\" placeholder=\"  ********\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.senha}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"senha_cad\">Confirme senha</label>\r\n");
      out.write("                        <input id=\"confsenha_cad\" name=\"confsenha_cad\" required=\"required\" type=\"password\"\r\n");
      out.write("                            placeholder=\"  ********\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                        <button class=\"botao-cadastro\" input type=\"submit\" value=\"Cadastrar\" > Cadastrar</button>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <p class=\"link\">\r\n");
      out.write("             <label for=\"\">Login</label>\r\n");
      out.write("            <a href=\"login.html\"><button class=\"botao-login\">Login</button>  </a>\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer\"></div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}