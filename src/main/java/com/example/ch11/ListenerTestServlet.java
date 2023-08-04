package com.example.ch11;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/ListenerTestServlet")
public class ListenerTestServlet extends HttpServlet {
    private static final long serialVersionID = 1L;
    ServletContext sc;
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        sc = getServletContext();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sc.setAttribute("name","김채림");
        HttpSession s = request.getSession();
        s.setAttribute("ssName",s.getId()+":세션 속성 저장");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
