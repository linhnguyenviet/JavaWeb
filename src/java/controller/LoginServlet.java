package controller;

import dao.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;

/**
 *
 * @author Tiny
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CustomerDAO cus = new CustomerDAO();
        String password = request.getParameter("password");

        String email=request.getParameter("email");  

        if (email != null && email.trim().length() > 0 && password != null && password.trim().length() > 0) {
          System.out.println(email + ":" + password);
          boolean success = controller.Auth.authenticate(email.trim(), password.trim());
          if (success) {
            if (request.getParameter("remember") != null) {
              String remember = request.getParameter("remember");
              System.out.println("remember : " + remember);
              Cookie cEmail = new Cookie("cookemail", email.trim());
              Cookie cName = new Cookie("cookname", cus.getNameLogin(email.trim()));
              Cookie cPassword = new Cookie("cookpass", email.trim());
              Cookie cRemember = new Cookie("cookrem", remember.trim());
              cEmail.setMaxAge(60 * 60 * 24 * 15);//15 days
              cName.setMaxAge(60 * 60 * 24 * 15);
              cPassword.setMaxAge(60 * 60 * 24 * 15);
              cRemember.setMaxAge(60 * 60 * 24 * 15);
              response.addCookie(cEmail);
              response.addCookie(cName);
              response.addCookie(cPassword);
              response.addCookie(cRemember);
            }
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("sessuser", cus.getNameLogin(email.trim()));



            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("/header.jsp");
            requestDispatcher.forward(request, response);
          } else {
            System.out.println("Email and password invalid.");
            request.setAttribute("msg", "Email and password invalid.");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(request, response);
          }
        } else {
          System.out.println("Email and Password are required fields.");
          request.setAttribute("msg", "Email and Password are required fields.");
          RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
          requestDispatcher.forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}