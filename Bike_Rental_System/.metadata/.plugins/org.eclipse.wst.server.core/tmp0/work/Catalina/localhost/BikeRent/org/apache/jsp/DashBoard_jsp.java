/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2024-04-09 07:25:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/Bike_Rental_System/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BikeRent/WEB-INF/lib/jsf-impl-2.2.14.jar!/META-INF/jsf_core.tld", Long.valueOf(1479140578000L));
    _jspx_dependants.put("jar:file:/D:/Bike_Rental_System/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BikeRent/WEB-INF/lib/jsf-impl-2.2.14.jar!/META-INF/html_basic.tld", Long.valueOf(1479140598000L));
    _jspx_dependants.put("/WEB-INF/lib/jsf-impl-2.2.14.jar", Long.valueOf(1701365185055L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fmessage_0026_005fstyle_005ffor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputSecret_0026_005fvalue_005fmaxlength_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005fstyleClass_005fstyle_005faction_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fmessage_0026_005fstyle_005ffor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputSecret_0026_005fvalue_005fmaxlength_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005fstyleClass_005fstyle_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fmessage_0026_005fstyle_005ffor_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005finputSecret_0026_005fvalue_005fmaxlength_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005fstyleClass_005fstyle_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_f_005fview_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_005fview_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = new com.sun.faces.taglib.jsf_core.ViewTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_f_005fview_005f0);
    try {
      _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
      _jspx_th_f_005fview_005f0.setParent(null);
      _jspx_th_f_005fview_005f0.setJspId("jsp_450731771_0");
      int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_f_005fview_005f0);
        }
        do {
          out.write("\r\n");
          out.write("\t<html>\r\n");
          out.write("<head>\r\n");
          out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
          out.write("<!-- Required meta tags -->\r\n");
          out.write("<meta charset=\"utf-8\">\r\n");
          out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
          out.write("<link rel=\"styleSheet\" type=\"text/css\" href=\"views/style.css\">\r\n");
          out.write("<title>BikeShareHub</title>\r\n");
          out.write("</head>\r\n");
          out.write("<body>\r\n");
          out.write(" ");
          if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"views/scripts.js\"></script>\r\n");
          out.write("</body>\r\n");
          out.write("\t</html>\r\n");
          int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_f_005fview_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = new com.sun.faces.taglib.html_basic.FormTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fform_005f0);
    try {
      _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
      _jspx_th_h_005fform_005f0.setJspId("jsp_450731771_1");
      int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_h_005fform_005f0);
        }
        do {
          out.write("\r\n");
          out.write("\t<div class=\"main\">\r\n");
          out.write("\t\t<div class=\"navbar\">\r\n");
          out.write("\t\t\t<div class=\"icon\">\r\n");
          out.write("\t\t\t\t<h2 class=\"logo\">BSHub</h2>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"menu\">\r\n");
          out.write("\t\t\t\t<ul>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"DashBoard.jsp\">HOME</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"#\">ABOUT</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"#\">SERVICE</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"#\">DESIGN</a></li>\r\n");
          out.write("\t\t\t\t\t<li><a href=\"#\">CONTACT</a></li>\r\n");
          out.write("\t\t\t\t</ul>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"search\">\r\n");
          out.write("\t\t\t\t<input class=\"srch\" type=\"search\" name=\"\" placeholder=\"Search...\">\r\n");
          out.write("\t\t\t\t<a href=\"#\"><button class=\"btn\">Search</button></a>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<div class=\"content\">\r\n");
          out.write("\t\t\t\t<h1>Explore The World<br><span>Pedal By Pedal</span><br> Rent A Bike And Unlock<br>New Adventures</h1>\r\n");
          out.write("\t\t\t\t<p class=\"par\">Discover the joy of cycling with our convenient bike rental service. <br>Choose from a variety of high-quality bikes suited to your adventure<br>Whether it's exploring city streets or venturing off-road.<br></p>\t\r\n");
          out.write("\t\t\t\t<button class=\"cn\"><a href=\"#\">JOIN US</a></button>\t\t\r\n");
          out.write("\t\t\t<div class=\"form\">\r\n");
          out.write("\t\t\t\t<h2>Login Here</h2>\r\n");
          out.write("\t\t\t\t<label>Enter your email</label>\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_h_005finputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("<br>\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_h_005fmessage_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("<br>\r\n");
          out.write("\t\t\t\t<label>Enter your Password</label>\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_h_005finputSecret_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_h_005fmessage_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_h_005fcommandButton_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\t\r\n");
          out.write("\t\t\t\t<p class=\"link\">Don't have an account<br>\r\n");
          out.write("\t\t\t\t<a href=\"UserSignUp.jsf\">Sign up</a> here</a></p>\t\t\t\r\n");
          out.write("\t\t\t</div>\t\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fform_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f0 = new com.sun.faces.taglib.html_basic.InputTextTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005finputText_005f0);
    try {
      _jspx_th_h_005finputText_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005finputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /DashBoard.jsp(43,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_h_005finputText_005f0.setId("email");
      // /DashBoard.jsp(43,4) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005finputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(43,4) '#{user.email }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"#{user.email }",java.lang.Object.class)));
      _jspx_th_h_005finputText_005f0.setJspId("jsp_450731771_2");
      int _jspx_eval_h_005finputText_005f0 = _jspx_th_h_005finputText_005f0.doStartTag();
      if (_jspx_th_h_005finputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005finputText_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_005fmessage_005f0 = new com.sun.faces.taglib.html_basic.MessageTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fmessage_005f0);
    try {
      _jspx_th_h_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /DashBoard.jsp(44,4) name = for type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_h_005fmessage_005f0.setFor(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(44,4) 'email'",_jsp_getExpressionFactory().createValueExpression("email",java.lang.String.class)));
      // /DashBoard.jsp(44,4) name = style type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_h_005fmessage_005f0.setStyle(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(44,4) 'color: red;'",_jsp_getExpressionFactory().createValueExpression("color: red;",java.lang.String.class)));
      _jspx_th_h_005fmessage_005f0.setJspId("jsp_450731771_3");
      int _jspx_eval_h_005fmessage_005f0 = _jspx_th_h_005fmessage_005f0.doStartTag();
      if (_jspx_th_h_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fmessage_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005finputSecret_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:inputSecret
    com.sun.faces.taglib.html_basic.InputSecretTag _jspx_th_h_005finputSecret_005f0 = new com.sun.faces.taglib.html_basic.InputSecretTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005finputSecret_005f0);
    try {
      _jspx_th_h_005finputSecret_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005finputSecret_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /DashBoard.jsp(46,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_h_005finputSecret_005f0.setId("password");
      // /DashBoard.jsp(46,4) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005finputSecret_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(46,4) '#{user.passWord}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"#{user.passWord}",java.lang.Object.class)));
      // /DashBoard.jsp(46,4) name = maxlength type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = int deferredMethod = false methodSignature = null
      _jspx_th_h_005finputSecret_005f0.setMaxlength(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(46,4) '16'",_jsp_getExpressionFactory().createValueExpression("16",int.class)));
      _jspx_th_h_005finputSecret_005f0.setJspId("jsp_450731771_4");
      int _jspx_eval_h_005finputSecret_005f0 = _jspx_th_h_005finputSecret_005f0.doStartTag();
      if (_jspx_th_h_005finputSecret_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005finputSecret_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_005fmessage_005f1 = new com.sun.faces.taglib.html_basic.MessageTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fmessage_005f1);
    try {
      _jspx_th_h_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_h_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /DashBoard.jsp(47,4) name = for type = javax.el.ValueExpression reqTime = false required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_h_005fmessage_005f1.setFor(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(47,4) 'password'",_jsp_getExpressionFactory().createValueExpression("password",java.lang.String.class)));
      // /DashBoard.jsp(47,4) name = style type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_h_005fmessage_005f1.setStyle(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(47,4) 'color: red;'",_jsp_getExpressionFactory().createValueExpression("color: red;",java.lang.String.class)));
      _jspx_th_h_005fmessage_005f1.setJspId("jsp_450731771_5");
      int _jspx_eval_h_005fmessage_005f1 = _jspx_th_h_005fmessage_005f1.doStartTag();
      if (_jspx_th_h_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fmessage_005f1, _jsp_getInstanceManager(), false);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fcommandButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_005fcommandButton_005f0 = new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_h_005fcommandButton_005f0);
    try {
      _jspx_th_h_005fcommandButton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_h_005fcommandButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
      // /DashBoard.jsp(48,4) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = true methodSignature = java.lang.Object action()
      _jspx_th_h_005fcommandButton_005f0.setAction(new org.apache.jasper.el.JspMethodExpression("/DashBoard.jsp(48,4) '#{BmsImpl.Login(user) }'",_jsp_getExpressionFactory().createMethodExpression(_jspx_page_context.getELContext(),"#{BmsImpl.Login(user) }",java.lang.Object.class,new java.lang.Class[] {})));
      // /DashBoard.jsp(48,4) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_h_005fcommandButton_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(48,4) 'Login'",_jsp_getExpressionFactory().createValueExpression("Login",java.lang.Object.class)));
      // /DashBoard.jsp(48,4) name = styleClass type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_h_005fcommandButton_005f0.setStyleClass(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(48,4) 'button'",_jsp_getExpressionFactory().createValueExpression("button",java.lang.String.class)));
      // /DashBoard.jsp(48,4) name = style type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_h_005fcommandButton_005f0.setStyle(new org.apache.jasper.el.JspValueExpression("/DashBoard.jsp(48,4) 'background: #ff7200;'",_jsp_getExpressionFactory().createValueExpression("background: #ff7200;",java.lang.String.class)));
      _jspx_th_h_005fcommandButton_005f0.setJspId("jsp_450731771_6");
      int _jspx_eval_h_005fcommandButton_005f0 = _jspx_th_h_005fcommandButton_005f0.doStartTag();
      if (_jspx_th_h_005fcommandButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_h_005fcommandButton_005f0, _jsp_getInstanceManager(), false);
    }
    return false;
  }
}
