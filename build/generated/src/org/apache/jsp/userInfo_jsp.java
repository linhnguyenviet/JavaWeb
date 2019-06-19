package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CustomerDAO;
import model.Customer;
import java.util.ArrayList;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Structure/header.jsp");
    _jspx_dependants.add("/Structure/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"manifest\" href=\"%PUBLIC_URL%/manifest.json\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"%PUBLIC_URL%/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"./Style/NavBar.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("-->     <link href=\"./Style/HeaderImg.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("-->     <link href=\"./Style/TopHeader.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("-->     <link href=\"./Style/App.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("-->     <link href=\"./Style/BottomFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><!--<!--\n");
      out.write("-->     <link href=\"./Style/TopFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("                                                                         \n");
      out.write("-->\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"manifest\" href=\"%PUBLIC_URL%/manifest.json\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"%PUBLIC_URL%/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"./Style/App.css\" type=\"text/css\" rel=\"stylesheet\" />    \n");
      out.write("        <link href=\"./Style/NavBar.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("-->     <link href=\"./Style/HeaderImg.css\" type=\"text/css\" rel=\"stylesheet\" /><!--\n");
      out.write("-->     <link href=\"./Style/TopHeader.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"TopHeader\">\n");
      out.write("                    <div class=\"TopHeader-inner\">\n");
      out.write("                        <span>Open time 8:00 -18:00 Monday - Sunday</span>\n");
      out.write("                        <span> </span>\n");
      out.write("                        <i class=\"fab fa-facebook-f\" > </i>\n");
      out.write("                         <i class=\"fab fa-twitter\" > </i>\n");
      out.write("                         <i class=\"fab fa-linkedin-in\" > </i>\n");
      out.write("                         <i class=\"fab fa-instagram\" > </i>\n");
      out.write("                        <div class=\"TopHeader-login\"></i>\n");
      out.write("                        <i class=\"fas fa-user\"> </i><a href=\"login.jsp\">Đăng nhập</a>\n");
      out.write("                        <i class=\"fas fa-user-plus\"></i><a href=\"register.jsp\">Đăng kí</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"HeaderImg\">\n");
      out.write("                    <div class=\"HeaderImg-wrap\">\n");
      out.write("                        <img src=\"./Images/image.png\" alt=\"dfsf\" />\n");
      out.write("                        <img src=\"./Images/image2.png\" alt=\"dfd \" />\n");
      out.write("                        <div class=\"HeaderImg-wrapInner\">\n");
      out.write("                            <div class=\"HeaderImg-inner\">\n");
      out.write("                                <span> <i class=\"fas fa-phone\"> </i> HỖ TRỢ : 091270929 -091270929 </span>\n");
      out.write("                                <form action=\"/action_page.php\">\n");
      out.write("                                    <input  type=\"text\" placeholder=\"  Tìm kiếm..\" name=\"search\" /> \n");
      out.write("                                    <button>\n");
      out.write("                                        <i class=\"fa fa-search\" ></i></button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"HeaderImg-cart\">\n");
      out.write("                                 <i class=\"fas fa-shopping-basket\">  <p> Giỏ hàng <span class=\"number\">3</span></p> </i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>         \n");
      out.write("                 <div class=\"NavBar\">\n");
      out.write("                    <ul >\n");
      out.write("                        <li>\n");
      out.write("                        <i  class=\"fas fa-bars\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           TRANG CHỦ\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            GIỚI THIỆU\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"productPage\">\n");
      out.write("                           SẢN PHẨM\n");
      out.write("                           </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                           SẢN PHẨM MỚI\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            LIÊN HỆ\n");
      out.write("                        </li>\n");
      out.write("                       \n");
      out.write("                        <li class=\"search--sm\">\n");
      out.write("                            <input type=\"text\" placeholder=\"  Tìm kiếm..\" name=\"search\"  />\n");
      out.write("                            <button >\n");
      out.write("                                    </button>\n");
      out.write("                        </li>                        \n");
      out.write("                        <li class=\"search__icon\" >\n");
      out.write("                            <i  class=\"fa fa-search\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"fas fa-shopping-basket\"> <span class=\"number--sm\">3</span> </i>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"NavBar--sm\">\n");
      out.write("                    <ul >\n");
      out.write("                        <li>\n");
      out.write("                            TRANG CHỦ\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            GIỚI THIỆU\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            SẢN PHẨM\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            SẢN PHẨM MỚI\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            LIÊN HỆ\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("                <button class=\"toTop_btn\" title=\"Lên đầu trang\"> <i class=\"fas fa-arrow-up\"></i> </button>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("           ");
 
        CustomerDAO d = new CustomerDAO();
        ArrayList<Customer> pr = d.getAll();
        for(int i = 0 ; i < pr.size(); i++){
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h2 align=\"center\"> Thông tin người dùng </h1>\n");
      out.write("              <table  align=\"center\">\n");
      out.write("                  \n");
      out.write("            <tr height=\"50\">\n");
      out.write("                \n");
      out.write("                <td>Customer Name</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" value=\"");
pr.get(i).getcName();
      out.write("\" style=\"width: 500px;\">");
pr.get(i).getcName();
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr height=\"50\">\n");
      out.write("                \n");
      out.write("                <td>Phone</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" style=\"width: 500px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr height=\"50\">\n");
      out.write("                \n");
      out.write("                <td>Email</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" style=\"width: 500px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr height=\"50\">\n");
      out.write("                \n");
      out.write("                <td>Address</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" style=\"width: 500px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr height=\"50\">\n");
      out.write("                <td>Old Password</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" placeholder=\"Input your old password\" style=\"width: 500px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr height=\"50\">\n");
      out.write("                \n");
      out.write("                <td>New Password</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" placeholder=\"Inpur your new password\" style=\"width: 500px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr height=\"50\">\n");
      out.write("                \n");
      out.write("                <td>Confirm new Password</td>\n");
      out.write("                <td width=\"500\"><input type=\"text\" placeholder=\"Inpur your new password\" style=\"width: 500px;\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr height=\"50\"><td><input type=\"submit\" value=\"Update\" name=\"update\"></td><td></td></tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("       </table>\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>x\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"manifest\" href=\"%PUBLIC_URL%/manifest.json\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"%PUBLIC_URL%/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"./Style/App.css\" type=\"text/css\" rel=\"stylesheet\" />    \n");
      out.write("         <link href=\"./Style/BottomFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><!--<!--\n");
      out.write("-->     <link href=\"./Style/TopFooter.css\" type=\"text/css\" rel=\"stylesheet\" /><\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"background:#313131\">\n");
      out.write("             <div class=\"TopFooter\">\n");
      out.write("                <div>\n");
      out.write("                    <h6>KÊNH THÔNG TIN TỪ CHÚNG TÔI\n");
      out.write("            <br></br>\n");
      out.write("                        <span>\n");
      out.write("                                <i class=\"fab fa-facebook-f\" ></i>\n");
      out.write("                                <i class=\"fab fa-twitter\" ></i>\n");
      out.write("                                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                                <i class=\"fab fa-instagram\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </h6>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div  >\n");
      out.write("                    <h6>ĐĂNG KÍ NHẬN EMAIL</h6>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <form >\n");
      out.write("                        <input\n");
      out.write("                            type=\"text\"\n");
      out.write("                            placeholder=\"  Tìm kiếm..\"\n");
      out.write("                            name=\"search\"\n");
      out.write("                        />\n");
      out.write("                        <button type=\"button\">\n");
      out.write("                            <i class=\"fas fa-paper-plane\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div style=\"width:100%; background:gray;color:transparent;max-height:0.8px;margin-bottom:40px;\">a</div>\n");
      out.write("            <div class=\"BottomFooter\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"imageWrap\" >\n");
      out.write("                    <img src=\"./Images/image3.png\" alt=\"alt\"></img>\n");
      out.write("                    <span>Green Shop được thành lập từ 2019 và nhận được nhiều sự tin tưởng và nhận được \n");
      out.write("                    nhiều sự tin tưởng và nhận được nhiều sự tin tưởng</span>\n");
      out.write("                    <p><i class=\"fas fa-mobile-alt\"></i> Điện thoại : 0910212585</p>\n");
      out.write("                    <p><i class=\"fas fa-envelope\"></i> Email : linh@gmail.com</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><h5>THÔNG TIN KHÁCH HÀNG </h5></li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><h5>HỖ TRỢ DỊCH VỤ </h5></li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                    <li>> Tài khoản của tôi</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><h5>CHÍNH SÁCH ƯU ĐÃI </h5></li>\n");
      out.write("                    <li>> Giảm 10% cho khách hàng </li>\n");
      out.write("                    <li>> Giảm 10% cho khách hàng </li>\n");
      out.write("                    <li>>Giảm 10% cho khách hàng </li>\n");
      out.write("                    <li>> Giảm 10% cho khách hàng </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><h5>TIN TỨC </h5></li>\n");
      out.write("                    <li>> Tin hot</li>\n");
      out.write("                    <li>> Tin mới</li>\n");
      out.write("                    <li>> Tin hôm qua</li>\n");
      out.write("                    <li>> Tin sắp tới</li>\n");
      out.write("                </ul>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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