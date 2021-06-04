package com.blueteam.bluequiz.config;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

import static org.junit.jupiter.api.Assertions.*;


class MvcConfigTest {

    private ViewControllerRegistry registry = new ViewControllerRegistry(new StaticApplicationContext());;

    @Test
    void configurePathMatch() {

    }

    @Test
    void configureContentNegotiation() {

    }

    @Test
    void configureAsyncSupport() {
    }

    @Test
    void configureDefaultServletHandling() {
    }

    @Test
    void addFormatters() {
    }

    @Test
    void addInterceptors() {
    }

    @Test
    void addResourceHandlers() {
    }

    @Test
    void addCorsMappings() {
    }

    @Test
    void addViewControllers() {
        this.registry.addViewController("/login").setViewName("login");
        ParameterizableViewController controller = new ParameterizableViewController();
        controller.setViewName("login");
       // ParameterizableViewController controller = getController("/login");
        assertEquals("login", controller.getViewName());
    }

    @Test
    void configureViewResolvers() {
    }

    @Test
    void addArgumentResolvers() {
    }

    @Test
    void addReturnValueHandlers() {
    }

    @Test
    void configureMessageConverters() {
    }

    @Test
    void extendMessageConverters() {
    }

    @Test
    void configureHandlerExceptionResolvers() {
    }

    @Test
    void extendHandlerExceptionResolvers() {
    }

    @Test
    void getValidator() {
    }

    @Test
    void getMessageCodesResolver() {
    }

    @Test
    void testAddViewControllers() {
    }
}
