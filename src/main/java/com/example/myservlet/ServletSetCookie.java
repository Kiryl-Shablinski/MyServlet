package com.example.myservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SetCookie", value = "/SetCookie")
public class ServletSetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try(PrintWriter pw = response.getWriter()){
                response.addCookie(new Cookie("user","Kiryl"));
                pw.println("Cookie is set");
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
