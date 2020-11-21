package com.bdqn.cwg_webpages.component;

import javafx.beans.binding.When;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Cookie[] cookies = ((HttpServletRequest) servletRequest).getCookies();
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                if (null != cookie.getName() && null != cookie.getValue()) {
                    filterChain.doFilter(servletRequest, servletResponse);
                } else {
                    ((HttpServletResponse) servletResponse).sendRedirect("/index.html");
                }
            }
        }
    }

    @Override
    public void destroy() {

    }
}
