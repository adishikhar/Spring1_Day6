package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Redirecting to another website
        resp.sendRedirect("https://www.google.com");
    }
}
