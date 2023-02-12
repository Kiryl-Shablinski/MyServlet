package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.setContentType("text/html");
       try(PrintWriter pw = resp.getWriter()) {
           if (id != null) {
               pw.println("<html> <h2>Id: " + id + "</h2></html>");
           } else {
               String path = "/NotFoundServlet";
               ServletContext context = getServletContext();
               RequestDispatcher dispatcher = context.getRequestDispatcher(path);
               dispatcher.forward(req, resp);
           }
       }
    }
}
