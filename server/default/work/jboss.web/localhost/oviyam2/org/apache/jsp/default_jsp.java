package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\n");
      out.write("/* ***** BEGIN LICENSE BLOCK *****\n");
      out.write("* Version: MPL 1.1/GPL 2.0/LGPL 2.1\n");
      out.write("*\n");
      out.write("* The contents of this file are subject to the Mozilla Public License Version\n");
      out.write("* 1.1 (the \"License\"); you may not use this file except in compliance with\n");
      out.write("* the License. You may obtain a copy of the License at\n");
      out.write("* http://www.mozilla.org/MPL/\n");
      out.write("*\n");
      out.write("* Software distributed under the License is distributed on an \"AS IS\" basis,\n");
      out.write("* WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License\n");
      out.write("* for the specific language governing rights and limitations under the\n");
      out.write("* License.\n");
      out.write("*\n");
      out.write("* The Original Code is part of Oviyam, an web viewer for DICOM(TM) images\n");
      out.write("* hosted at http://skshospital.net/pacs/webviewer/oviyam_0.6-src.zip\n");
      out.write("*\n");
      out.write("* The Initial Developer of the Original Code is\n");
      out.write("* Raster Images\n");
      out.write("* Portions created by the Initial Developer are Copyright (C) 2014\n");
      out.write("* the Initial Developer. All Rights Reserved.\n");
      out.write("*\n");
      out.write("* Contributor(s):\n");
      out.write("* Babu Hussain A\n");
      out.write("* Balamurugan R\n");
      out.write("* Devishree V\n");
      out.write("* Guruprasath R\n");
      out.write("* Karthikeyan S\n");
      out.write("* Meer Asgar Hussain B\n");
      out.write("* Prakash J\n");
      out.write("* Suresh V\n");
      out.write("* Yogapraveen K\n");
      out.write("*\n");
      out.write("* Alternatively, the contents of this file may be used under the terms of\n");
      out.write("* either the GNU General Public License Version 2 or later (the \"GPL\"), or\n");
      out.write("* the GNU Lesser General Public License Version 2.1 or later (the \"LGPL\"),\n");
      out.write("* in which case the provisions of the GPL or the LGPL are applicable instead\n");
      out.write("* of those above. If you wish to allow use of your version of this file only\n");
      out.write("* under the terms of either the GPL or the LGPL, and not to allow others to\n");
      out.write("* use your version of this file under the terms of the MPL, indicate your\n");
      out.write("* decision by deleting the provisions above and replace them with the notice\n");
      out.write("* and other provisions required by the GPL or the LGPL. If you do not delete\n");
      out.write("* the provisions above, a recipient may use your version of this file under\n");
      out.write("* the terms of any one of the MPL, the GPL or the LGPL.\n");
      out.write("*\n");
      out.write("* ***** END LICENSE BLOCK ***** */\n");
      out.write("-->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.html", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
