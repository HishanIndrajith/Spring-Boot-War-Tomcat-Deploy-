package com.hishan.weapplications.webapplication1.controllers;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.hishan.webapplications.webapplication1.ApplicationStarter;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(classes = ApplicationStarter.class)
@AutoConfigureMockMvc
class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void getStudent() throws Exception {
        int id = 1;
        mvc.perform(MockMvcRequestBuilders.get("/api/students/" + id).accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hishan Indrajith : " + id)));
    }
}
