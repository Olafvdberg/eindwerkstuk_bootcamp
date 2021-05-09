package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Reperation;
import com.novi.eindwerkstuk.service.ActionService;
import com.novi.eindwerkstuk.service.ReperationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = {EindwerkstukApplication.class})
class ReperationControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private ReperationService reperationService;

    @Test
    public void testEndpointReperation() throws Exception {
        Reperation reperation = new Reperation("5 mei 2021", "gedaan");

        List<Reperation> allReperation = Arrays.asList(reperation);

        given(reperationService.getAllReperations()).willReturn(allReperation);

        mvc.perform(get("/reperation")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect((ResultMatcher) jsonPath("$[0].reperation_date", is(reperation.getReperation_date())));


    }

}