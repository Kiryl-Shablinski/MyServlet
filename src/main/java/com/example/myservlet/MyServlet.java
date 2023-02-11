package com.example.myservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String x = req.getParameter("x");
        String y = req.getParameter("y");
        String operation = req.getParameter("operation");

        String result =  operation(x, y, operation);
        PrintWriter pw = resp.getWriter();
        pw.println("<html><h3> Result:</h3><h2>" + result + "</h2></html>");
    }

        private String operation(String x, String y, String action){
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            switch (action){
                case "+":
                    return String.valueOf(a + b);
                case "-":
                    return String.valueOf(a - b);
                case "*":
                    return String.valueOf(a * b);
                case "/":
                    return String.format("%.2f",(double) a / b);
            }
            return null;
        }
}
