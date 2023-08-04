package com.example.ch11;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class EncodingFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;

        if(httpReq.getMethod().equalsIgnoreCase("utf-8")){
            request.setCharacterEncoding("utf-8");
        }
        chain.doFilter(request,response);
    }

    public void destroy() {
    }

}
