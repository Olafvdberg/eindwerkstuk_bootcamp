package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Reperation;
import com.novi.eindwerkstuk.repository.ActionRepository;
import com.novi.eindwerkstuk.repository.ReperationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {EindwerkstukApplication.class})
class ReperationServiceImplTest {

    @Autowired
    private ReperationService reperationService;

    @MockBean
    private ReperationRepository reperationRepository;

    @Mock
    Reperation reperation;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        reperation = new Reperation("5 mei 2021", "gedaan");

        Mockito
                .when(reperationRepository.findAllById(Collections.singleton(reperation.getReperation_id())))
                .thenReturn((List<Reperation>) reperation);

        int id = 1;
        int expected = 1;

        Reperation found = reperationService.getReperationById(id);

        assertEquals(expected, found.getReperation_id());
    }
}