package com.blueteam.bluequiz.config;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class AppConfigTest {

    @Autowired
    private MockMvc mvc;

    @SneakyThrows
    @Test
    void corsFilter() {

<<<<<<< HEAD
=======
        MvcResult result = mvc
                .perform(get("/users/all"))
                .andExpect(status().isOk())
                .andExpect(header().string("Access-Control-Allow-Origin", "*"))
                .andExpect(header().string("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE"))
                .andExpect(header().string("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, X-Auth-Token, X-Csrf-Token, WWW-Authenticate, Authorization"))
                .andExpect(header().string("Access-Control-Expose-Headers", "custom-token1, custom-token2"))
                .andExpect(header().string("Access-Control-Allow-Credentials", "false"))
                .andExpect(header().string("Access-Control-Max-Age", "3600"))
                .andDo(print())
                .andReturn();

        MockHttpServletResponse mockResponse = result.getResponse();

        assertThat(mockResponse.getContentType()).contains("application/json;charset=UTF-8");

        Collection<String> responseHeaders = mockResponse.getHeaderNames();
        assertThat(responseHeaders).isNotNull();
        assertThat(1).isEqualTo(1);
        assertThat(responseHeaders.size()).isBetween(5, 15);
>>>>>>> origin/master
    }
}
