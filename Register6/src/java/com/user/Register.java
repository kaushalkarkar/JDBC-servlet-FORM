/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KAUSHAL KARKAR
 */
public class Register extends HttpServlet {

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
            out.println("<title>Servlet Register</title>");            
            out.println("</head>");
            out.println("<body>");
            
              String  firstname=request.getParameter("user_firstname");
              String  lastname=request.getParameter("user_lastname");
              String  enrollment=request.getParameter("user_enrollment");
              String  contactnumber=request.getParameter("user_contactnumber");
              String  semester=request.getParameter("user_semester");
     
            
            out.println(firstname);
            out.println(lastname);
            out.println(enrollment);
            out.println(contactnumber);
            out.println(semester);
            
            
            try
               {
             Class.forName("com.mysql.jdbc.Driver");
            
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kaushal","root","root");
              String q="insert into kk(firstname,lastname,enrollment,contactnumber,semester) values(?,?,?)";
              PreparedStatement pstmt=con.prepareStatement(q);
              pstmt.setString(1, firstname);
              pstmt.setString(2, lastname);
              pstmt.setString(3, enrollment);
              pstmt.setString(4, contactnumber);
              pstmt.setString(5, semester);         
              
              pstmt.executeUpdate();
              
              out.println("done");
              
            }catch(Exception e)
            {
                e.printStackTrace();
                out.println("error");
            }
            
            
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
        processRequest(request, response);
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
