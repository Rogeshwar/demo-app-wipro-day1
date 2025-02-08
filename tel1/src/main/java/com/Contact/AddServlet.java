package com.Contact;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/formServlet")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Set attributes to pass data to JSP
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("message", message);

        // Forward the request to response.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("response.jsp");
        dispatcher.forward(request, response);
    }
}