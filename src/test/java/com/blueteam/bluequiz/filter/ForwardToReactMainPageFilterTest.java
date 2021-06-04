package com.blueteam.bluequiz.filter;

import org.junit.jupiter.api.Test;

import javax.servlet.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ForwardToReactMainPageFilterTest {
    ForwardToReactMainPageFilter f;
    @Test
    void init() {
        f = new ForwardToReactMainPageFilter();
    }

    @Test
    void destroy() {
    }

    @Test
    void doFilter() throws IOException, ServletException {
        f = new ForwardToReactMainPageFilter();
        ServletRequest request = null;
        ServletResponse response = null;
        FilterChain chain = null;
        //f.doFilter(request, response, chain);
    }
}
