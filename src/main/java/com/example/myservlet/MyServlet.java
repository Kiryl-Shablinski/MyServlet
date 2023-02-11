package com.example.myservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;


@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String number = request.getParameter("number");
       String result = increase(number);
        pw.println("<html>");
        pw.println("<h2>Increasing number: " + number + "<br>Result: "+ result + "</h2>");
        pw.println("</html>");
    }

    private String increase(String number){
        return number !=null ? String.valueOf(Integer.parseInt(number) * 2) : null;
    }
}
