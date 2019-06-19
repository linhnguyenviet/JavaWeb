/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import dao.*;
import javafx.scene.control.Alert;

/**
 *
 * @author Admin
 */
public class register extends HttpServlet {

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
            out.println("<title>Servlet register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        
        
        
        Customer cus = new Customer(3,name,email,password,contact,address,address);
        CustomerDAO c = new CustomerDAO();
        if(name.isEmpty() || email.isEmpty() || password.isEmpty() || cpassword.isEmpty() || address.isEmpty() || contact.isEmpty()){
            String mess = "All inputs must be filled in";
            request.setAttribute("MESS", mess);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(c.checkEmail(email)){
            String mess = "Email existed";
            request.setAttribute("MESS", mess);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(c.checkPhone(contact)){
            String mess = "Phone existed";
            request.setAttribute("MESS", mess);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(contact.length() != 10){
            String mess = "Phone number must be 10 digits";
            request.setAttribute("MESS", mess);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(password.length() < 7){
            String mess = "Password must greater 6 characters";
            request.setAttribute("MESS", mess);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else{
            String mess = "Add success!!!";
            request.setAttribute("MESS", mess);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            c.insertUser(cus);
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