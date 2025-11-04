package com.example.web;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals("admin") && password.equals("admin123")) {
            req.setAttribute("name", name);
            RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
            rd.forward(req, resp);
        } else {
            resp.sendRedirect("error.jsp");
        }
    }
}