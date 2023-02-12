package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletParameter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message =getServletContext().getInitParameter("message");
        String messageServlet = getServletConfig().getInitParameter("message");
        response.setContentType("text/html");
        try(PrintWriter pw = response.getWriter()){
            pw.println("<h3>" + message + "</h3>");
            pw.println("<h3>" + messageServlet + "</h3>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
