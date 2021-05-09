package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Part;
import com.novi.eindwerkstuk.repository.ActionRepository;
import com.novi.eindwerkstuk.repository.PartRepository;
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
class PartServiceImplTest {

    @Autowired
    private PartService partService;

    @MockBean
    private PartRepository partRepository;

    @Mock
    Part part;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        part = new Part("achterlamp", 30, "achterlamp", 30);

        Mockito
                .when(partRepository.findAllById(Collections.singleton(part.getPart_id())))
                .thenReturn((List<Part>) part);

        int id = 1;
        int expected = 1;

        Part found = partService.getPartById(id);

        assertEquals(expected, found.getPart_id());
    }
}